package com.java.thread;

public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();//�����߳�t
        t.join();//�ȴ��߳�tִ�����
        System.out.println("end");
    }

}
