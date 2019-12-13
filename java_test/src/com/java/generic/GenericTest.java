package com.java.generic;

/**
 * 
 * @Description: �������ڷ��͵���ϰ
 * @author: wqk
 * @date: 2019����10:00:37
 * @version: 1.0
 */
public class GenericTest {

    public static void main(String[] args) {

        Box<String> name = new Box<String>("11111");
        System.out.println(name.getData());
    }
}

class Box<T> {
    private T data;

    public Box() {
    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
