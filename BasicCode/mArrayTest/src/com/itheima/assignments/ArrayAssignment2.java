package com.itheima.assignments;

public class ArrayAssignment2 {
    public static void main(String[] args) {
        double[] arr = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                plus++;
            } else {
                minus++;
            }
        }
        System.out.println("赚钱的股票一共有：" + plus + "支");
        System.out.println("赔钱的股票一共有：" + minus + "支");
    }
}