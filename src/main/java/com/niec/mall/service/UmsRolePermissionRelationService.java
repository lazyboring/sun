package com.niec.mall.service;

import com.niec.mall.entity.UmsRolePermissionRelation;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface UmsRolePermissionRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRolePermissionRelation queryById(Long id);



    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}