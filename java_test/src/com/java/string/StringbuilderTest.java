package com.java.string;

public class StringbuilderTest {

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(2).add(5).inc().add(3);
        System.out.println(adder.value());
    }
}

/**
 * 
 * @Description: ���������ʽ�����ṩ�������֮��
 * @author: wqk
 * @date: 2019����11:50:42
 * @version: 1.0
 */
class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int value() {
        return sum;
    }
}