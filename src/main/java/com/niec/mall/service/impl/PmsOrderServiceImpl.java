package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsOrder;
import com.niec.mall.mapper.PmsOrderMapper;
import com.niec.mall.service.PmsOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2020-04-18 14:50:33
 */
@Service("orderService")
public class PmsOrderServiceImpl implements PmsOrderService {
    @Resource
    private PmsOrderMapper pmsOrderMapper;


    @Override
    public PmsOrder select(String id) {
        return pmsOrderMapper.selectById(id);
    }
}