package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Object> books = new ArrayList<Object>();
        books.add(new String("java ��̻���"));
        books.add(new String("java web����"));
        books.add("javaѧϰ");

        System.out.println(books);
        books.remove(true);
        System.out.println(books);
        books.remove(true);
        System.out.println(books);
    }

}
