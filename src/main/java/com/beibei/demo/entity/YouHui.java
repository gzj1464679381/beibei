package com.beibei.demo.entity;

//优惠表
public class YouHui {

  private long id;
  private String shuoming; //优惠说明
  private double zhekou;  //优惠折扣
  private long cId; //商品id
  private String count;  //总数量
  private long uId;  //用户id


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getShuoming() {
    return shuoming;
  }

  public void setShuoming(String shuoming) {
    this.shuoming = shuoming;
  }


  public double getZhekou() {
    return zhekou;
  }

  public void setZhekou(double zhekou) {
    this.zhekou = zhekou;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }

}
