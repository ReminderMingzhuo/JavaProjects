package com.heima.test;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            //"test"在常量池中，调方法，绝对不会出现空指针异常
            if("test".equals(s)){
                list.remove(i);
                i--;
            }
        }
    }
}
