package com.niec.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : niec
 * @description
 * @date : 2020-03-19 11:38
 */
@Data
public class PmsProductDto implements Serializable {

    @ApiModelProperty(value = "主键id",example = "24",required = true)
    private Long id;

    @ApiModelProperty(value = "名称",example = "可口可乐",required = true)
    private String name;

    @ApiModelProperty(value = "价格",example = "10.0",required = true)
    private BigDecimal price;
}
