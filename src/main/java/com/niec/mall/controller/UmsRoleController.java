package com.niec.mall.controller;

import com.niec.mall.entity.UmsRole;
import com.niec.mall.service.UmsRoleService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 后台用户角色表(UmsRole)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsRole")
@Api(description = "后台用户角色和权限关系")
public class UmsRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UmsRoleService umsRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsRole selectOne(Long id) {
        return this.umsRoleService.queryById(id);
    }


    @ApiOperation(value = "查询对应的权限下的用户")
    @GetMapping("getAll")
    public ResultJson getUserListById(Long id){
        return ResultJson.ok(umsRoleService.getUserListById(id));
    }


}