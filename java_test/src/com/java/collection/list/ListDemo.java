package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Object> books = new ArrayList<Object>();
        books.add(new String("java 编程基础"));
        books.add(new String("java web开发"));
        books.add("java学习");

        System.out.println(books);
        books.remove(true);
        System.out.println(books);
        books.remove(true);
        System.out.println(books);
    }

}
