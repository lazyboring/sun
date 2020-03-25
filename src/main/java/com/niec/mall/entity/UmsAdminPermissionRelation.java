package com.niec.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Data
public class UmsAdminPermissionRelation implements Serializable {
    private static final long serialVersionUID = -74341307049073236L;
    
    private Long id;
    
    private Long adminId;
    
    private Long permissionId;
    
    private Integer type;




}