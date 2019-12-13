package com.java.collection;

import java.util.LinkedList;

public class Worm {

    //节点集合
    LinkedList<Node>        nodes = new LinkedList<Node>();
    //
    public static final int up    = -10;
    public static final int down  = 10;
    public static final int left  = -1;
    public static final int right = 1;
    private int             dir;

    public Worm() {
        nodes.add(new Node(3, 9));
        nodes.add(new Node(4, 9));
        nodes.add(new Node(5, 9));
        nodes.add(new Node(5, 10));
        nodes.add(new Node(5, 11));
        nodes.add(new Node(6, 11));
        nodes.add(new Node(7, 11));
    }

    public Worm(LinkedList<Node> nodes) {
        this.nodes.clear();
        this.nodes.addAll(nodes);
    }

    public void step() {
        Node n = nodes.getFirst();
        int i = n.getI() + dir / 10;
        int j = n.getJ() + dir % 10;
        n = new Node(i, j);
        nodes.addFirst(n);
        nodes.removeLast();
    }

    public void step(int dir) {

        if (this.dir + dir == 0) {
            throw new RuntimeException("不能掉头行驶");
        }
        this.dir = dir;
        step();

    }

    public boolean contains(int i, int j) {
        return nodes.contains(new Node(i, j));
    }

    public String toString() {
        return nodes.toString();
    }
}
