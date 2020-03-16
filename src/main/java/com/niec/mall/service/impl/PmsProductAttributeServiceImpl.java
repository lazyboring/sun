package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsProductAttribute;
import com.niec.mall.dao.PmsProductAttributeDao;
import com.niec.mall.service.PmsProductAttributeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品属性参数表(PmsProductAttribute)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductAttributeService")
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService {
    @Resource
    private PmsProductAttributeDao pmsProductAttributeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttribute queryById(Long id) {
        return this.pmsProductAttributeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductAttribute> queryAllByLimit(int offset, int limit) {
        return this.pmsProductAttributeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttribute insert(PmsProductAttribute pmsProductAttribute) {
        this.pmsProductAttributeDao.insert(pmsProductAttribute);
        return pmsProductAttribute;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttribute 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttribute update(PmsProductAttribute pmsProductAttribute) {
        this.pmsProductAttributeDao.update(pmsProductAttribute);
        return this.queryById(pmsProductAttribute.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeDao.deleteById(id) > 0;
    }
}