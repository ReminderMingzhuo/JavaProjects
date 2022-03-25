package com.itheima.overload;

public class Demo1Overload {
    public static void main(String[] args) {
        short a = 10;
        short b = 1;
        System.out.println(compare(a,b));
    }

    public static boolean compare (int a, int b) {
        return a == b;
    }
    public static boolean compare (byte a, byte b) {
        return a == b;
    }
    public static boolean compare (short a, short b) {
        return a == b;
    }
    public static boolean compare (long a, long b) {
        return a == b;
    }
    public static boolean compare (double a, double b) {
        return a == b;
    }
}
