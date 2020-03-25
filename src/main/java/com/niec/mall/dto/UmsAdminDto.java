package com.niec.mall.dto;

import lombok.Data;

/**
 * @author : niec
 * @description
 * @date : 2020-03-24 15:52
 */
@Data
public class UmsAdminDto {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private String email;

    private String note;
}
