package com.code.chapter_05_object;

interface A {
    void test();
}

public class ATest {

    public static void main(String[] args) {

        final int age = 1;
        A a = new A() {

            @Override
            public void test() {

                System.out.println(age);
            }
        };
        a.test();
    }
}
