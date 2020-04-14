package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-02 15:10:05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}