package com.wjh.pojo;

/**
 *@author JH-Wang
 *@since 2023/5/20 11:02
 */
public class Order {


  private Integer id;

  private Integer uid;

  private Integer pid;

  @Override
  public String toString() {
    return "Order{" +
      "id=" + id +
      ", uid=" + uid +
      ", pid=" + pid +
      '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }
}
