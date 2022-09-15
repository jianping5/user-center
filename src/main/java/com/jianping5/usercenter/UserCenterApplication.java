package com.jianping5.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jianping5.usercenter.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}


