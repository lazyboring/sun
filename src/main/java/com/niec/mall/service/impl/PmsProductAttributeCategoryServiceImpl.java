package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsProductAttributeCategory;
import com.niec.mall.dao.PmsProductAttributeCategoryDao;
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
    private PmsProductAttributeCategoryDao pmsProductAttributeCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeCategory queryById(Long id) {
        return this.pmsProductAttributeCategoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductAttributeCategory> queryAllByLimit(int offset, int limit) {
        return this.pmsProductAttributeCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeCategory insert(PmsProductAttributeCategory pmsProductAttributeCategory) {
        this.pmsProductAttributeCategoryDao.insert(pmsProductAttributeCategory);
        return pmsProductAttributeCategory;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeCategory update(PmsProductAttributeCategory pmsProductAttributeCategory) {
        this.pmsProductAttributeCategoryDao.update(pmsProductAttributeCategory);
        return this.queryById(pmsProductAttributeCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeCategoryDao.deleteById(id) > 0;
    }
}