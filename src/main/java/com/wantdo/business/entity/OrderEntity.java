package com.wantdo.business.entity;

import com.wantdo.data.entity.Orderinfo;
import com.wantdo.data.entity.Orderitem;

import java.util.List;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class OrderEntity {

    private Orderinfo orderinfo;

    private List<Orderitem> orderitems;

    public Orderinfo getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(Orderinfo orderinfo) {
        this.orderinfo = orderinfo;
    }

    public List<Orderitem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(List<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }
}
