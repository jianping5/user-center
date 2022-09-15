package com.jianping5.usercenter.service;

import com.jianping5.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author 靑
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserName("admin");
        user.setUserAccount("123");
        user.setAvatarUrl("https://cdn.acmcoder.com/client/files/1648890631273.jpeg");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("asd");
        user.setEmail("123");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }

    @Test
    void userRegister() {
        String userAccount = "qing";
        String userPassword = "123456789";
        String checkPassword = "123456789";
        String planetCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "12";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "qing";
        userPassword = "1234";
        checkPassword = "1234";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "admin";
        userPassword = "123456789";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "q ing";
        userPassword = "123456789";
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
        userAccount = "qing";
        userPassword = "123456789";
        checkPassword = "567123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
    }
}