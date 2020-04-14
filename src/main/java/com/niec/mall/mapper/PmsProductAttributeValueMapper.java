package com.niec.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niec.mall.entity.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Mapper;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Mapper
public interface PmsProductAttributeValueMapper extends BaseMapper<PmsProductAttributeValue> {


}