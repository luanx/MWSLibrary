package com.wantdo.common.convert;

import com.amazonservices.mws.orders._2013_09_01.model.Order;
import com.wantdo.common.utils.JsonUtils;
import com.wantdo.data.entity.Orderinfo;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class AmazonOrder2Orderinfo {

    /**
     * @param order
     * @return
     */
    public static Orderinfo convert(Order order) {
        Orderinfo oi = new Orderinfo();
        oi.setOrderid(order.getSellerOrderId());
        oi.setExternalid(order.getAmazonOrderId());
        if (null != order.getPurchaseDate()) {
            oi.setPurchasedate(order.getPurchaseDate().toGregorianCalendar().getTime());
        }
        if (null != order.getLastUpdateDate()) {
            oi.setLastupdatedate(order.getLastUpdateDate().toGregorianCalendar().getTime());
        }
        oi.setOrderstatus(order.getOrderStatus());
        oi.setFulfillmentchannel(order.getFulfillmentChannel());
        oi.setSaleschannel(order.getSalesChannel());
        oi.setOrderchannel(order.getOrderChannel());
        oi.setShipservicelevel(order.getShipmentServiceLevelCategory());
        if (null != order.getShippingAddress()) {
            oi.setShipname(order.getShippingAddress().getName());
            oi.setAddressline1(order.getShippingAddress().getAddressLine1());
            oi.setAddressline2(order.getShippingAddress().getAddressLine2());
            oi.setAddressline3(order.getShippingAddress().getAddressLine3());
            oi.setCity(order.getShippingAddress().getCity());
            oi.setCounty(order.getShippingAddress().getCounty());
            oi.setDistrict(order.getShippingAddress().getDistrict());
            oi.setStateorregion(order.getShippingAddress().getStateOrRegion());
            oi.setPostalcode(order.getShippingAddress().getPostalCode());
            oi.setCountrycode(order.getShippingAddress().getCountryCode());
            oi.setPhone(order.getShippingAddress().getPhone());
        }
        if (null != order.getOrderTotal()) {
            oi.setTotal(order.getOrderTotal().getAmount());
            oi.setCurrencycode(order.getOrderTotal().getCurrencyCode());
        }
        oi.setPaymentmethod(order.getPaymentMethod());
        oi.setNumberofitemsunshipped(order.getNumberOfItemsUnshipped());
        oi.setNumberofitemsshipped(order.getNumberOfItemsShipped());
        oi.setPaymentexecutiondetail(JsonUtils.getJson4List(order.getPaymentExecutionDetail()));
        oi.setMarketplaceid(order.getMarketplaceId());
        oi.setBuyername(order.getBuyerName());
        oi.setBuyeremail(order.getBuyerEmail());
        oi.setShipmentservicelevelcategory(order.getShipmentServiceLevelCategory());
        oi.setShippedbyamazontfm("" + order.getShippedByAmazonTFM());
        oi.setTfmshipmentstatus(order.getTFMShipmentStatus());
        oi.setCbadisplayableshippinglabel(order.getCbaDisplayableShippingLabel());
        oi.setOrdertype(order.getOrderType());
        if (null != order.getEarliestDeliveryDate()) {
            oi.setEarliestdeliverydate(order.getEarliestDeliveryDate().toGregorianCalendar().getTime());
        }
        if (null != order.getEarliestShipDate()) {
            oi.setEarliestshipdate(order.getEarliestShipDate().toGregorianCalendar().getTime());
        }
        if (null != order.getLatestDeliveryDate()) {
            oi.setLatestdeliverydate(order.getLatestDeliveryDate().toGregorianCalendar().getTime());
        }
        if (null != order.getLatestShipDate()) {
            oi.setLatestshipdate(order.getLatestShipDate().toGregorianCalendar().getTime());
        }
        return oi;
    }
}
