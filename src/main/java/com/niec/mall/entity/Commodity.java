package com.niec.mall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (Commodity)实体类
 *
 * @author makejava
 * @since 2020-03-19 20:13:34
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Commodity implements Serializable {
    private static final long serialVersionUID = 265425068772829861L;

    @TableId("id")
    private String id;
    
    private String name;
    
    private BigDecimal price;



}