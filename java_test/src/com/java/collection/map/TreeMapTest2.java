package com.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest2 {

    public static void main(String[] args) {
        Map<Student2, Integer> map = new TreeMap<Student2, Integer>();
        map.put(new Student2("Tom", 77), 1);
        map.put(new Student2("Bob", 66), 2);
        map.put(new Student2("Lily", 99), 3);
        for (Student2 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student2("Bob", 66))); // null?
    }
}

class Student2 implements Comparable<Student2> {
    public String name;
    public int    score;

    public Student2() {
    }

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2 [name=" + name + ", score=" + score + "]";
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.score == o.score) {
            return 0;
        } else if (this.score < o.score) {
            return -1;
        } else {
            return 1;
        }
    }
}
