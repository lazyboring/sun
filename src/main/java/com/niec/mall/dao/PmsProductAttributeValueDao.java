package com.niec.mall.dao;

import com.niec.mall.entity.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface PmsProductAttributeValueDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttributeValue queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductAttributeValue> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 对象列表
     */
    List<PmsProductAttributeValue> queryAll(PmsProductAttributeValue pmsProductAttributeValue);

    /**
     * 新增数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 影响行数
     */
    int insert(PmsProductAttributeValue pmsProductAttributeValue);

    /**
     * 修改数据
     *
     * @param pmsProductAttributeValue 实例对象
     * @return 影响行数
     */
    int update(PmsProductAttributeValue pmsProductAttributeValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}