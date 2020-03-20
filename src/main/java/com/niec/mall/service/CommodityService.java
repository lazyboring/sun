package com.niec.mall.service;

import com.niec.mall.entity.Commodity;

/**
 * (Commodity)表服务接口
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
public interface CommodityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Commodity queryById(Long id);



    /**
     * 新增数据
     *
     * @param commodity 实例对象
     * @return 实例对象
     */
    Commodity insert(Commodity commodity);



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}