package com.itheima.method2;

public class Demo1Method {
    public static void main(String[] args) {
        isEvenNumber(10);
        isEvenNumber(11);
    }

    public static void isEvenNumber(int num){
        if(num%2 == 0) {
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
