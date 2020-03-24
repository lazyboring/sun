package com.niec.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.PmsProductCategory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品分类(PmsProductCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {


}