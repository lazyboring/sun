package com.niec.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
@Data
public class PmsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = -24862429931636383L;
    
    private Long id;
    
    private Long productId;
    
    private Long productAttributeId;
    /**
    * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    */
    private String value;



}