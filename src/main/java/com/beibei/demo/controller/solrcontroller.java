package com.beibei.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class solrcontroller {

    @RequestMapping(value = "/ss",method = RequestMethod.GET)
    public String test1(String name, Model model){
        return null;


    }


}
