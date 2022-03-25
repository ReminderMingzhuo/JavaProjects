package com.itheima.test;

public class Test2Array {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 63};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max:" + max);
    }
}
