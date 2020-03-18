package com.niec.mall.controller;

import com.niec.mall.entity.UmsPermission;
import com.niec.mall.service.UmsPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户权限表(UmsPermission)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsPermission")
@Api(description = "后台用户权限")
public class UmsPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private UmsPermissionService umsPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsPermission selectOne(Long id) {
        return this.umsPermissionService.queryById(id);
    }

}