package com.beibei.demo.entity;

//颜色表
public class Color {

  private long id;
  private String name;  //颜色名称
  private String sId;  //商品id


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


  public String getSId() {
    return sId;
  }

  public void setSId(String sId) {
    this.sId = sId;
  }

}
