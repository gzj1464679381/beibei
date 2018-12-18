package com.beibei.demo.entity;


public class Commodity {

  private long id;
  private String name;
  private String description;
  private double price;
  private long tId;
  private String picture;
  private String quantity;
  private String purchaseTime;
  private long mId;


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


  public String getPurchaseTime() {
    return purchaseTime;
  }

  public void setPurchaseTime(String purchaseTime) {
    this.purchaseTime = purchaseTime;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }

}
