package com.beibei.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.beibei.demo.entity.User;
import com.beibei.demo.redis.Rediss;
import com.beibei.demo.service.GetMessageCode;
import com.beibei.demo.service.UserServiceimpl;
import io.lettuce.core.dynamic.annotation.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Api(value = "测试服务",tags = {"测试服务操作接口"})
public class UserController {

    @Resource
    private UserServiceimpl loginService;

    @Resource
    private Rediss rediss;

 @ApiOperation(value = "获取用户数量",notes = "获取用户数量")
 @ApiResponses({@ApiResponse(code = 1,message="操作成功")})
   @ApiResponse(code = 0,message = "操作失败，服务器异常")


    //获取验证码

    //判断验证码（（手机号，验证码）成功添加数据库）

    //验证码
    @RequestMapping(value = "/yanzhengma",method = RequestMethod.GET)
    public String yanzheng(String phone){
     String yanzhengma=GetMessageCode.getCode(phone);
     User user=new User();
     user.setPhone(phone);
     user.setYanzhengma(yanzhengma);
     System.out.println(yanzhengma);
     rediss.add("yanzheng",user,300l);
     return JSONArray.toJSONString(yanzhengma);
 }


     //注册
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String zhuce(@RequestParam String phone, @RequestParam String yanzhangma, @RequestParam String password){
        List<User> list=loginService.findAll();
        for (int i = 0; i <list.size() ; i++) {
            if (!list.get(i).getPhone().equals(phone)){
                if (rediss.get("yanzheng")==null){
                    return "对不起，已超时";
                }else {
                    User user=rediss.get("yanzheng");
                    if (user.getPhone().equals(phone)&&user.getYanzhengma().equals(yanzhangma)){
                        loginService.insert(phone,password);
                        return "注册成功";
                    }else {
                        return "验证码或手机号错误，请重新输入";
                    }
                }
            }else {
                return "用户名已存在";
            }
        }
        return "";
    }


    //登陆
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam String phone,@RequestParam String password,HttpSession session){
        User user=loginService.findAllByy(phone,password);
        if (user!=null){
            session.setAttribute("login",user);
            return "登陆成功";
        }else {
            return "登陆失败";
        }
    }

    //个人中心
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome(HttpSession session){
     User user=(User) session.getAttribute("login");
     return JSONArray.toJSONString(user.getPhone());
    }


    //修改密码
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(@RequestParam String password,@RequestParam String password1,@RequestParam String password2,HttpSession session){
     User user=(User) session.getAttribute("login");
        if (user.getPassword().equals(password)){
         if (password1.equals(password2)){
             User user1=loginService.findByphone(user.getPhone());
             loginService.update(password1,user1.getId());
             return "修改密码成功";
         }else {
             return "你输入的两次新密码不一致，请重新输入";
         }
     }else {
         return "你所要修改的密码输入不正确，请重新输入";
        }
    }


    //收货地址
    @RequestMapping(value = "/dizhi",method = RequestMethod.GET)
    public String tianjia(@RequestParam String addressName,@RequestParam int uid,@RequestParam int val){
     return JSONArray.toJSONString(loginService.jia(addressName,uid,val));
    }













}
