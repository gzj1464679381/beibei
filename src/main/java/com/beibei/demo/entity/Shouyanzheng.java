package com.beibei.demo.entity;

public class Shouyanzheng {


    public Shouyanzheng(long kaishishijain, String jieshu, String yanzhengma) {
        this.kaishishijain = kaishishijain;
        this.jieshu = jieshu;
        this.yanzhengma = yanzhengma;
    }
    private String yanzhengma;  //验证码
    private long kaishishijain;   //开始时间
    private String shoujiahao;//手机号
    private String jieshu;//结束

    public String getJieshu() {
        return jieshu;
    }

    public void setJieshu(String jieshu) {
        this.jieshu = jieshu;
    }



    public long getKaishishijain() {
        return kaishishijain;
    }

    public void setKaishishijain(long kaishishijain) {
        this.kaishishijain = kaishishijain;
    }

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }



    public String getShoujiahao() {
        return shoujiahao;
    }

    public void setShoujiahao(String shoujiahao) {
        this.shoujiahao = shoujiahao;
    }


        }
