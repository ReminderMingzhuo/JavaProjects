package com.itheima.string;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.println("请输入用户名");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码");
            String scPassword = sc.nextLine();
            if (username.equals(scUsername) && password.equals(scPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的登录次数已达到今日上限，请明天再来");
                } else {
                    System.out.println("登录失败，您还剩余" + (2 - i) + "次机会");
                }
            }
        }
    }
}
