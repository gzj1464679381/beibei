package com.beibei.demo.entity;

//地址表
public class Address {

  private int addressId;   //地址id
  private String addressName;   //地址名称
  private int uId; //用户id
  private int val;  //是否默认(0是 1否)


  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }


  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public int getuId() {
    return uId;
  }

  public void setuId(int uId) {
    this.uId = uId;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }
}
