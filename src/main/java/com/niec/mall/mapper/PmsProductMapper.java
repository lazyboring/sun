package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.PmsProduct;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品信息(PmsProduct)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface PmsProductMapper extends BaseMapper<PmsProduct> {


}