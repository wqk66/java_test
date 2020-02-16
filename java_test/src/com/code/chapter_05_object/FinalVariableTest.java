package com.code.chapter_05_object;

/**
 * 
 * @Description: final�ؼ�����ϰ
 * @author: wqk
 * @date: 2020����12:40:47
 * @version: 1.0
 */
public class FinalVariableTest {

    final int           a = 6;
    final String        str;
    final int           c;

    final static double d;
    final char          ch;
    {
        str = "hello";
    }
    static {
        d = 5.6;
    }

    public FinalVariableTest() {
        c = 5;
        ch = 'a';
    }

    public void changeFinal() {
        //��ͨ��������Ϊfinal���εĳ�Ա������ֵ
        //        d = 1.2;
    }

    public static void main(String[] args) {
        FinalVariableTest test = new FinalVariableTest();
        System.out.println(test.a);
        System.out.println(test.c);
        System.out.println(test.d);
    }
}
