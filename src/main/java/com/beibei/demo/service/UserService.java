package com.beibei.demo.service;

import com.beibei.demo.entity.User;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface UserService {


 //根据用户名和密码查询
 User findAllByy(String phone,String password);

    //根据用户名获取id
    User findByphone(String phone);


    //把手机号和密码添加到数据库
    int insert(String phone, String password);

    //修改密码
    int update(String password,int id);

    //查找全部
    List<User> findAll();

//添加地址
    int jia( String addressName, int uid,int val);
}
