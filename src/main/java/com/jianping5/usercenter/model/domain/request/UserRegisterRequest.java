package com.jianping5.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @Author jianping5
 * @create 2022/8/1 17:29
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3011477356810503058L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
