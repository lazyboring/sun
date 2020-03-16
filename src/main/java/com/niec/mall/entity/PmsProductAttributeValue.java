package com.niec.mall.entity;

import java.io.Serializable;

/**
 * 存储产品参数信息的表(PmsProductAttributeValue)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public class PmsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = -24862429931636383L;
    
    private Long id;
    
    private Long productId;
    
    private Long productAttributeId;
    /**
    * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
    */
    private String value;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}