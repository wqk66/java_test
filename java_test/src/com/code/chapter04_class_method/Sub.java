package com.code.chapter04_class_method;

public class Sub extends Base {

    private String name;

    public void test() {
        System.out.println("������д����ķ��������ֶγ���Ϊ" + name.length());
    }

    public static void main(String[] args) {

        Sub s = new Sub();
    }
}

class Base {
    public Base() {
        test();
    }

    public void test() {
        System.out.println("����������д�ķ���");
    }

}
