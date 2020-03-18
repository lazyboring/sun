package com.niec.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.dto.PmsBrandDto;
import com.niec.mall.entity.PmsBrand;
import com.niec.mall.vo.PmsBrandListDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 品牌表(PmsBrand)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:48
 */
@Mapper
public interface PmsBrandDao extends BaseMapper<PmsBrandDto> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsBrand queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsBrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsBrand 实例对象
     * @return 对象列表
     */
    List<PmsBrand> queryAll(PmsBrand pmsBrand);

    /**
     * 新增数据
     *
     * @param pmsBrand 实例对象
     * @return 影响行数
     */
    int insert(PmsBrand pmsBrand);

    /**
     * 修改数据
     *
     * @param pmsBrand 实例对象
     * @return 影响行数
     */
    int update(PmsBrand pmsBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过工厂状态查询品牌列表
     * @param factoryStatus
     * @return
     */
    List<PmsBrandListDto> queryListByFactoryStatus(Integer factoryStatus);
}