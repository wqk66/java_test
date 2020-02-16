package com.java.string;

import java.nio.charset.StandardCharsets;

/**
 * 
 * 字符串和编码
 * @author: wqk
 * @date: 2019下午11:11:09
 * @version: 1.0
 */
public class StringTest {

    /**
     * 
     * @Description: String的两种比较：值比较和地址比较
     * @return: void
     */
    public static void equals() {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("===比较：" + (a == c));
        System.out.println("equals比较：" + a.equals(b));
    }

    /**
     * 
     * @Description: 字符串转换
     * @return: void
     */
    public static void tolowercaseAndtouppercase_test() {

        String a = "hello";
        System.out.println(a);
        a = a.toUpperCase();
        System.out.println(a);
    }

    /**
     * 
     * @Description: 拼接字符串
     * @return: void
     */
    public static void join_test() {

        String[] arr = { "a", "b", "c" };
        String s = String.join("**", arr);
        System.out.println(s);
    }

    public static void main(String[] args) {

        Integer a = Integer.getInteger("java");
        System.out.println(a);

        "hello".getBytes(StandardCharsets.UTF_8);
    }
}
