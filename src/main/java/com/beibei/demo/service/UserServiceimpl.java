package com.beibei.demo.service;

import com.beibei.demo.dao.UserDao;
import com.beibei.demo.entity.User;
import com.beibei.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findAllByy(String phone, String password) {
        return userDao.findAllByy(phone,password);
    }

    @Override
    public User findByphone(String phone) {
        return userDao.findByphone(phone);
    }

    @Override
    public int insert(String phone, String password) {
        int i=userDao.insert(phone,password);
        return i;
    }

    @Override
    public int update(String password,int id) {
        return userDao.update(password,id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int jia(String addressName, int uid, int val) {
        return userDao.jia(addressName,uid,val);
    }







    /* @Override
    public User findAllByy(String phone, String password) {
        return userDao.findAllByy(phone,password);
    }

    @Override
    public int insert(String phone, String password) {
        return userDao.insert(phone,password);
    }

    @Override
    public List<User> findAllBy() {
        return userDao.findAllBy();
    }*/
}
