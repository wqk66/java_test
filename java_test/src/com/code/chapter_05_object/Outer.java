package com.code.chapter_05_object;

/**
 * 
 * @Description: �ⲿ��
 * @author: wqk
 * @date: 2020����9:41:45
 * @version: 1.0
 */
public class Outer {

    private int outProp = 9;

    class Inner {
        private int inProp = 5;

        public void acessOutProp() {
            System.out.println("�ⲿ���outpropֵ��" + outProp);
        }
    }

    public void acessInnerProp() {
        System.out.println("�ڲ����inProp��" + new Inner().inProp);
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.acessInnerProp();
    }
}
