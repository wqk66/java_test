package com.java.thread;

public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();//启动线程t
        t.join();//等待线程t执行完毕
        System.out.println("end");
    }

}
