package com.niec.mall.controller;

import com.niec.mall.entity.PmsProductAttribute;
import com.niec.mall.service.PmsProductAttributeService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品属性参数表(PmsProductAttribute)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("pmsProductAttribute")
@Api(description = "商品属性参数")
public class PmsProductAttributeController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeService pmsProductAttributeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public PmsProductAttribute selectOne(Long id) {
        return this.pmsProductAttributeService.queryById(id);
    }


}