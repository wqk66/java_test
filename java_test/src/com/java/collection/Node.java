package com.java.collection;

/**
 * 
 * @Description: 贪吃蛇的节点
 * @author: wqk
 * @date: 2019上午12:37:52
 * @version: 1.0
 */
public class Node {

    private int i;//贪吃蛇 坐标的纵坐标
    private int j;//贪吃蛇坐标的横坐标

    public Node() {

    }

    public Node(int i, int j) {
        super();
        this.i = i;
        this.j = j;
    }

    public String toString() {

        return "[" + i + "," + j + "]";
    }

    //对比对象是否相等
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {

            return true;
        }

        if (obj instanceof Node) {
            Node n = (Node) obj;
            return this.i == n.i && this.j == n.j;
        }
        return false;

    }

    public int hasCode() {
        return (i << 16) | j;
    }

    public int getI() {
        return i;
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
