package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.UmsPermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户权限表(UmsPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsPermissionMapper extends BaseMapper<UmsPermission> {


}