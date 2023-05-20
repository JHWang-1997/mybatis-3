package com.wjh.pojo;

/**
 *@author JH-Wang
 *@since 2023/5/20 11:03
 */
public class Product {

  private Integer id;

  private String name;

  private Double price;


  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", price=" + price +
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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
