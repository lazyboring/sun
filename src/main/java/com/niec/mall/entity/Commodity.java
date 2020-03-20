package com.niec.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Commodity)实体类
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
@Data
public class Commodity implements Serializable {
    private static final long serialVersionUID = 265425068772829861L;
    
    private Long id;
    
    private String name;
    
    private Integer price;



}