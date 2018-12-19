package com.beibei.demo.entity;

//用户表
public class User {

  private long id;
  private String phone; //手机号
  private String password;  //密码

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }

    private String yanzhengma;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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
