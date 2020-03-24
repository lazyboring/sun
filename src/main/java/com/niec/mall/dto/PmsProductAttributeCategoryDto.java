package com.niec.mall.dto;

import com.baomidou.mybatisplus.core.conditions.update.Update;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author : niec
 * @description
 * @date : 2020-03-23 19:46
 */
@Data
public class PmsProductAttributeCategoryDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用品ID,更新时需要")
    @NotBlank(message = "用品id不能为空", groups = {Update.class})
    private String id;
}
