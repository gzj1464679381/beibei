package com.beibei.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.beibei.demo.entity.PingLun;
import com.beibei.demo.service.CommoditydetailsService;
import com.beibei.demo.util.Zhuangtaima;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//商品详情页面  commoditydetails
@RestController
@Api(value = "商品详情页",tags = "商品详情页")
@RequestMapping("/commoditydetails")
public class CommoditydetailsController {
    @Autowired
    private CommoditydetailsService service;
    Map map=new HashMap();
    /*
     * 评论功能+++++++++++++++++++
     * */
    @RequestMapping(value = "/pinlun",method = RequestMethod.GET)
    @ApiOperation(value = "评论功能",notes = "评论功能")
    @ApiImplicitParams({@ApiImplicitParam(name = "uid",value ="用户id" ),@ApiImplicitParam(name = "cid",value = "商品id"),@ApiImplicitParam(name = "neirong",value = "评论内容")})
    public String pinlun(int uid,int cid,String neirong){
        //获取当前时间
        Date date1=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime=format.format(date1);
        PingLun pingLun=new PingLun();
        pingLun.setCId(cid);
        pingLun.setDate(nowTime);
        pingLun.setNeirong(neirong);
        pingLun.setUId(uid);
        int a=service.addpinglun(pingLun);
        if (a==1){
            map.put(1,"评论成功");
        }else {
            map.put(0,"评论失败");
        }
        return JSONArray.toJSONString(map);
    }
     /*
     * 查找每个商品的所有评论
     * */
     @ApiOperation(value = "查询商品评论",tags = "查询商品评论")
     @RequestMapping(value = "/findPingLun",method = RequestMethod.GET)
     public String findPingLunByCid(HttpServletRequest Request){
         String id=Request.getParameter("3");
         int id2=Integer.parseInt("3");
         List<PingLun> list=service.pingluns(id2);
         return Zhuangtaima.ma(list);
     }
}
