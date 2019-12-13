package com.java.collection.list;

import java.util.LinkedList;

/**
 * 
 * @Description: LinkedList实例
 * @author: wqk
 * @date: 2019上午1:12:00
 * @version: 1.0
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> books = new LinkedList<String>();
        //加入尾部
        books.offer("基础编程");
        //加入顶部
        books.push("该这样学");
        //加入顶部
        books.offerFirst("java web 开发");
        books.push("java EE学习");
        books.offer("redis学习");

        //访问但不删除第一个元素
        System.out.println(books.peekFirst() + "================");

        //访问但不删除最后一个元素
        System.out.println(books.peekLast() + "-------------------");

        System.out.println(books.pop() + "++++++++++++++++");
        System.out.println(books.pollFirst() + "``````````");
        System.out.println(books.pollLast() + "!!!!!!!!!!!!!!!!");

        for (String str : books) {
            System.out.println(str);
        }

        System.out.println(books.getFirst() + "000000000000000");
    }
}

class A {
    private int i;

    private int j;

    public A() {

    }

    public A(int i, int j) {
        super();
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + i;
        result = prime * result + j;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (i != other.i)
            return false;
        if (j != other.j)
            return false;
        return true;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

}
