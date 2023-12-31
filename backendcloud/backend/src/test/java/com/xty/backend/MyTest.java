package com.xty.backend;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

public class MyTest {
    @Test
    public void testPassword() {
        //创建解析器
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        //对密码进行加密
//        String password = encoder.encode("123456");
//        System.out.println("------------"+password);

        String s = "$2a$10$25Ty/Z2LvFaV/TK9/Q1DR.KW7FMEe5Zyj4f9mFrJWIAl6iO/DYTvy";

        System.out.println(encoder.matches("", s));
//        //判断原字符加密后和内容是否匹配
//        boolean result = encoder.matches("123",password);
//        System.out.println("============="+result);
    }

    @Test
    public void testDate() {
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void test() {
        Integer a = 1;
        Integer b = 1;
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
