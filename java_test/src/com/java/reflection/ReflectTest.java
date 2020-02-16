package com.java.reflection;

public class ReflectTest {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {

        Class stdClass = Student.class;
        System.out.println(stdClass.getDeclaredField("score"));

        System.out.println(stdClass.getField("name"));

        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Student extends Person {
    private int score;
    private int grade;
}

class Person {
    public String name;
}