package com.beibei.demo.util;

public enum Ma {
   SUCCESS(0,"成功"),ERROR(1,"失败");
    private int key;
    private String value;
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

  Ma(int key,String value){
        this.key=key;
        this.value=value;
  }

    public static void main(String[] args) {

        System.out.println(Ma.ERROR.getKey()+":"+Ma.ERROR.getValue());
    }

}
