package com.java.expression;

/**
 * 
 * @Description: 
 * <br>��վ��www.baidu.com
 * @author: wqk
 * @date: 2020����12:13:55
 * @version: 1.0
 */
public class DocAnnotation {

    /**
     *  �򵥵Ĳ���Field
     */
    protected String name;

    public String hello(String name) {
        return name + "�����ã�";
    }

    /**
     * 
     * @Description: ���������
     * @param args
     * @return: void
     */
    public static void main(String[] args) {

        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i��ֵΪ��" + i + " j��ֵΪ��" + j);
                if (j == 1) {
                    break outer;
                }
                System.out.println(11111);
            }
        }

    }
}
