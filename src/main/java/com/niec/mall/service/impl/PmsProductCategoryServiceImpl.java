package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsProductCategory;
import com.niec.mall.dao.PmsProductCategoryDao;
import com.niec.mall.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品分类(PmsProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductCategoryService")
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Resource
    private PmsProductCategoryDao pmsProductCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductCategory queryById(Long id) {
        return this.pmsProductCategoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductCategory> queryAllByLimit(int offset, int limit) {
        return this.pmsProductCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductCategory insert(PmsProductCategory pmsProductCategory) {
        this.pmsProductCategoryDao.insert(pmsProductCategory);
        return pmsProductCategory;
    }

    /**
     * 修改数据
     *
     * @param pmsProductCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductCategory update(PmsProductCategory pmsProductCategory) {
        this.pmsProductCategoryDao.update(pmsProductCategory);
        return this.queryById(pmsProductCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductCategoryDao.deleteById(id) > 0;
    }
}