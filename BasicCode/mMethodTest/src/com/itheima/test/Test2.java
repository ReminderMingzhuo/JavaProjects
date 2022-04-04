package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11,44,55,22,33};
        int[] maxAndMin = getMax(arr);
        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);

    }

    public static int[] getMax(int[] arr) {

        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int[] maxAndMin = {min,max};
        return maxAndMin;
    }
}
