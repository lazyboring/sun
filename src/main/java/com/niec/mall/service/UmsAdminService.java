package com.niec.mall.service;

import com.niec.mall.dto.UmsAdminDto;
import com.niec.mall.dto.UserDto;
import com.niec.mall.entity.UmsAdmin;

import java.util.List;

/**
 * 后台用户表(UmsAdmin)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface UmsAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsAdmin queryById(Long id);



    /**
     * 新增数据
     *
     * @param umsAdmin 实例对象
     * @return 实例对象
     */
    UmsAdmin insert(UmsAdmin umsAdmin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);


    void addUmsAdmin(UmsAdminDto umsAdminDto);

    List<UserDto> getUserList();
}