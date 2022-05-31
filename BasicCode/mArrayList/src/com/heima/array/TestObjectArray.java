package com.heima.array;

import com.heima.domain.Student;

public class TestObjectArray {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("张三", 23);
        arr[0] = stu1;

        System.out.println(arr[0]);
        Student temp = arr[0];
        System.out.println(temp.getAge()+"..."+temp.getName());
    }
}
