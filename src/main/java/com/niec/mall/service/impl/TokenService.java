package com.niec.mall.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.niec.mall.entity.LoginUser;
import org.springframework.stereotype.Service;

/**
 * @author : niec
 * @description
 * @date : 2020-04-13 19:00
 */
@Service("TokenService")
public class TokenService {
    public String getToken(LoginUser user) {
        String token="";
        token= JWT.create().withAudience(user.getId())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}
