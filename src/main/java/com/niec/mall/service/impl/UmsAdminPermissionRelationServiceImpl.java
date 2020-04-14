package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.UmsAdminPermissionRelationMapper;
import com.niec.mall.entity.UmsAdminPermissionRelation;
import com.niec.mall.service.UmsAdminPermissionRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)(UmsAdminPermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsAdminPermissionRelationService")
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper,UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {
    @Resource
    private UmsAdminPermissionRelationMapper umsAdminPermissionRelationMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdminPermissionRelation queryById(Long id) {
        return this.umsAdminPermissionRelationMapper.selectById(id);
    }



    /**
     * 新增数据
     *
     * @param umsAdminPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminPermissionRelation insert(UmsAdminPermissionRelation umsAdminPermissionRelation) {
        this.umsAdminPermissionRelationMapper.insert(umsAdminPermissionRelation);
        return umsAdminPermissionRelation;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsAdminPermissionRelationMapper.deleteById(id) > 0;
    }
}