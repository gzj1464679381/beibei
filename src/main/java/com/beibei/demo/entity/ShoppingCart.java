package com.beibei.demo.entity;

//购物车表
public class ShoppingCart {

  private long id;  //购物车id
  private long uId;  //用户id
  private long cId;  //商品id
  private String num;  //购买数量
  private double total;  //总价
  private java.sql.Timestamp date;  //加入时间


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }


  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

}
