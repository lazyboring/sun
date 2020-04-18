package com.niec.mall.controller;

import com.niec.mall.entity.PmsProduct;
import com.niec.mall.service.PmsProductService;
import com.niec.mall.vo.ResultJson;
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

    /**
     * @param id
     * @return
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("deleteProduct")
    public ResultJson deleteProduct(Long id) {
        return ResultJson.ok(pmsProductService.deleteById(id));
    }


    @ApiOperation("查询")
    @GetMapping("query")
    public ResultJson query(Double price1, Double price2) {
        return ResultJson.ok(pmsProductService.query(price1, price2));
    }


    @ApiOperation("更新")
    @PostMapping("update")
    public ResultJson update(@RequestBody PmsProduct pmsProduct){
        return ResultJson.ok(pmsProductService.update(pmsProduct));
    }
}