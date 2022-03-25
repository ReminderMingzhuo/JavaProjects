package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
        System.out.println("好了");
    }

    /*
    定义一个方法，对数组遍历
    1.参数    int[] arr
    2.返回值类型  void
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            if(i == arr.length - 1){
                System.out.println(arr[i]+"]"); //最后一个元素
            } else
            System.out.print(arr[i]+", ");
        }
    }



}
