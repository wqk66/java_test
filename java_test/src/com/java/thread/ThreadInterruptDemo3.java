package com.java.thread;

/**
 * 
 * @Description: �߳��ж�
 * @author: wqk
 * @date: 2019����1:48:35
 * @version: 1.0
 */
public class ThreadInterruptDemo3 {

    public static void main(String[] args) throws InterruptedException {
        HelloThread5 hello = new HelloThread5();
        hello.start();
        Thread.sleep(1000);
        hello.running = false;
    }
}

//
class HelloThread5 extends Thread {
    public volatile boolean running = true;//��־λ���������

    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + "hello");
        }
        System.out.println("end");
    }
}
