package com.beibei.demo.controller;

import com.beibei.demo.entity.User;
import com.beibei.demo.service.impl.GetMessageCode;
import com.beibei.demo.service.impl.LoginServiceImpl;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoginController {

    @Resource
    private LoginServiceImpl loginService;




//登陆
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String log(@Param("phone") String phone, @Param("password") String password){
      User user=loginService.findAllByy(phone,password);
      if (user!=null){
          return "登陆成功";
      }
      return "";
    }


    //注册
    @RequestMapping(value = "/zhuce",method = RequestMethod.GET)
    public String zhu(@Param("phone") String phone,@Param("yanzhengma") String yanzhengma,@Param("password") String password){
        String yanzhengma1=GetMessageCode.smsCode();
        List<User> users=loginService.findAllBy();
        for (User user : users) {
            if (user.getPhone().equals(phone)) {
                return "该手机号以注册，请重新输入";
            } else {
                if (yanzhengma.equals(yanzhengma1)) {
                    loginService.insert(phone, password);
                    return "注册成功";
                }
            }
        }
        return "";
    }











}
