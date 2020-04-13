package com.niec.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.niec.mall.annotation.UserLoginToken;
import com.niec.mall.entity.LoginUser;
import com.niec.mall.service.LoginUserService;
import com.niec.mall.service.impl.TokenService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : niec
 * @description
 * @date : 2020-04-13 18:58
 */
@Api("登录")
@RestController
@RequestMapping("api")
public class LoginUserController {
    @Autowired
    LoginUserService userService;
    @Autowired
    TokenService tokenService;
    //登录
    @PostMapping("/login")
    public Object login(@RequestBody LoginUser user){
        JSONObject jsonObject=new JSONObject();
      LoginUser userForBase=userService.findByUsername(user);
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}
