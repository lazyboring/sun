package com.niec.mall.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @program: sun
 * @description: 欢迎接口
 * @author: Mr.NC
 * @create: 2020-04-12 21:31
 **/
@Api("欢迎界面")
@Controller
public class HelloControl {
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String,Object> map){
        map.put("hello","欢迎进入html界面");
        return "/index";
    }
}
