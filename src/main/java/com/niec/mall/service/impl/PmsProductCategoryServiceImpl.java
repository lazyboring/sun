package com.niec.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.niec.mall.mapper.PmsProductCategoryMapper;
import com.niec.mall.entity.PmsProductCategory;
import com.niec.mall.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 产品分类(PmsProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductCategoryService")
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper,PmsProductCategory> implements PmsProductCategoryService {
    @Resource
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductCategory queryById(Long id) {
        return this.pmsProductCategoryMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param pmsProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductCategory insert(PmsProductCategory pmsProductCategory) {
        this.pmsProductCategoryMapper.insert(pmsProductCategory);
        return pmsProductCategory;
    }


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductCategoryMapper.deleteById(id) > 0;
    }
}