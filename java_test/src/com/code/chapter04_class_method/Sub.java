package com.code.chapter04_class_method;

public class Sub extends Base {

    private String name;

    public void test() {
        System.out.println("子类重写父类的方法，其字段长度为" + name.length());
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
        System.out.println("将被子类重写的方法");
    }

}
