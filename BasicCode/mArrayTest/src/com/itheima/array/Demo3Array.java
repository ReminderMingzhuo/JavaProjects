package com.itheima.array;

public class Demo3Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr); //[I@10f87f48
        System.out.println(arr[0]); //0系统分配的初始值为0
        System.out.println(arr[1]); //0
        System.out.println(arr[2]); //0
        System.out.println("------------------");
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        System.out.println(arr[0]); //0系统分配的初始值为0
        System.out.println(arr[1]); //0
        System.out.println(arr[2]); //0
    }
}
