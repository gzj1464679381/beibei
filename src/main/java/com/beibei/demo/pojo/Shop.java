package com.beibei.demo.pojo;

public class Shop {

    //商品id
    private int id;
    //商品名称
    private String name;
    //说明
    private String Explain;
    //单价
    private double price;
    //商品类别
    private ShopType shopType;
    //图片
    private String picture;
    //商家id(品牌)
    private int  Business;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ShopType getShopType() {
        return shopType;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getBusiness() {
        return Business;
    }

    public void setBusiness(int business) {
        Business = business;
    }

}
