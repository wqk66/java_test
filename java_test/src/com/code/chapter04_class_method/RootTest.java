package com.code.chapter04_class_method;

/**
 * 
 * @Description: 继承练习
 * @author: wqk
 * @date: 2020上午1:03:19
 * @version: 1.0
 */
public class RootTest {

    public static void main(String[] args) {
    }
}

class Root {
    static {
        System.out.println("root的静态代码块");

    }
    {
        System.out.println("root的普通初始化块");
    }

    public Root() {
        System.out.println("root的无参构造方法");
    }
}

class Mid extends Root {
    static {
        System.out.println("mid的静态代码块");
    }
    {
        System.out.println("mid的普通初始化代码块");
    }

    public Mid() {
        System.out.println("mid的无参构造方法");
    }

    public Mid(String msg) {
        this();
        System.out.println("mid的带参构造函数，参数为：" + msg);
    }

}

class Leaf extends Mid {
    static {
        System.out.println("leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        super("疯狂java");
        System.out.println("leaf的无参构造函数");
    }

    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
