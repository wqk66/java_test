package com.code.chapter_05_object;

/**
 * 
 * @Description: 外部类
 * @author: wqk
 * @date: 2020下午9:41:45
 * @version: 1.0
 */
public class Outer {

    private int outProp = 9;

    class Inner {
        private int inProp = 5;

        public void acessOutProp() {
            System.out.println("外部类的outprop值：" + outProp);
        }
    }

    public void acessInnerProp() {
        System.out.println("内部类的inProp：" + new Inner().inProp);
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.acessInnerProp();
    }
}
