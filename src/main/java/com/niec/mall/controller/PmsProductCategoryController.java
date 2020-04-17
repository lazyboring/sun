package com.niec.mall.controller;

import com.niec.mall.entity.PmsProductCategory;
import com.niec.mall.service.PmsProductCategoryService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 产品分类(PmsProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("pmsProductCategory")
@Api(description = "产品分类")
public class PmsProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductCategoryService pmsProductCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public PmsProductCategory selectOne(Long id) {
        return this.pmsProductCategoryService.queryById(id);
    }


    @ApiOperation(value = "购买商品")
    @PostMapping("sale")
    public ResultJson saleProduct(@RequestParam(required = true)String name,@RequestParam(required = true)Integer num){
        return ResultJson.ok(pmsProductCategoryService.saleProduct(name,num));
    }
}