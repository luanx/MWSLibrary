package com.wantdo.data.mapper;

import com.wantdo.data.condition.impl.OrderinfoDaoCondition;
import com.wantdo.data.entity.Orderinfo;

import java.util.List;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */


public interface OrderinfoMapper {

    int insertAndGenkey(Orderinfo record);

    List<Orderinfo> selectByCondition(OrderinfoDaoCondition orderInfoDaoCondition);

    int updateByPrimaryKeySelective(Orderinfo record);
}
