package com.java.regex;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: ∆•≈‰πÊ‘Ú
 * @author: wqk
 * @date: 2019œ¬ŒÁ11:55:05
 * @version: 1.0
 */
public class RegexRegular {

    public static void main(String[] args) {
        matcher3();
    }

    public static void matcher1() {

        String re1 = "abc";
        System.out.println("abc".matches(re1));
        System.out.println("Abc".matches(re1));
        System.out.println("abcd".matches(re1));

        String re2 = "a\\&c";
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));

    }

    public static void matcher2() {
        String re = "\\d";

        List<String> list = new ArrayList<String>();
        list.add("010-12345678");
        list.add("020-9999999");
        list.add("0755-7654321");

        for (String s : list) {
            if (!s.matches(re)) {
                System.out.println("≤‚ ‘ ß∞‹£∫" + s);
                return;
            }

        }
        System.out.println("≤‚ ‘≥…π¶");
    }

    public static void matcher3() {
        String re = "learn\\s([J|j]ava|[P|p]hp|[G|g]o)";
        System.out.println("learn Java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn go".matches(re));
    }
}
