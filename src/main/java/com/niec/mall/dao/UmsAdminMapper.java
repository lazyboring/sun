package com.niec.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.dto.UserDto;
import com.niec.mall.entity.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 后台用户表(UmsAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {

//    妨害风化dfsfafahgfkjagfkagfkgkgfakgakfga
    List<UserDto> selectUserDtoList();
}