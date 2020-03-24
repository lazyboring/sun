package com.niec.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.UmsAdminRoleRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {



}