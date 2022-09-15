package com.jianping5.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 * @Author jianping5
 * @create 2022/8/1 17:28
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -3765200691586463790L;

    private String userAccount;

    private String userPassword;
}
