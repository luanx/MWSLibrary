package com.wantdo.data.mapper;

import com.wantdo.data.entity.Orderitem;

/**
 * @ Date : 16/3/2
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public interface OrderitemMapper {

    int insertAndGenKey(Orderitem record);
}
