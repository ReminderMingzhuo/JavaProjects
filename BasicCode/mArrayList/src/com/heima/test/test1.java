package com.heima.test;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        //list.fori
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
