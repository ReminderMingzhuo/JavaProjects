package com.itheima.exception;

public class ArrayException {
    public static void main(String[] args) {
        //索引越界
        int[] arr = new int[3]; // 0 1 2
        System.out.println(arr[10]);

        //空指针异常
        arr = null; //空值
        System.out.println(arr[0]);

    }
}
