package com.niec.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsRolePermissionRelationMapper extends BaseMapper<UmsRolePermissionRelation> {


}