package com.wantdo.data.entity;

import java.util.Date;

public class Orderitem {
    private Integer id;

    private Integer orderid;

    private String asin;

    private String sellersku;

    private String orderitemid;

    private String title;

    private Integer quantityordered;

    private Integer quantityshipped;

    private String itemcurrencycode;

    private String itemamount;

    private String shippingcurrencycode;

    private String shippingamount;

    private String giftwrapcurrencycode;

    private String giftwrapamount;

    private String itemtaxcurrencycode;

    private String itemtaxamount;

    private String shippingtaxcurrencycode;

    private String shippingtaxamount;

    private String giftwraptaxcurrencycode;

    private String giftwraptaxamount;

    private String shippingdiscountcurrencycode;

    private String shippingdiscountamount;

    private String promotiondiscountcurrencycode;

    private String promotiondiscountamount;

    private String promotionids;

    private String codfeecurrencycode;

    private String codfeeamount;

    private String codfeediscountcurrencycode;

    private String codfeediscountamount;

    private String giftmessagetext;

    private String giftwraplevel;

    private String conditionnote;

    private String conditionid;

    private String conditionsubtypeid;

    private Date scheduleddeliverystartdate;

    private Date scheduleddeliveryenddate;

    private String itemstatus;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin == null ? null : asin.trim();
    }

    public String getSellersku() {
        return sellersku;
    }

    public void setSellersku(String sellersku) {
        this.sellersku = sellersku == null ? null : sellersku.trim();
    }

    public String getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid == null ? null : orderitemid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getQuantityordered() {
        return quantityordered;
    }

    public void setQuantityordered(Integer quantityordered) {
        this.quantityordered = quantityordered;
    }

    public Integer getQuantityshipped() {
        return quantityshipped;
    }

    public void setQuantityshipped(Integer quantityshipped) {
        this.quantityshipped = quantityshipped;
    }

    public String getItemcurrencycode() {
        return itemcurrencycode;
    }

    public void setItemcurrencycode(String itemcurrencycode) {
        this.itemcurrencycode = itemcurrencycode == null ? null : itemcurrencycode.trim();
    }

    public String getItemamount() {
        return itemamount;
    }

    public void setItemamount(String itemamount) {
        this.itemamount = itemamount == null ? null : itemamount.trim();
    }

    public String getShippingcurrencycode() {
        return shippingcurrencycode;
    }

    public void setShippingcurrencycode(String shippingcurrencycode) {
        this.shippingcurrencycode = shippingcurrencycode == null ? null : shippingcurrencycode.trim();
    }

    public String getShippingamount() {
        return shippingamount;
    }

    public void setShippingamount(String shippingamount) {
        this.shippingamount = shippingamount == null ? null : shippingamount.trim();
    }

    public String getGiftwrapcurrencycode() {
        return giftwrapcurrencycode;
    }

    public void setGiftwrapcurrencycode(String giftwrapcurrencycode) {
        this.giftwrapcurrencycode = giftwrapcurrencycode == null ? null : giftwrapcurrencycode.trim();
    }

    public String getGiftwrapamount() {
        return giftwrapamount;
    }

    public void setGiftwrapamount(String giftwrapamount) {
        this.giftwrapamount = giftwrapamount == null ? null : giftwrapamount.trim();
    }

    public String getItemtaxcurrencycode() {
        return itemtaxcurrencycode;
    }

    public void setItemtaxcurrencycode(String itemtaxcurrencycode) {
        this.itemtaxcurrencycode = itemtaxcurrencycode == null ? null : itemtaxcurrencycode.trim();
    }

    public String getItemtaxamount() {
        return itemtaxamount;
    }

    public void setItemtaxamount(String itemtaxamount) {
        this.itemtaxamount = itemtaxamount == null ? null : itemtaxamount.trim();
    }

    public String getShippingtaxcurrencycode() {
        return shippingtaxcurrencycode;
    }

    public void setShippingtaxcurrencycode(String shippingtaxcurrencycode) {
        this.shippingtaxcurrencycode = shippingtaxcurrencycode == null ? null : shippingtaxcurrencycode.trim();
    }

    public String getShippingtaxamount() {
        return shippingtaxamount;
    }

    public void setShippingtaxamount(String shippingtaxamount) {
        this.shippingtaxamount = shippingtaxamount == null ? null : shippingtaxamount.trim();
    }

    public String getGiftwraptaxcurrencycode() {
        return giftwraptaxcurrencycode;
    }

    public void setGiftwraptaxcurrencycode(String giftwraptaxcurrencycode) {
        this.giftwraptaxcurrencycode = giftwraptaxcurrencycode == null ? null : giftwraptaxcurrencycode.trim();
    }

    public String getGiftwraptaxamount() {
        return giftwraptaxamount;
    }

    public void setGiftwraptaxamount(String giftwraptaxamount) {
        this.giftwraptaxamount = giftwraptaxamount == null ? null : giftwraptaxamount.trim();
    }

    public String getShippingdiscountcurrencycode() {
        return shippingdiscountcurrencycode;
    }

    public void setShippingdiscountcurrencycode(String shippingdiscountcurrencycode) {
        this.shippingdiscountcurrencycode = shippingdiscountcurrencycode == null ? null : shippingdiscountcurrencycode.trim();
    }

    public String getShippingdiscountamount() {
        return shippingdiscountamount;
    }

    public void setShippingdiscountamount(String shippingdiscountamount) {
        this.shippingdiscountamount = shippingdiscountamount == null ? null : shippingdiscountamount.trim();
    }

    public String getPromotiondiscountcurrencycode() {
        return promotiondiscountcurrencycode;
    }

    public void setPromotiondiscountcurrencycode(String promotiondiscountcurrencycode) {
        this.promotiondiscountcurrencycode = promotiondiscountcurrencycode == null ? null : promotiondiscountcurrencycode.trim();
    }

    public String getPromotiondiscountamount() {
        return promotiondiscountamount;
    }

    public void setPromotiondiscountamount(String promotiondiscountamount) {
        this.promotiondiscountamount = promotiondiscountamount == null ? null : promotiondiscountamount.trim();
    }

    public String getPromotionids() {
        return promotionids;
    }

    public void setPromotionids(String promotionids) {
        this.promotionids = promotionids == null ? null : promotionids.trim();
    }

    public String getCodfeecurrencycode() {
        return codfeecurrencycode;
    }

    public void setCodfeecurrencycode(String codfeecurrencycode) {
        this.codfeecurrencycode = codfeecurrencycode == null ? null : codfeecurrencycode.trim();
    }

    public String getCodfeeamount() {
        return codfeeamount;
    }

    public void setCodfeeamount(String codfeeamount) {
        this.codfeeamount = codfeeamount == null ? null : codfeeamount.trim();
    }

    public String getCodfeediscountcurrencycode() {
        return codfeediscountcurrencycode;
    }

    public void setCodfeediscountcurrencycode(String codfeediscountcurrencycode) {
        this.codfeediscountcurrencycode = codfeediscountcurrencycode == null ? null : codfeediscountcurrencycode.trim();
    }

    public String getCodfeediscountamount() {
        return codfeediscountamount;
    }

    public void setCodfeediscountamount(String codfeediscountamount) {
        this.codfeediscountamount = codfeediscountamount == null ? null : codfeediscountamount.trim();
    }

    public String getGiftmessagetext() {
        return giftmessagetext;
    }

    public void setGiftmessagetext(String giftmessagetext) {
        this.giftmessagetext = giftmessagetext == null ? null : giftmessagetext.trim();
    }

    public String getGiftwraplevel() {
        return giftwraplevel;
    }

    public void setGiftwraplevel(String giftwraplevel) {
        this.giftwraplevel = giftwraplevel == null ? null : giftwraplevel.trim();
    }

    public String getConditionnote() {
        return conditionnote;
    }

    public void setConditionnote(String conditionnote) {
        this.conditionnote = conditionnote == null ? null : conditionnote.trim();
    }

    public String getConditionid() {
        return conditionid;
    }

    public void setConditionid(String conditionid) {
        this.conditionid = conditionid == null ? null : conditionid.trim();
    }

    public String getConditionsubtypeid() {
        return conditionsubtypeid;
    }

    public void setConditionsubtypeid(String conditionsubtypeid) {
        this.conditionsubtypeid = conditionsubtypeid == null ? null : conditionsubtypeid.trim();
    }

    public Date getScheduleddeliverystartdate() {
        return scheduleddeliverystartdate;
    }

    public void setScheduleddeliverystartdate(Date scheduleddeliverystartdate) {
        this.scheduleddeliverystartdate = scheduleddeliverystartdate;
    }

    public Date getScheduleddeliveryenddate() {
        return scheduleddeliveryenddate;
    }

    public void setScheduleddeliveryenddate(Date scheduleddeliveryenddate) {
        this.scheduleddeliveryenddate = scheduleddeliveryenddate;
    }

    public String getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(String itemstatus) {
        this.itemstatus = itemstatus == null ? null : itemstatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}