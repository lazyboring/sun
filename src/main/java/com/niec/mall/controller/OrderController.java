package com.niec.mall.controller;

import com.niec.mall.service.PmsOrderService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : niec
 * @description
 * @date : 2020-04-18 14:38
 */
@Api(description = "订单")
@RestController
@RequestMapping("order")
public class OrderController {
    @Resource
    private PmsOrderService pmsOrderService;

    @ApiOperation(value = "查询订单")
    @GetMapping("/select")
    public ResultJson create(String id){
        return ResultJson.ok(pmsOrderService.select(id));
    }
}
