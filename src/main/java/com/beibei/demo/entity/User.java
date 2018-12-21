package com.beibei.demo.entity;

//用户表
public class User {

  private int id;
  private String phone; //手机号
  private String password;  //密码
  private String yanzhengma;//验证码
  private String kaishishijian;//开始时间

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }




  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
