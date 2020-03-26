package com.niec.mall.service;

import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.entity.UmsRole;

import java.util.List;

/**
 * 后台用户角色表(UmsRole)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface UmsRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsRole queryById(Long id);


    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    UmsRole insert(UmsRole umsRole);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<UmsAdmin> getUserListById(Long id);
}