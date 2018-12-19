package com.beibei.demo.entity;

//收藏表
public class Collection {

  private long shoucangId;  //收藏id
  private long cId;  //商品id
  private long uId;  //用户id


  public long getShoucangId() {
    return shoucangId;
  }

  public void setShoucangId(long shoucangId) {
    this.shoucangId = shoucangId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }

}
