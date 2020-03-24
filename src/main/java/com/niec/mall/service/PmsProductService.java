package com.niec.mall.service;

import com.niec.mall.entity.PmsProduct;

/**
 * 商品信息(PmsProduct)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public interface PmsProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProduct queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsProduct 实例对象
     * @return 实例对象
     */
    PmsProduct insert(PmsProduct pmsProduct);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);


}