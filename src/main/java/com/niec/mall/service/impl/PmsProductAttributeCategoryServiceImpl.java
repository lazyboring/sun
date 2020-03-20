package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsProductAttributeCategory;
import com.niec.mall.dao.PmsProductAttributeCategoryMapper;
import com.niec.mall.service.PmsProductAttributeCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductAttributeCategoryService")
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Resource
    private PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeCategory queryById(Long id) {
        return this.pmsProductAttributeCategoryMapper.selectById(id);
    }


    /**
     * 新增数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeCategory insert(PmsProductAttributeCategory pmsProductAttributeCategory) {
        this.pmsProductAttributeCategoryMapper.insert(pmsProductAttributeCategory);
        return pmsProductAttributeCategory;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeCategoryMapper.deleteById(id) > 0;
    }
}