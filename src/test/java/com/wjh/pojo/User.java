package com.wjh.pojo;

/**
 *@author JH-Wang
 *@since 2023/5/17 0:45
 */
public class User {

  private Integer id;

  private String name;

  private Integer age;

  private Integer sex;

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", sex=" + sex +
      '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }
}
