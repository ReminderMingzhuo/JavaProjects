package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        ArrayList<Student> list = new ArrayList<>();

        switch(choice){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String sid = sc.next();
        Student stu = new Student();
        list.add(stu);
    }

    public static void queryStudent(ArrayList<Student> list){
        System.out.println("学号\t姓名\t年龄"); //\t是大空格
    }

    public static int getIndex(ArrayList<Student> list, String sid){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if(id.equals(sid)){
                index = i;
            }
        }
        return index;
    }
}
