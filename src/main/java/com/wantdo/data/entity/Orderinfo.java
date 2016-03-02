package com.wantdo.data.entity;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Orderinfo {
    private Integer id;

    /**
     * SellerOrderId
     */
    private String orderid;

    private String internalid;

    /**
     * AmazonOrderId
     */
    private String externalid;

    private Date purchasedate;

    private Date lastupdatedate;

    private String orderstatus;

    private String fulfillmentchannel;

    private String saleschannel;

    private String orderchannel;

    private String shipservicelevel;

    private String shipname;

    private String addressline1;

    private String addressline2;

    private String addressline3;

    private String city;

    private String county;

    private String district;

    private String stateorregion;

    private String postalcode;

    private String countrycode;

    private String phone;

    private String total;

    private String currencycode;

    private String paymentmethod;

    private Integer numberofitemsshipped;

    private Integer numberofitemsunshipped;

    private String paymentexecutiondetail;

    private String marketplaceid;

    private String buyeremail;

    private String buyername;

    private String shipmentservicelevelcategory;

    private String shippedbyamazontfm;

    private String tfmshipmentstatus;

    private String cbadisplayableshippinglabel;

    /**
     * StandardOrder or Preorder
     */
    private String ordertype;

    private Date earliestshipdate;

    private Date latestshipdate;

    private Date earliestdeliverydate;

    private Date latestdeliverydate;

    private Integer createby;

    private Date createon;

    private String sellerid;

    private String groupids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getInternalid() {
        return internalid;
    }

    public void setInternalid(String internalid) {
        this.internalid = internalid == null ? null : internalid.trim();
    }

    public String getExternalid() {
        return externalid;
    }

    public void setExternalid(String externalid) {
        this.externalid = externalid == null ? null : externalid.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public String getFulfillmentchannel() {
        return fulfillmentchannel;
    }

    public void setFulfillmentchannel(String fulfillmentchannel) {
        this.fulfillmentchannel = fulfillmentchannel == null ? null : fulfillmentchannel.trim();
    }

    public String getSaleschannel() {
        return saleschannel;
    }

    public void setSaleschannel(String saleschannel) {
        this.saleschannel = saleschannel == null ? null : saleschannel.trim();
    }

    public String getOrderchannel() {
        return orderchannel;
    }

    public void setOrderchannel(String orderchannel) {
        this.orderchannel = orderchannel == null ? null : orderchannel.trim();
    }

    public String getShipservicelevel() {
        return shipservicelevel;
    }

    public void setShipservicelevel(String shipservicelevel) {
        this.shipservicelevel = shipservicelevel == null ? null : shipservicelevel.trim();
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1 == null ? null : addressline1.trim();
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2 == null ? null : addressline2.trim();
    }

    public String getAddressline3() {
        return addressline3;
    }

    public void setAddressline3(String addressline3) {
        this.addressline3 = addressline3 == null ? null : addressline3.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStateorregion() {
        return stateorregion;
    }

    public void setStateorregion(String stateorregion) {
        this.stateorregion = stateorregion == null ? null : stateorregion.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode == null ? null : currencycode.trim();
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod == null ? null : paymentmethod.trim();
    }

    public Integer getNumberofitemsshipped() {
        return numberofitemsshipped;
    }

    public void setNumberofitemsshipped(Integer numberofitemsshipped) {
        this.numberofitemsshipped = numberofitemsshipped;
    }

    public Integer getNumberofitemsunshipped() {
        return numberofitemsunshipped;
    }

    public void setNumberofitemsunshipped(Integer numberofitemsunshipped) {
        this.numberofitemsunshipped = numberofitemsunshipped;
    }

    public String getPaymentexecutiondetail() {
        return paymentexecutiondetail;
    }

    public void setPaymentexecutiondetail(String paymentexecutiondetail) {
        this.paymentexecutiondetail = paymentexecutiondetail == null ? null : paymentexecutiondetail.trim();
    }

    public String getMarketplaceid() {
        return marketplaceid;
    }

    public void setMarketplaceid(String marketplaceid) {
        this.marketplaceid = marketplaceid == null ? null : marketplaceid.trim();
    }

    public String getBuyeremail() {
        return buyeremail;
    }

    public void setBuyeremail(String buyeremail) {
        this.buyeremail = buyeremail == null ? null : buyeremail.trim();
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public String getShipmentservicelevelcategory() {
        return shipmentservicelevelcategory;
    }

    public void setShipmentservicelevelcategory(String shipmentservicelevelcategory) {
        this.shipmentservicelevelcategory = shipmentservicelevelcategory == null ? null : shipmentservicelevelcategory.trim();
    }

    public String getShippedbyamazontfm() {
        return shippedbyamazontfm;
    }

    public void setShippedbyamazontfm(String shippedbyamazontfm) {
        this.shippedbyamazontfm = shippedbyamazontfm == null ? null : shippedbyamazontfm.trim();
    }

    public String getTfmshipmentstatus() {
        return tfmshipmentstatus;
    }

    public void setTfmshipmentstatus(String tfmshipmentstatus) {
        this.tfmshipmentstatus = tfmshipmentstatus == null ? null : tfmshipmentstatus.trim();
    }

    public String getCbadisplayableshippinglabel() {
        return cbadisplayableshippinglabel;
    }

    public void setCbadisplayableshippinglabel(String cbadisplayableshippinglabel) {
        this.cbadisplayableshippinglabel = cbadisplayableshippinglabel == null ? null : cbadisplayableshippinglabel.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getEarliestshipdate() {
        return earliestshipdate;
    }

    public void setEarliestshipdate(Date earliestshipdate) {
        this.earliestshipdate = earliestshipdate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getLatestshipdate() {
        return latestshipdate;
    }

    public void setLatestshipdate(Date latestshipdate) {
        this.latestshipdate = latestshipdate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getEarliestdeliverydate() {
        return earliestdeliverydate;
    }

    public void setEarliestdeliverydate(Date earliestdeliverydate) {
        this.earliestdeliverydate = earliestdeliverydate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public Date getLatestdeliverydate() {
        return latestdeliverydate;
    }

    public void setLatestdeliverydate(Date latestdeliverydate) {
        this.latestdeliverydate = latestdeliverydate;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Date getCreateon() {
        return createon;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-07:00")
    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid == null ? null : sellerid.trim();
    }

    public String getGroupids() {
        return groupids;
    }

    public void setGroupids(String groupids) {
        this.groupids = groupids == null ? null : groupids.trim();
    }
}
