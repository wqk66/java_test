package com.java.generic;

public class GenericTest2 {

    public static void main(String[] args) {

        Box<Number> name = new Box<Number>(1);
        Box<Integer> age = new Box<Integer>(2);

        getData(name);
        getData(age);
    }

    public static void getData(Box<? extends Number> data) {
        System.out.println("data:" + data.getData());
    }
}
