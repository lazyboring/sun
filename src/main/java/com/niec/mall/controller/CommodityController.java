package com.niec.mall.controller;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.baomidou.mybatisplus.core.conditions.update.Update;
import com.niec.mall.dto.CommodityDto;
import com.niec.mall.entity.Commodity;
import com.niec.mall.service.CommodityService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Commodity)表控制层
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
@Api("商品")
@RestController
@RequestMapping("commodity")
public class CommodityController {
    /**
     * 服务对象
     */
    @Resource
    private CommodityService commodityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询")
    @GetMapping("selectOne")
    public Commodity selectOne(Long id) {
        return this.commodityService.queryById(id);
    }

    @ApiOperation(value = "添加商品")
    @PostMapping()
    public ResultJson add(@RequestBody @Validated(Insert.class) CommodityDto commodityDto) {
        return ResultJson.ok(commodityService.add(commodityDto));
    }

    @ApiOperation("更新")
    @PutMapping("update")
    public ResultJson update(@RequestBody @Validated(Update.class) CommodityDto commodityDto) {
        return ResultJson.ok(commodityService.update(commodityDto));
    }

    @ApiOperation("批量增加")
    @PostMapping("list")
    public ResultJson addList(String...adf){
        return ResultJson.ok();
    }
    @ApiOperation("删除")
    @DeleteMapping("delete")
    public ResultJson delete(String id){
        return ResultJson.ok();
    }
}