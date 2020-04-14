package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.LoginUserMapper;
import com.niec.mall.entity.LoginUser;
import com.niec.mall.service.LoginUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : niec
 * @description
 * @date : 2020-04-13 17:13
 */
@Service("loginUserService")
public class LoginUserServiceImpl extends ServiceImpl<LoginUserMapper, LoginUser> implements LoginUserService {
    @Resource
    private LoginUserMapper loginUserMapper;
    @Override
    public LoginUser findUserById(String userId) {
        return baseMapper.selectById(userId);
    }

    @Override
    public LoginUser findByUsername(LoginUser user) {

        return loginUserMapper.selectByUsername(user.getUsername());
    }
}
