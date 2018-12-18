package com.beibei.demo.entity;


import java.util.Date;
//订单主表
public class Order {

  private long id;  //id
  private String orderNumber;  //订单号
  private long Uid;  //用户id
  private Date createDate;  //下单日期
  private String address; //收获地址
  private long Did;  //订单状态id
  private String phone; //联系电话
  private String totalquantity;  //购买总数量
  private double sumPrice; //总价格


}
