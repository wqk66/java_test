package com.java.array;

/**
 * 
 * @Description: foreachѭ����ϰ
 * @author: wqk
 * @date: 2020����11:12:25
 * @version: 1.0
 */
public class ForEachTest {

    public static void main(String[] args) {

        String[] books = { "������java EE��ҵӦ��ʵս", "���java����", "���java2����" };

        for (int i = 0; i < books.length; i++) {
            books[i] = "���Ajax����";
        }
        //        for (String book : books) {
        //
        //            System.out.println(book);
        //        }

        System.out.println(books[0]);
    }
}
