package com.wantdo.data.service;

import com.wantdo.data.entity.Orderinfo;
import com.wantdo.data.entity.Orderitem;

import java.util.List;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public interface OrderTransactionService {

    public Orderinfo createOrder(Orderinfo oi, List<Orderitem> items);

}
