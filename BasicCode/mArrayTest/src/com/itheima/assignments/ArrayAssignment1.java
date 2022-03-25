package com.itheima.assignments;

public class ArrayAssignment1 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("加油！");
        System.out.println("Min: " + min);
    }
}