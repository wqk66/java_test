package com.java.string;

import java.util.StringJoiner;

public class StringJoinTest {

    public static void main(String[] args) {
        join_test();
    }

    public static void stringjoiner_test() {
        String[] names = { "Bob", "Alice", "Grace" };
        StringJoiner s = new StringJoiner(",", "hello ", "!");
        for (String name : names) {
            s.add(name);
        }
        System.out.println(s.toString());
    }

    public static void join_test() {

        String[] names = { "Bob", "Alice", "Grace" };
        String s = String.join(",", names);
        System.out.println(s);
    }
}
