package com.niec.mall.entity.tt;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "页数", example = "1", required = true)
    @NotNull(message = "页数不能为空")
    @Range(min = 1, max = 9999, message = "超过极限啦")
    private Integer page;

    @ApiModelProperty(value = "每页记录数", example = "20", required = true)
    @NotNull(message = "每页记录数不能为空")
    @Range(min = 1, max = 20, message = "每页不能超过20条记录")
    private Integer limit;
}
