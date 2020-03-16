package com.niec.mall.service.impl;

import com.niec.mall.entity.PmsProductAttributeValue;
import com.niec.mall.dao.PmsProductAttributeValueDao;
import com.niec.mall.service.PmsProductAttributeValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Service("pmsProductAttributeValueService")
public class PmsProductAttributeValueServiceImpl implements PmsProductAttributeValueService {
    @Resource
    private PmsProductAttributeValueDao pmsProductAttributeValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeValue queryById(Long id) {
        return this.pmsProductAttributeValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductAttributeValue> queryAllByLimit(int offset, int limit) {
        return this.pmsProductAttributeValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeValue insert(PmsProductAttributeValue pmsProductAttributeValue) {
        this.pmsProductAttributeValueDao.insert(pmsProductAttributeValue);
        return pmsProductAttributeValue;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttributeValue update(PmsProductAttributeValue pmsProductAttributeValue) {
        this.pmsProductAttributeValueDao.update(pmsProductAttributeValue);
        return this.queryById(pmsProductAttributeValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttributeValueDao.deleteById(id) > 0;
    }
}