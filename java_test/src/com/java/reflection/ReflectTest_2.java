package com.java.reflection;

import java.lang.reflect.Field;

public class ReflectTest_2 {

    public static void main(String[] args) throws Exception {

        Person2 p = new Person2("xiao Ming");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "xiao hong");
        System.out.println(p.getName());
    }
}

class Person2 {

    private String name;

    public Person2() {
        super();
    }

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
