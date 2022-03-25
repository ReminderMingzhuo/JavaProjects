package com.itheima.array;

public class Demo2Array {
    public static void main(String[] args) {
        /*
        - 动态初始化
  - 初始化时只指定数组长度，由系统为数组分配初始值。
  - 格式：数据类型[] 变量名 = new 数据类型[数组长度];
  - e.g.  int[] arr = new int[3];

            注意：在打印数组变量的时候，会打印出数组的内存地址
         */
        int[] arr = new int[5]; //通过new关键字创建了一个int类型的数组容器，该容器可以存储5个int类型的整数，该容器被arr数组变量所记录
        //arr堆，new栈
        int i = 1;   //基本数据类型没有地址值，存在堆中
        arr[0]=55;
        arr[1]=55;
        System.out.println(arr[0]); //[I@10f87f48
        // [ ： 当前空间是一个数组类型
        // @ ； 分隔符
        // I ： 当前数组容器中所存储的数据类型
        //10f87f48 ： 十六进制内存地址
        byte[] bArr = new byte[3];
        System.out.println(bArr); //[B@b4c966a
    }
}
