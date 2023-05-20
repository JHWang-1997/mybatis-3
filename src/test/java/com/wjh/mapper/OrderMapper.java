package com.wjh.mapper;

import com.wjh.pojo.Order;

import java.util.List;

/**
 *@author JH-Wang
 *@since 2023/5/20 12:01
 */
public interface OrderMapper {

  List<Order> selectByUserId(int uid);

}
