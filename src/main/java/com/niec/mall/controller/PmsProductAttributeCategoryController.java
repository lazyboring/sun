package com.niec.mall.controller;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.niec.mall.dto.PmsProductAttributeCategoryDto;
import com.niec.mall.entity.PmsProductAttributeCategory;
import com.niec.mall.service.PmsProductAttributeCategoryService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("pmsProductAttributeCategory")
@Api(description = "产品属性分类")
public class PmsProductAttributeCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public PmsProductAttributeCategory selectOne(Long id) {
        return this.pmsProductAttributeCategoryService.queryById(id);
    }


    @ApiOperation(value = "新增")
    @PostMapping("add")
    public ResultJson createPmsProductAttributeCategory(@RequestBody @Validated(Insert.class) PmsProductAttributeCategoryDto pmsProductAttributeCategoryDto){
            return ResultJson.ok(1);
    }
}