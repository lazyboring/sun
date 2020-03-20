package com.niec.mall.service;

import com.niec.mall.entity.PmsProductAttributeCategory;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface PmsProductAttributeCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttributeCategory queryById(Long id);


    /**
     * 新增数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 实例对象
     */
    PmsProductAttributeCategory insert(PmsProductAttributeCategory pmsProductAttributeCategory);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}