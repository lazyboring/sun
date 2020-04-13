package com.niec.mall.service;

import com.niec.mall.entity.LoginUser;

public interface LoginUserService {
    LoginUser findUserById(String userId);

    LoginUser findByUsername(LoginUser user);
}
