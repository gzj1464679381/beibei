package com.beibei.demo.entity;

//订单详情表
public class XiangQing {

  private long id;
  private long oId;  //订单主表id
  private long cId;  //商品id
  private String shuliang;  //购买数量
  private String danjia; //单价
  private java.sql.Timestamp fahuodate;  //发货时间


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOId() {
    return oId;
  }

  public void setOId(long oId) {
    this.oId = oId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public String getShuliang() {
    return shuliang;
  }

  public void setShuliang(String shuliang) {
    this.shuliang = shuliang;
  }


  public String getDanjia() {
    return danjia;
  }

  public void setDanjia(String danjia) {
    this.danjia = danjia;
  }


  public java.sql.Timestamp getFahuodate() {
    return fahuodate;
  }

  public void setFahuodate(java.sql.Timestamp fahuodate) {
    this.fahuodate = fahuodate;
  }

}
