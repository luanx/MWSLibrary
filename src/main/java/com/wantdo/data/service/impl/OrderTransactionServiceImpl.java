package com.wantdo.data.service.impl;

import com.wantdo.data.entity.Orderinfo;
import com.wantdo.data.entity.Orderitem;
import com.wantdo.data.mapper.OrderinfoMapper;
import com.wantdo.data.mapper.OrderitemMapper;
import com.wantdo.data.service.OrderTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ Date : 16/3/2
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */

@Service
@Transactional
public class OrderTransactionServiceImpl implements OrderTransactionService {

    @Autowired
    private OrderinfoMapper oim;

    @Autowired
    private OrderitemMapper otm;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Orderinfo createOrder(Orderinfo oi, List<Orderitem> items) {
        try {
            oim.insertAndGenkey(oi);
            for(int i=0; i<items.size(); i++){
                Orderitem ot = items.get(i);
                ot.setOrderid(oi.getId());
                otm.insertAndGenKey(ot);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return oi;
    }
}
