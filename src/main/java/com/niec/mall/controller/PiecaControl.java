package com.niec.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : niec
 * @description
 * @date : 2020-05-15 15:43
 */
@RestController
public class PiecaControl {
    @RequestMapping("/query")
    public void asyncTask() throws Exception {
        System.out.println("我是控制类里面的方法，我正在思考...............");
    }
}
