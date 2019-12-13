package com.java.collection;

/**
 * 
 * @Description: ̰���ߵĽڵ�
 * @author: wqk
 * @date: 2019����12:37:52
 * @version: 1.0
 */
public class Node {

    private int i;//̰���� �����������
    private int j;//̰��������ĺ�����

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

    //�Աȶ����Ƿ����
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
