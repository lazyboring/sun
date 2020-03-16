package com.niec.mall.dao;

import com.niec.mall.entity.PmsProductAttributeCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 产品属性分类表(PmsProductAttributeCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface PmsProductAttributeCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttributeCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductAttributeCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 对象列表
     */
    List<PmsProductAttributeCategory> queryAll(PmsProductAttributeCategory pmsProductAttributeCategory);

    /**
     * 新增数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 影响行数
     */
    int insert(PmsProductAttributeCategory pmsProductAttributeCategory);

    /**
     * 修改数据
     *
     * @param pmsProductAttributeCategory 实例对象
     * @return 影响行数
     */
    int update(PmsProductAttributeCategory pmsProductAttributeCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}