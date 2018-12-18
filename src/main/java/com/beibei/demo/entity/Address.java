package com.beibei.demo.entity;

//地址表
public class Address {

  private long addressId;   //地址id
  private String addressName;   //地址名称
  private long uId; //用户id
  private long val;  //是否默认(0是 1否)


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public long getuId() {
    return uId;
  }

  public void setuId(long uId) {
    this.uId = uId;
  }

  public long getVal() {
    return val;
  }

  public void setVal(long val) {
    this.val = val;
  }
}
