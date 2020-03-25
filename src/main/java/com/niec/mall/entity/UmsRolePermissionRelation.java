package com.niec.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Data
public class UmsRolePermissionRelation implements Serializable {
    private static final long serialVersionUID = -42909390098097026L;
    
    private Long id;
    
    private Long roleId;
    
    private Long permissionId;



}