package com.niec.mall.service;


import com.niec.mall.entity.PmsOrder;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2020-04-18 14:50:33
 */
public interface PmsOrderService {


    PmsOrder select(String id);
}