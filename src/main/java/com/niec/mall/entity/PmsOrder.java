package com.niec.mall.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-04-18 14:50:25
 */
@Data
public class PmsOrder implements Serializable {
    private static final long serialVersionUID = 784167282351787063L;
    
    private String id;
    
    private Date createDate;
    
    private String memberId;
    
    private String productId;
    
    private Double price;




}