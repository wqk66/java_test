package com.code.chapter_05_object;

public class StrictFpTest {

    public static void main(String[] args) {

        StrictFpTest test = new StrictFpTest();
        test.test();
    }

    public strictfp void test() {
        float f = 1.22f;
        float f2 = 1.33f;
        System.out.println(f + f2);
    }
}
