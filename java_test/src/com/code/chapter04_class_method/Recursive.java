package com.code.chapter04_class_method;

/**
 * 
 * @Description: µ›πÈ¡∑œ∞
 * @author: wqk
 * @date: 2020…œŒÁ12:04:08
 * @version: 1.0
 */
public class Recursive {

    public static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * fn(9) + fn(8);
        }
    }

    public static void main(String[] args) {

        System.out.println(10);
    }
}
