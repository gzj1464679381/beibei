package com.beibei.demo.entity;

//评论表
public class PingLun {

  private long id; //评论id
  private long uId; //用户id
  private long cId;  //商品id
  private java.sql.Timestamp date;  //评论时间
  private String neirong;  //评论内容


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


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public String getNeirong() {
    return neirong;
  }

  public void setNeirong(String neirong) {
    this.neirong = neirong;
  }

}
