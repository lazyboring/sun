package com.niec.mall.service;

import com.niec.mall.entity.PmsProductAttributeValue;

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
     * 新增数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 实例对象
     */
    PmsProductAttributeValue insert(PmsProductAttributeValue pmsProductAttributeValue);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}