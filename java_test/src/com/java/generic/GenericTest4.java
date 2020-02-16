package com.java.generic;

public class GenericTest4<T> {

    private T first;
    private T last;

    public GenericTest4() {
    }

    public GenericTest4(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    public static <K> GenericTest4<K> create(K first, K last) {
        return new GenericTest4<K>(first, last);
    }

    public static void main(String[] args) {

        GenericTest4<String> g = new GenericTest4<String>();
        GenericTest4<Integer> gg = g.create(11, 222);
        System.out.println(gg.getFirst());

    }

}
