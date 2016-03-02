package com.wantdo.common.convert;


import com.amazonservices.mws.orders._2013_09_01.model.OrderItem;
import com.wantdo.common.utils.JsonUtils;
import com.wantdo.data.entity.Orderitem;

public class AmazonOrderItem2Orderitem {

	public static Orderitem convert(OrderItem oi){
		Orderitem it = new Orderitem();
		
		it.setAsin(oi.getASIN());
		it.setSellersku(oi.getSellerSKU());
		it.setOrderitemid(oi.getOrderItemId());
		it.setTitle(oi.getTitle());
		it.setQuantityordered(oi.getQuantityOrdered());
		it.setQuantityshipped(oi.getQuantityShipped());
		if(null != oi.getItemPrice()){
			it.setItemcurrencycode(oi.getItemPrice().getCurrencyCode());
			it.setItemamount(oi.getItemPrice().getAmount());
		}
		if(null != oi.getShippingPrice()){
			it.setShippingcurrencycode(oi.getShippingPrice().getCurrencyCode());
			it.setShippingamount(oi.getShippingPrice().getAmount());
		}
		if(null != oi.getGiftWrapPrice()){
			it.setGiftwrapcurrencycode(oi.getGiftWrapPrice().getCurrencyCode());
			it.setGiftwrapamount(oi.getGiftWrapPrice().getAmount());
		}
		if(null != oi.getItemPrice()){
			it.setItemcurrencycode(oi.getItemPrice().getCurrencyCode());
			it.setItemamount(oi.getItemPrice().getAmount());
		}
		if(null != oi.getShippingPrice()){
			it.setShippingtaxcurrencycode(oi.getShippingPrice().getCurrencyCode());
			it.setShippingtaxamount(oi.getShippingPrice().getAmount());
		}
		if(null != oi.getGiftWrapTax()){
			it.setGiftwraptaxcurrencycode(oi.getGiftWrapTax().getCurrencyCode());
			it.setGiftwraptaxamount(oi.getGiftWrapTax().getAmount());
		}
		if(null != oi.getShippingDiscount()){
			it.setShippingdiscountcurrencycode(oi.getShippingDiscount().getCurrencyCode());
			it.setShippingdiscountamount(oi.getShippingDiscount().getAmount());
		}
		if(null != oi.getPromotionDiscount()){
			it.setPromotiondiscountcurrencycode(oi.getPromotionDiscount().getCurrencyCode());
			it.setPromotiondiscountamount(oi.getPromotionDiscount().getAmount());
		}
		it.setPromotionids(JsonUtils.getJson4List(oi.getPromotionIds()));
		if(null != oi.getCODFee()){
			it.setCodfeecurrencycode(oi.getCODFee().getCurrencyCode());
			it.setCodfeeamount(oi.getCODFee().getAmount());
		}
		if(null != oi.getCODFee()){
			it.setCodfeediscountcurrencycode(oi.getCODFeeDiscount().getCurrencyCode());
			it.setCodfeediscountamount(oi.getCODFeeDiscount().getAmount());
		}
		it.setGiftmessagetext(oi.getGiftMessageText());
		it.setGiftwraplevel(oi.getGiftWrapLevel());
		it.setConditionnote(oi.getConditionNote());
		it.setConditionid(oi.getConditionId());
		it.setConditionsubtypeid(oi.getConditionSubtypeId());
//		it.setScheduleddeliverystartdate(DatatypeConverter.parseDateTime(oi.getScheduledDeliveryStartDate()).getTime());
//		it.setScheduleddeliveryenddate(DatatypeConverter.parseDateTime(oi.getScheduledDeliveryEndDate()).getTime());
//		System.out.println(oi.getScheduledDeliveryStartDate().toString());
		return it;
	}
}
