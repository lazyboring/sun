package com.niec.mall.controller;

import com.niec.mall.entity.PmsBrand;
import com.niec.mall.service.PmsBrandService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌表(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:50
 */
@RestController
@RequestMapping("pmsBrand")
@Api(description = "品牌")
public class PmsBrandController {
    /**
     * 服务对象
     */
    @Resource
    private PmsBrandService pmsBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public PmsBrand selectOne(Long id) {
        return this.pmsBrandService.queryById(id);
    }

    /**
     * 通过主键删除单条数据
     * @param id
     * @return
     */
    @ApiOperation(value = "删除品牌")
    @DeleteMapping("delete")
    public ResultJson delete(Long id){return ResultJson.ok(this.pmsBrandService.deleteById(id));}

    /**
     * 通过获取列表
     */
    @ApiOperation(value = "根据工厂状态获取品牌列表")
    @GetMapping("list")
    public ResultJson getList(Integer factoryStatus){return ResultJson.ok(this.pmsBrandService.queryListByFactoryStatus(factoryStatus));}





}