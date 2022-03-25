package com.itheima.test;

import java.util.Scanner;

public class Test4Array {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的元素");
        int num = sc.nextInt();
        int index = -1; //定义一个索引变量
        for(int i =0;i<arr.length;i++){
            if(num==arr[i]){
                index =i;
                break;
            }
        }
        System.out.println(index);

    }
}
