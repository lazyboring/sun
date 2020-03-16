package com.niec.mall.entity;

import java.io.Serializable;

/**
 * 产品属性分类表(PmsProductAttributeCategory)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:01:51
 */
public class PmsProductAttributeCategory implements Serializable {
    private static final long serialVersionUID = 548410088712939578L;
    
    private Long id;
    
    private String name;
    /**
    * 属性数量
    */
    private Integer attributeCount;
    /**
    * 参数数量
    */
    private Integer paramCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

}