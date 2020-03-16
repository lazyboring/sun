package com.niec.mall.controller;

import com.niec.mall.entity.PmsBrand;
import com.niec.mall.service.PmsBrandService;
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
    @GetMapping("selectOne")
    public PmsBrand selectOne(Long id) {
        return this.pmsBrandService.queryById(id);
    }

}