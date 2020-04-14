package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.UmsRoleMapper;
import com.niec.mall.entity.UmsAdmin;
import com.niec.mall.entity.UmsRole;
import com.niec.mall.service.UmsRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 后台用户角色表(UmsRole)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("umsRoleService")
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper,UmsRole> implements UmsRoleService {
    @Resource
    private UmsRoleMapper umsRoleMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsRole queryById(Long id) {
        return this.umsRoleMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param umsRole 实例对象
     * @return 实例对象
     */
    @Override
    public UmsRole insert(UmsRole umsRole) {
        this.umsRoleMapper.insert(umsRole);
        return umsRole;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsRoleMapper.deleteById(id) > 0;
    }

    @Override
    public List<UmsAdmin> getUserListById(Long id) {
        List<UmsAdmin> list = umsRoleMapper.getUserListById(id);
        return list;
    }
}