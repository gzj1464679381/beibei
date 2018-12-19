package com.beibei.demo.util;

import com.alibaba.fastjson.JSONArray;

public class Zhuangtaima {
    private Object object;
    private String ma;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }


    public Zhuangtaima(Object o,String ma){
        this.object=o;
        this.ma=ma;
    }
    public static String ma(Object o){
        if (o==null){
            Zhuangtaima zhuangtaima=new Zhuangtaima(o,Ma.ERROR.getKey()+":"+Ma.ERROR.getValue());
            return JSONArray.toJSONString(zhuangtaima);
        }else {
            Zhuangtaima zhuangtaima=new Zhuangtaima(o,Ma.SUCCESS.getKey()+":"+Ma.SUCCESS.getValue());
            return JSONArray.toJSONString(zhuangtaima);
        }
    }
}
