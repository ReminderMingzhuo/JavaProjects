package com.heima.list;

import java.util.ArrayList;

public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");

        String s1 = list.get(0);
        System.out.println(s1);
        int sz = list.size();
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        boolean b1 = list.remove("abc");
        boolean b2 = list.remove("zzz"); // 返回删除状态
        String s1 = list.remove(0); //返回被删除的元素

        String s2 = list.set(0,"123");  //返回被修改的元素
    }
}
