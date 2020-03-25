package com.niec.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Data
public class UmsAdminRoleRelation implements Serializable {
    private static final long serialVersionUID = 532299046180756926L;
    
    private Long id;
    
    private Long adminId;
    
    private Long roleId;



}