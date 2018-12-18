package com.beibei.demo.entity;


public class PingLun {

  private long id;
  private long uId;
  private long cId;
  private java.sql.Timestamp date;
  private String neirong;


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
