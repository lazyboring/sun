package com.niec.mall.service;

import com.niec.mall.entity.UmsAdminRoleRelation;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface UmsAdminRoleRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdminRoleRelation queryById(Long id);

    /**
     * 新增数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 实例对象
     */
    UmsAdminRoleRelation insert(UmsAdminRoleRelation umsAdminRoleRelation);



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}