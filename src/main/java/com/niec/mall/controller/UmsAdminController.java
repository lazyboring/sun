package com.niec.mall.controller;

import com.niec.mall.dto.UserRoleDto;
import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.service.UmsAdminService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 后台用户表(UmsAdmin)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@RestController
@RequestMapping("umsAdmin")
@Api(description = "后台用户")
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
    @ApiOperation(value = "获取")
    @GetMapping("selectOne")
    public UmsAdmin selectOne(Long id) {
        return this.umsAdminService.queryById(id);
    }


    @ApiOperation(value = "查询用户列表")
    @GetMapping("list")
    public ResultJson queryListByStatus(Integer status){
        return ResultJson.ok(umsAdminService.queryListByStatus(status));
    }

    @ApiOperation(value = "根据用户查询用户权限")
    @GetMapping("userRole")
    public ResultJson queryUserRole(UserRoleDto userRoleDto){
        return ResultJson.ok(umsAdminService.queryUserAuthority(userRoleDto.getId()));
    }

}