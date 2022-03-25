package com.itheima.test;

import java.util.Scanner;

//键盘录入五个数，存储到数组中，并对数组求和
public class Test3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("sum:"+sum);
    }
}
