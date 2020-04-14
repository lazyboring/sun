package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.UmsPermissionMapper;
import com.niec.mall.entity.UmsPermission;
import com.niec.mall.service.UmsPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 后台用户权限表(UmsPermission)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsPermissionService")
public class UmsPermissionServiceImpl extends ServiceImpl<UmsPermissionMapper,UmsPermission> implements UmsPermissionService {
    @Resource
    private UmsPermissionMapper umsPermissionMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsPermission queryById(Long id) {
        return this.umsPermissionMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param umsPermission 实例对象
     * @return 实例对象
     */
    @Override
    public UmsPermission insert(UmsPermission umsPermission) {
        this.umsPermissionMapper.insert(umsPermission);
        return umsPermission;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsPermissionMapper.deleteById(id) > 0;
    }
}