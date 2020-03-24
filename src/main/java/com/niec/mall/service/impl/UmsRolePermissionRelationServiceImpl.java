package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.dao.UmsRolePermissionRelationMapper;
import com.niec.mall.entity.UmsRolePermissionRelation;
import com.niec.mall.service.UmsRolePermissionRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 后台用户角色和权限关系表(UmsRolePermissionRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsRolePermissionRelationService")
public class UmsRolePermissionRelationServiceImpl extends ServiceImpl<UmsRolePermissionRelationMapper,UmsRolePermissionRelation> implements UmsRolePermissionRelationService {
    @Resource
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation queryById(Long id) {
        return this.umsRolePermissionRelationMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param umsRolePermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRolePermissionRelation insert(UmsRolePermissionRelation umsRolePermissionRelation) {
        this.umsRolePermissionRelationMapper.insert(umsRolePermissionRelation);
        return umsRolePermissionRelation;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsRolePermissionRelationMapper.deleteById(id) > 0;
    }
}