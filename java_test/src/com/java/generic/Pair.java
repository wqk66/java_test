package com.java.generic;

public class Pair<K, V> {

    private K first;
    private V last;

    public Pair() {
    }

    public Pair(K first, V last) {
        this.first = first;
        this.last = last;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getLast() {
        return last;
    }

    public void setLast(V last) {
        this.last = last;
    }

    public static void main(String[] args) {

        Pair<Integer, String> p = new Pair<Integer, String>();
        p.setFirst(111);
        p.setLast("aaa");

        System.out.println(p.getFirst());
    }

}
