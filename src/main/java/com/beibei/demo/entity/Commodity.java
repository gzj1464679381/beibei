package com.beibei.demo.entity;

//商品表
public class Commodity {

  private long id; //商品id
  private String name;  //商品名称
  private String description;  //说明
  private double price; //价格
  private long tId;  //类型id
  private String picture;  //图片
  private String quantity; //库存
  private long mId; //商家id


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getTId() {
    return tId;
  }

  public void setTId(long tId) {
    this.tId = tId;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }




  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }

}
