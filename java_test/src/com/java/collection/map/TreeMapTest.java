package com.java.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        Map<Student, Integer> map = new TreeMap<Student, Integer>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

                if (o1.score == o2.score) {
                    return 0;
                }
                return o1.score < o2.score ? -1 : 1;
            }

        });

        map.put(new Student("Tom", 77), 1);
        map.put(new Student("Bob", 66), 2);
        map.put(new Student("Lily", 99), 3);
        for (Student key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student("Bob", 66))); // null?

    }
}

class Student {
    public String name;
    public int    score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

}
