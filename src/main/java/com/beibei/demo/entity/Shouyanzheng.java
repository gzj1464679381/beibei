package com.beibei.demo.entity;

public class Shouyanzheng {


    private int kaishishijain;   //开始时间

    public int getKaishishijain() {
        return kaishishijain;
    }

    public void setKaishishijain(int kaishishijain) {
        this.kaishishijain = kaishishijain;
    }

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }

    private String yanzhengma;  //验证码

    public String getShoujiahao() {
        return shoujiahao;
    }

    public void setShoujiahao(String shoujiahao) {
        this.shoujiahao = shoujiahao;
    }

    private String shoujiahao;//手机号
}
