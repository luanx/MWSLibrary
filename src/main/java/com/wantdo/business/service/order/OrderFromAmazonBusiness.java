package com.wantdo.business.service.order;

import com.wantdo.business.entity.OrderEntity;
import com.wantdo.data.entity.Orderinfo;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */

public interface OrderFromAmazonBusiness {

    /**
     *
     * @param amazonOrderId
     * @param sellerId
     * @param orderstatus
     * @return -1:订单数据查询错误, 0: 订单不存在, 1: 订单存在但状态不同, 2:订单存在且状态相同
     */
    int checkOrderStatus(String amazonOrderId, String sellerId, String orderstatus);

    Orderinfo getOrderStatus(String amazonOrderId, String sellerId);

    void insertOrderEntity(OrderEntity oe) throws Exception;

    void updateOrderinfo(Orderinfo oi);
}
