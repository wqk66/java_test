package com.java.array;

/**
 * 
 * @Description: foreach循环练习
 * @author: wqk
 * @date: 2020下午11:12:25
 * @version: 1.0
 */
public class ForEachTest {

    public static void main(String[] args) {

        String[] books = { "轻量级java EE企业应用实战", "疯狂java讲义", "疯狂java2讲义" };

        for (int i = 0; i < books.length; i++) {
            books[i] = "疯狂Ajax讲义";
        }
        //        for (String book : books) {
        //
        //            System.out.println(book);
        //        }

        System.out.println(books[0]);
    }
}
