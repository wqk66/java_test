package com.code.chapter04_class_method;

/**
 * 
 * @Description: �̳���ϰ
 * @author: wqk
 * @date: 2020����1:03:19
 * @version: 1.0
 */
public class RootTest {

    public static void main(String[] args) {
    }
}

class Root {
    static {
        System.out.println("root�ľ�̬�����");

    }
    {
        System.out.println("root����ͨ��ʼ����");
    }

    public Root() {
        System.out.println("root���޲ι��췽��");
    }
}

class Mid extends Root {
    static {
        System.out.println("mid�ľ�̬�����");
    }
    {
        System.out.println("mid����ͨ��ʼ�������");
    }

    public Mid() {
        System.out.println("mid���޲ι��췽��");
    }

    public Mid(String msg) {
        this();
        System.out.println("mid�Ĵ��ι��캯��������Ϊ��" + msg);
    }

}

class Leaf extends Mid {
    static {
        System.out.println("leaf�ľ�̬��ʼ����");
    }
    {
        System.out.println("Leaf����ͨ��ʼ����");
    }

    public Leaf() {
        super("���java");
        System.out.println("leaf���޲ι��캯��");
    }

    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
