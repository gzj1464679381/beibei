package com.beibei.demo.entity;


public class ShoppingCart {

  private long id;
  private long uId;
  private long cId;
  private String num;
  private double total;
  private java.sql.Timestamp date;


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
