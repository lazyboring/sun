package com.niec.mall.dto;


import com.niec.mall.constant.Insert;
import com.niec.mall.constant.Update;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : niec
 * @description
 * @date : 2020-03-20 10:18
 */
@Data
public class CommodityDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品ID,更新时需要")
    @NotBlank(message = "商品id不能为空", groups = {Update.class})
    private String id;

    @ApiModelProperty(value = "商品名称", example = "美莲达", required = true)
    @NotBlank(message = "商品名称不能为空", groups = {Insert.class, Update.class})
    private String name;

    @ApiModelProperty(value = "商品价格",example = "3.50",required = true)
    @NotNull(message = "商品价格为空",groups = {Insert.class, Update.class})
    @DecimalMin(value = "1.00", message = "商品价格不能小于0", groups = {Insert.class, Update.class})
    private BigDecimal perice;
}
