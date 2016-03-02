package com.wantdo.common.utils;

import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersException;
import com.amazonservices.mws.orders._2013_09_01.model.*;
import com.wantdo.business.entity.OrderEntity;
import com.wantdo.business.service.order.OrderFromAmazonBusiness;
import com.wantdo.common.base.AmazonClientFactory;
import com.wantdo.common.convert.AmazonOrder2Orderinfo;
import com.wantdo.common.convert.AmazonOrderItem2Orderitem;
import com.wantdo.data.entity.Orderinfo;
import com.wantdo.data.entity.Orderitem;
import com.wantdo.data.mapper.OrderinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class AmazonUtils {

    public static String SELLER_ID = "A3HMDV7X1TM88T";
    public static String MWS_AUTH_TOKEN = "7661-4415-2119";
    public static String MARKETPLACEID = "A2EUQ1WTGCTBG2";

    private static Logger logger = LoggerFactory.getLogger(AmazonUtils.class);

    public static void getOrderTask(){
        OrderinfoMapper oim = ServiceUtils.getService(OrderinfoMapper.class);
        OrderFromAmazonBusiness ofb = ServiceUtils.getService(OrderFromAmazonBusiness.class);

        GetServiceStatusResponse response = getOrderApiStatus();

        if (response.getGetServiceStatusResult().getStatus().equals("RED") ||
                response.getGetServiceStatusResult().getStatus().equals("YELLOW")){
            logger.error("api unavailable");
            return;
        }

        ListOrdersRequest orderRequest = getOrderRequest();
        XMLGregorianCalendar xgc =response.getGetServiceStatusResult().getTimestamp();
        GregorianCalendar cal = xgc.toGregorianCalendar();
        cal.add(GregorianCalendar.MONTH, -4);
        XMLGregorianCalendar createdAfter = MwsUtl.getDTF().newXMLGregorianCalendar(cal);
        orderRequest.setCreatedAfter(createdAfter);
        GregorianCalendar be = xgc.toGregorianCalendar();
        be.add(GregorianCalendar.MONTH, -3);
        XMLGregorianCalendar createdBefore = MwsUtl.getDTF().newXMLGregorianCalendar(cal);

        ListOrdersResponse orderlist = listOrders(orderRequest);

        String nextToken = orderlist.getListOrdersResult().getNextToken();
        List<Order> list = orderlist.getListOrdersResult().getOrders();
        logger.info(nextToken);
        logger.info("order number is :" + list.size());

        boolean hasNextPage = orderlist.getListOrdersResult().isSetNextToken();

        while (list.size() > 0 || hasNextPage){
            for(int i = 0; i<list.size(); i++){
                Orderinfo oi = AmazonOrder2Orderinfo.convert(list.get(i));

                int flag = ofb.checkOrderStatus(oi.getExternalid(), oi.getSellerid(), oi.getOrderstatus());
                if (flag == 1){
                    logger.info("update: " + oi.getExternalid());
                    ofb.updateOrderinfo(oi);
                }
                if (flag == 0) {
                    logger.info("add: " + oi.getExternalid() );
                    addNewAmazonOrders(ofb, oi);
                }
            }

            if (hasNextPage){
                sleepAfterListOrders();

                ListOrdersByNextTokenRequest nextOrderRequest = new ListOrdersByNextTokenRequest();
                nextOrderRequest.setSellerId(SELLER_ID);
                nextOrderRequest.setMWSAuthToken(MWS_AUTH_TOKEN);
                nextOrderRequest.setNextToken(nextToken);
                ListOrdersByNextTokenResponse nextOrders = listNextOrders(nextOrderRequest);
                nextToken = nextOrders.getListOrdersByNextTokenResult().getNextToken();
                list = nextOrders.getListOrdersByNextTokenResult().getOrders();
                hasNextPage = nextOrders.getListOrdersByNextTokenResult().isSetNextToken();
                logger.info(nextToken);
                logger.info("order number is: " + list.size());
            } else {
                list.clear();
            }
        }

    }

    private static void addNewAmazonOrders(OrderFromAmazonBusiness ofb, Orderinfo oi) {
        oi.setSellerid(SELLER_ID);
        oi.setCreateon(new Date());
        oi.setCreateby(0);

        List<Orderitem> itemlist = new ArrayList<>();
        ListOrderItemsRequest itemRequest = getOrderItemRequest(oi.getExternalid());
        ListOrderItemsResponse itemsResponse = listOrderItems(itemRequest);
        sleepAfterListItems();
        List<OrderItem> items = itemsResponse.getListOrderItemsResult().getOrderItems();
        for(int j=0; j<items.size(); j++){
            Orderitem item = AmazonOrderItem2Orderitem.convert(items.get(j));
            item.setOrderid(oi.getId());
            itemlist.add(item);
        }

        OrderEntity oe = new OrderEntity();
        oe.setOrderinfo(oi);
        oe.setOrderitems(itemlist);

        try {
            ofb.insertOrderEntity(oe);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sleepAfterListItems() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    private static ListOrderItemsResponse listOrderItems(ListOrderItemsRequest request) {
        try {
            ListOrderItemsResponse response = AmazonUtils.getOrderApiClient().listOrderItems(request);
            return response;
        } catch (Exception ex1) {
            sleepAfterClientException();
            try {
                ListOrderItemsResponse response = AmazonUtils.getOrderApiClient().listOrderItems(request);
                return response;
            } catch (MarketplaceWebServiceOrdersException ex2) {
                sleepAfterClientException();
                try {
                    ListOrderItemsResponse response = AmazonUtils.getOrderApiClient().listOrderItems(request);
                    return response;
                } catch (MarketplaceWebServiceOrdersException ex3) {
                    sleepAfterClientException();
                    try {
                        ListOrderItemsResponse response = AmazonUtils.getOrderApiClient().listOrderItems(request);
                        return response;
                    } catch (MarketplaceWebServiceOrdersException ex4) {
                        sleepAfterClientException();
                        try {
                            ListOrderItemsResponse response = AmazonUtils.getOrderApiClient().listOrderItems(request);
                            return response;
                        } catch (MarketplaceWebServiceOrdersException ex5) {
                            throw ex5;
                        }
                    }
                }
            }
        }
    }

    private static ListOrderItemsRequest getOrderItemRequest(String orderId) {
        ListOrderItemsRequest request = new ListOrderItemsRequest();
        String sellerId = SELLER_ID;
        request.setSellerId(sellerId);
        String mwsAuthToken = MWS_AUTH_TOKEN;
        request.setMWSAuthToken(mwsAuthToken);
        String amazonOrderId = orderId;
        request.setAmazonOrderId(amazonOrderId);
        return request;
    }

    private static ListOrdersByNextTokenResponse listNextOrders(ListOrdersByNextTokenRequest request) {
        try {
            ListOrdersByNextTokenResponse response = AmazonUtils.getOrderApiClient().listOrdersByNextToken(request);
            return response;
        } catch (MarketplaceWebServiceOrdersException ex1) {
            sleepAfterClientException();
            try {
                ListOrdersByNextTokenResponse response = AmazonUtils.getOrderApiClient().listOrdersByNextToken(request);
                return response;
            } catch (MarketplaceWebServiceOrdersException ex2) {
                sleepAfterClientException();
                try {
                    ListOrdersByNextTokenResponse response = AmazonUtils.getOrderApiClient().listOrdersByNextToken(request);
                    return response;
                } catch (MarketplaceWebServiceOrdersException ex3) {
                    sleepAfterClientException();
                    try {
                        ListOrdersByNextTokenResponse response = AmazonUtils.getOrderApiClient().listOrdersByNextToken(request);
                        return response;
                    } catch (MarketplaceWebServiceOrdersException ex4) {
                        sleepAfterClientException();
                        try {
                            ListOrdersByNextTokenResponse response = AmazonUtils.getOrderApiClient().listOrdersByNextToken(request);
                            return response;
                        } catch (MarketplaceWebServiceOrdersException ex5) {
                            throw ex5;
                        }
                    }
                }
            }
        }
    }

    private static void sleepAfterListOrders() {
        sleepAfterClientException();
    }

    private static void sleepAfterClientException() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static ListOrdersRequest getOrderRequest() {
        ListOrdersRequest request = new ListOrdersRequest();
        String sellerId = SELLER_ID;
        request.setSellerId(sellerId);
        String mwsAuthToken = MWS_AUTH_TOKEN;
        request.setMWSAuthToken(mwsAuthToken);
        List<String> marketplaceId = new ArrayList<>();
        marketplaceId.add(MARKETPLACEID);
        request.setMarketplaceId(marketplaceId);
        return request;
    }

    public static GetServiceStatusResponse getOrderApiStatus() {
        try {
            GetServiceStatusResponse response = getOrderApiClient().getServiceStatus(getOrderStatusRequest());
            return response;
        } catch (MarketplaceWebServiceOrdersException e) {
            throw e;
        }
    }

    public static GetServiceStatusRequest getOrderStatusRequest() {
        GetServiceStatusRequest request = new GetServiceStatusRequest();
        String sellerId = SELLER_ID;
        request.setSellerId(sellerId);
        String mwsAuthToken = MWS_AUTH_TOKEN;
        request.setMWSAuthToken(mwsAuthToken);
        return request;
    }

    public static MarketplaceWebServiceOrdersClient getOrderApiClient(){
        return AmazonClientFactory.getOrderClient();
    }

    public static ListOrdersResponse listOrders(ListOrdersRequest request){
        try {
            ListOrdersResponse response = AmazonUtils.getOrderApiClient().listOrders(request);
            return response;
        } catch (MarketplaceWebServiceOrdersException e) {
            throw e;
        }
    }


}
