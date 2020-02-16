package com.code.chapter04_class_method;

public class StaticTest {

    static {
        a = 6;
    }
    static int a = 9;

    public static void main(String[] args) {
        System.out.println(StaticTest.a);
    }

}
