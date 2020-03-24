package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.dao.UmsAdminRoleRelationMapper;
import com.niec.mall.entity.UmsAdminRoleRelation;
import com.niec.mall.service.UmsAdminRoleRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 后台用户和角色关系表(UmsAdminRoleRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsAdminRoleRelationService")
public class UmsAdminRoleRelationServiceImpl extends ServiceImpl<UmsAdminRoleRelationMapper,UmsAdminRoleRelation> implements UmsAdminRoleRelationService {
    @Resource
    private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsAdminRoleRelation queryById(Long id) {
        return this.umsAdminRoleRelationMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param umsAdminRoleRelation 实例对象
     * @return 实例对象
     */
    @Override
    public UmsAdminRoleRelation insert(UmsAdminRoleRelation umsAdminRoleRelation) {
        this.umsAdminRoleRelationMapper.insert(umsAdminRoleRelation);
        return umsAdminRoleRelation;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsAdminRoleRelationMapper.deleteById(id) > 0;
    }
}