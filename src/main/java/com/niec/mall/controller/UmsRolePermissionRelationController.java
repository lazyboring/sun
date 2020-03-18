package com.niec.mall.controller;

import com.niec.mall.entity.UmsRolePermissionRelation;
import com.niec.mall.service.UmsRolePermissionRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsRolePermissionRelation")
@Api(description = "后台用户角色和权限关系")
public class UmsRolePermissionRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRolePermissionRelationService umsRolePermissionRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsRolePermissionRelation selectOne(Long id) {
        return this.umsRolePermissionRelationService.queryById(id);
    }

}