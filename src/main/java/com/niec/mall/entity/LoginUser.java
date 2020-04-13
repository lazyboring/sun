package com.niec.mall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : niec
 * @description
 * @date : 2020-04-13 17:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {
    String Id;
    String username;
    String password;
}
