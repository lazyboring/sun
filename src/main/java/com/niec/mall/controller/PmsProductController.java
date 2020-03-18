package com.niec.mall.controller;

import com.niec.mall.entity.PmsProduct;
import com.niec.mall.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品信息(PmsProduct)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("pmsProduct")
@Api(description = "商品信息")
public class PmsProductController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductService pmsProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public PmsProduct selectOne(Long id) {
        return this.pmsProductService.queryById(id);
    }

}