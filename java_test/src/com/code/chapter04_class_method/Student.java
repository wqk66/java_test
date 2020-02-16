package com.code.chapter04_class_method;

class Person {

    public Person() {
    }

    public void say() {
        System.out.println("父类说话");
    }

    public void go() {
        System.out.println("父类走路");
    }
}

public class Student extends Person {

    public void say() {
        System.out.println("子类说话");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.say();
        p.go();
    }
}
