package com.wjh;

import com.wjh.mapper.UserMapper;
import com.wjh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *@author JH-Wang
 *@since 2023/5/16 2:13
 */
public class TestCase {

  private SqlSession sqlSession;

  @Before
  public void before() throws IOException {
    final InputStream resourceAsStream = Resources.getResourceAsStream("com/wjh/sqlMapperConfig.xml");
    final SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    sqlSession = sessionFactory.openSession();
  }

  @Test
  public void testSelectAll() {
    final UserMapper userDao = sqlSession.getMapper(UserMapper.class);
    final List<User> objects = userDao.selectAll();
    System.out.println(objects);
    sqlSession.close();
  }

  @Test
  public void testSelectOne() {
    final UserMapper userDao = sqlSession.getMapper(UserMapper.class);
    final User user = new User();
    user.setId(1);
    final User res = userDao.selectOne(user);
    System.out.println(res);
  }

  @Test
  public void testOne2Many() {
    final UserMapper userDao = sqlSession.getMapper(UserMapper.class);
    final List<User> users = userDao.selectWithProduct();
    System.out.println(users);
  }

  @Test
  public void testLazeFetch() {
    final UserMapper userDao = sqlSession.getMapper(UserMapper.class);
    final User user = userDao.selectWithOrders(1);
    System.out.println(user.getName());
    System.out.println(user.getOrders());
  }

  @Test
  public void testUpdate() {
    final UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    final User user = new User();
    user.setId(1);
    user.setAge(18);
    final int i = userMapper.updateById(user);
    Assert.assertEquals(1, i);
  }

}
