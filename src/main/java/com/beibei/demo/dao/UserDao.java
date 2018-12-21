package com.beibei.demo.dao;

import com.beibei.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao  {

    //把手机号和密码添加到数据库
    int insert(@Param("phone") String phone, @Param("password") String password);
    //根据用户名和密码查询
    User findAllByy(@Param("phone") String phone,@Param("password") String password);
    //根据用户名获取id
    User findByphone(@Param("phone") String phone);
    //修改密码
    int update(@Param("password") String password,@Param("id") Integer id);
    //查找全部
    List<User> findAll();
    //添加地址
    int jia(@Param("addressName") String addressName,@Param("uid") Integer uid,@Param("val") Integer val);











}
