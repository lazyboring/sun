package com.niec.mall.controller;

import com.niec.mall.entity.UmsAdminPermissionRelation;
import com.niec.mall.service.UmsAdminPermissionRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsAdminPermissionRelation")
@Api(description = "后台用户和权限关系")
public class UmsAdminPermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsAdminPermissionRelation selectOne(Long id) {
        return this.umsAdminPermissionRelationService.queryById(id);
    }

}