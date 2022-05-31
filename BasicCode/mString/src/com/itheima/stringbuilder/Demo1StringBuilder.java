package com.itheima.stringbuilder;

public class Demo1StringBuilder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); //获取当前毫秒值
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 50000; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
