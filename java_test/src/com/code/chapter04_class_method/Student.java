package com.code.chapter04_class_method;

class Person {

    public Person() {
    }

    public void say() {
        System.out.println("����˵��");
    }

    public void go() {
        System.out.println("������·");
    }
}

public class Student extends Person {

    public void say() {
        System.out.println("����˵��");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.say();
        p.go();
    }
}
