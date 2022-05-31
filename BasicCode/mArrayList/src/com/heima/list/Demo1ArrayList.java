package com.heima.list;

import java.util.ArrayList;

//集合容器如果没有加入<> 就可以存储任意数据类型
//<>泛型：对集合容器存储的数据类型进行限制
public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add(0,"666");
        //list.add(123);
        //list.add(true);
        System.out.println(list);
    }
}
