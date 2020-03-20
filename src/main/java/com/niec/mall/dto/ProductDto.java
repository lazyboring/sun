package com.niec.mall.dto;

import com.niec.mall.entity.tt.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : niec
 * @description
 * @date : 2020-03-19 11:38
 */
@Data
public class ProductDto extends BaseQuery {

    @ApiModelProperty(value = "上新编号",example = "1")
    private Integer id;

    private String name;

    private Double price;
}
