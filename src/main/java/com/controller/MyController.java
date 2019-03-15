package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 17:51
 */
@Controller
@RequestMapping("/mytest")
public class MyController {

    @RequestMapping("/getString")
    public String getString(){
        return "string";
    }
}
