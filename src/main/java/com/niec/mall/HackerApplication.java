package com.niec.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication
@MapperScan("com.niec.mall.dao")
public class HackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HackerApplication.class, args);
    }
}
