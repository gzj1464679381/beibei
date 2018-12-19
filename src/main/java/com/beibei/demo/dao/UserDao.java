package com.beibei.demo.dao;

import com.beibei.demo.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    User findAllByy(String phone,String password);

    int insert(@Param("phone") String phone,@Param("password") String password);


    List<User> findAllBy();







}
