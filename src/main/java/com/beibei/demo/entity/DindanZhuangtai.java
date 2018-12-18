package com.beibei.demo.entity;

//订单状态表
public class DindanZhuangtai {

  private long id;
  private String shuoming;  //状态说明


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

}
