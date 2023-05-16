package com.wjh.mapper;

import com.wjh.pojo.User;

import java.util.List;

/**
 *@author JH-Wang
 *@since 2023/5/17 0:25
 */
public interface IUserDao {

  List<User> selectAll();

}
