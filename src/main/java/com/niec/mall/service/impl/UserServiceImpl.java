package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.UserMapper;
import com.niec.mall.entity.User;
import com.niec.mall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-04-02 15:10:05
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userMapper.insert(user);
        return user;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return userMapper.deleteById(id)>0;
    }

    @Override
    public List query(String name, Integer age) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>().lambda();
        lambdaQueryWrapper.likeRight(User::getName, name).and(wq -> wq.lt(User::getAge, age));
        List<User> userList = userMapper.selectList(lambdaQueryWrapper);
        return userList;
    }

    @Override
    public List queryEmailIsNotNull(String name, Integer lowerAge, Integer higherAge) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>().lambda();
        lambdaQueryWrapper.like(User::getName, name).and(wq -> wq.ge(User::getAge, lowerAge)).and(wq -> wq.le(User::getAge, higherAge)).and(wq -> wq.isNotNull(User::getEmail));
        List<User> userList = userMapper.selectList(lambdaQueryWrapper);
        return userList;
    }

    @Override
    public Page page(Integer page, Integer size, Integer age) {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>().lambda();
        lambdaQueryWrapper.ge(User::getAge, age);
        Page<User> userPage = new Page<>(page, size);
        IPage<User> userIPage = userMapper.selectPage(userPage, lambdaQueryWrapper);
//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//        userQueryWrapper.ge("age",age);
//        Page<User> userPage = new Page<User>(page, size);
//        IPage<User> userIPage = userMapper.selectPage(userPage, userQueryWrapper);
        System.out.println("总页数" + userIPage.getPages());
        System.out.println("总记录数" + userIPage.getTotal());
        List<User> userList = userIPage.getRecords();
        userList.forEach(System.out::println);
        return (Page) userIPage;
    }

    @Override
    public Integer updateByNameAndAge(String name, Integer age) {
        LambdaUpdateWrapper<User> updateWrapper = Wrappers.<User>lambdaUpdate();
        updateWrapper.eq(User::getName,name).eq(User::getAge,age).set(User::getAge,++age);
        int rows = userMapper.update(null, updateWrapper);
        return rows;
    }

}