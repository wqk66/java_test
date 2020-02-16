package com.java.generic;

import java.util.Arrays;

public class GenericTest3 {

    public static void main(String[] args) {
        Person[] persons = new Person[] { new Person("jim", 13), new Person("tom", 14),
                                          new Person("marry", 10) };
        Arrays.sort(persons);
        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }
}

class Person implements Comparable<Person> {

    String name;
    int    score;

    public Person() {
    }

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", score=" + score + "]";
    }

}
