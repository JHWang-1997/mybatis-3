package com.wjh;

import com.wjh.mapper.IUserDao;
import com.wjh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *@author JH-Wang
 *@since 2023/5/16 2:13
 */
public class Test {

  @org.junit.Test
  public void test1() throws IOException {
    final InputStream resourceAsStream = Resources.getResourceAsStream("com/wjh/sqlMapperConfig.xml");
    final SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    final SqlSession sqlSession = sessionFactory.openSession();
    final IUserDao userDao = sqlSession.getMapper(IUserDao.class);
    final List<User> objects = userDao.selectAll();
    System.out.println(objects);
    sqlSession.close();
  }

}
