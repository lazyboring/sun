package com.niec.mall.controller;

import com.niec.mall.entity.User;
import com.niec.mall.service.UserService;
import com.niec.mall.vo.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-04-02 15:10:05
 */
@Api("用户")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询")
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        return this.userService.queryById(id);
    }

    @ApiOperation("根据姓和年龄查询人员")
    @GetMapping("nameAndAge")
    public ResultJson query(String name, Integer age) {
        return ResultJson.ok(userService.query(name, age));
    }

    @ApiOperation("根据名字和年龄段查询且email不为空")
    @GetMapping("nameAge")
    public ResultJson queryEmailIsNotNull(String name, Integer lowerAge, Integer higherAge) {
        return ResultJson.ok(userService.queryEmailIsNotNull(name, lowerAge, higherAge));
    }

    @ApiOperation("分页查询")
    @GetMapping("page")
    public ResultJson page(Integer page, Integer size, Integer age) {
        return ResultJson.ok(userService.page(page, size, age));
    }

    @ApiOperation("根据姓名年龄更新")
    @PostMapping("updateByNameAndAge")
    public ResultJson updateByNameAndAge(String name,Integer age){
        return  ResultJson.ok(userService.updateByNameAndAge(name,age));
    }
}