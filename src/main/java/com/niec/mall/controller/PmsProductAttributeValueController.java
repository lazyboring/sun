package com.niec.mall.controller;

import com.niec.mall.entity.PmsProductAttributeValue;
import com.niec.mall.service.PmsProductAttributeValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("pmsProductAttributeValue")
public class PmsProductAttributeValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeValueService pmsProductAttributeValueService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductAttributeValue selectOne(Long id) {
        return this.pmsProductAttributeValueService.queryById(id);
    }

}