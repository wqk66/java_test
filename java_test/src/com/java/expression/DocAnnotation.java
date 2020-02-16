package com.java.expression;

/**
 * 
 * @Description: 
 * <br>网站：www.baidu.com
 * @author: wqk
 * @date: 2020上午12:13:55
 * @version: 1.0
 */
public class DocAnnotation {

    /**
     *  简单的测试Field
     */
    protected String name;

    public String hello(String name) {
        return name + "，您好！";
    }

    /**
     * 
     * @Description: 主方法入口
     * @param args
     * @return: void
     */
    public static void main(String[] args) {

        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值为：" + i + " j的值为：" + j);
                if (j == 1) {
                    break outer;
                }
                System.out.println(11111);
            }
        }

    }
}
