package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.LoginUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginUserMapper extends BaseMapper<LoginUser> {
    LoginUser selectByUsername(String username);
}
