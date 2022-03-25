package com.itheima.test;

//动态获取数组元素个数：数组名.length
public class Test1Array {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("arr数组中元素的个数为：" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //遍历是取出元素的过程
    }

}
