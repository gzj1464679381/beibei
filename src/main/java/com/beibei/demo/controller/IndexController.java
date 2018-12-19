package com.beibei.demo.controller;


import com.beibei.demo.entity.Commodity;
import com.beibei.demo.service.IndexService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping(value = "/sale",method = RequestMethod.GET)
    public List<Commodity> find(){
        return indexService.find();
    }
    @RequestMapping(value = "/style",method = RequestMethod.GET)
    public List<Commodity> findByType(){
        return indexService.findByType();
    }


}
