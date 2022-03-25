package com.itheima.test;

import java.util.Scanner;

public class Test5Array {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("成绩有误");
                i--; //成绩有误i--，重头再来
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (sum - min - max) / (arr.length - 2);
        System.out.println("平均成绩为：" + avg);


    }
}
