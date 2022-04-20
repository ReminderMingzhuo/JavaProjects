package com.itheima.string;

public class Demo2String {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1); //String这个类比较特殊，打印其对象名的时候，不会出现内存地址，而是该对象记录的真实内容，Object类，面向对象-继承
        //字符数组
        char[]  chs = {'a','b'};
        String s2 = new String(chs);
        System.out.println(s2);
        //字符串
        String s3 = new String("123");
        System.out.println(s3);
    }
}
