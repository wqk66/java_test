package com.java.generic;

/**
 * 
 * @Description: 该类用于泛型的练习
 * @author: wqk
 * @date: 2019下午10:00:37
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
