package com.niec.mall.service;

import com.niec.mall.entity.PmsBrand;
import java.util.List;

/**
 * 品牌表(PmsBrand)表服务接口
 *
 * @author makejava
 * @since 2020-03-16 11:01:49
 */
public interface PmsBrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsBrand queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsBrand> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    PmsBrand insert(PmsBrand pmsBrand);

    /**
     * 修改数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    PmsBrand update(PmsBrand pmsBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}