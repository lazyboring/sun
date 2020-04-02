package com.niec.mall.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-02 15:10:05
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 394144134152575660L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 直属上级id
     */
    private Long managerId;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *逻辑删除
     */
    @TableLogic
    private Integer deleted;

}