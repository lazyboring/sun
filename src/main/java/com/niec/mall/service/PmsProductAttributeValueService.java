package com.niec.mall.service;

import com.niec.mall.entity.PmsProductAttributeValue;
import java.util.List;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface PmsProductAttributeValueService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttributeValue queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductAttributeValue> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    PmsProductAttributeValue insert(PmsProductAttributeValue pmsProductAttributeValue);

    /**
     * 修改数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    PmsProductAttributeValue update(PmsProductAttributeValue pmsProductAttributeValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}