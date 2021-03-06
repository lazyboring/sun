package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.entity.UmsRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 后台用户角色表(UmsRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface UmsRoleMapper extends BaseMapper<UmsRole> {


    List<UmsAdmin> getUserListById(Long id);
}