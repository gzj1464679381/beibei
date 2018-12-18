package com.beibei.demo.entity;


public class Address {

  private long addressId;
  private String addressName;
  private long uId;
  private long val;


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
