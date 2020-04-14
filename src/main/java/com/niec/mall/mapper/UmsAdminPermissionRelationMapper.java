package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {



}