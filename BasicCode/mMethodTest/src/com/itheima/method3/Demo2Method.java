package com.itheima.method3;

public class Demo2Method {
    public static void main(String[] args) {
        System.out.println(getMax(
                10,20
        ));//输出调用
    }

    public static int getMax(int a, int b){
        if(a<0 || b<0) {
            System.out.println("请传入整数");
            return 0; //return;可以用于结束方法，将方法从栈内存中弹出去，该过程称之为弹栈
        }

        if(a>b){
            return a;
        }else{
            return b;
        }

    }

}
