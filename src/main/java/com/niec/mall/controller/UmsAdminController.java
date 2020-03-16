package com.niec.mall.controller;

import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.service.UmsAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户表(UmsAdmin)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsAdmin")
public class UmsAdminController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAdminService umsAdminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsAdmin selectOne(Long id) {
        return this.umsAdminService.queryById(id);
    }

}