package com.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<String, Integer>();

        map.put("aa", 1);
        map.put("bb", 2);
        map.put("cc", 3);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}

class Student3 {
    public String name;
    public int    score;

    public Student3() {
    }

    public Student3(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2 [name=" + name + ", score=" + score + "]";
    }
}