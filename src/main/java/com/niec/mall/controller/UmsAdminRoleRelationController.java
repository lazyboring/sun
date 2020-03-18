package com.niec.mall.controller;

import com.niec.mall.entity.UmsAdminRoleRelation;
import com.niec.mall.service.UmsAdminRoleRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsAdminRoleRelation")
@Api(description = "后台用户和角色关系")
public class UmsAdminRoleRelationController {
    /**
     * 服务对象
     */
    @Resource
    private UmsAdminRoleRelationService umsAdminRoleRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsAdminRoleRelation selectOne(Long id) {
        return this.umsAdminRoleRelationService.queryById(id);
    }

}