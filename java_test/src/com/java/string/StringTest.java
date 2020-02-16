package com.java.string;

import java.nio.charset.StandardCharsets;

/**
 * 
 * �ַ����ͱ���
 * @author: wqk
 * @date: 2019����11:11:09
 * @version: 1.0
 */
public class StringTest {

    /**
     * 
     * @Description: String�����ֱȽϣ�ֵ�ȽϺ͵�ַ�Ƚ�
     * @return: void
     */
    public static void equals() {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("===�Ƚϣ�" + (a == c));
        System.out.println("equals�Ƚϣ�" + a.equals(b));
    }

    /**
     * 
     * @Description: �ַ���ת��
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
     * @Description: ƴ���ַ���
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
