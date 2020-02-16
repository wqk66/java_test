package com.java.thread;

/**
 * 
 * @Description: 线程中断
 * @author: wqk
 * @date: 2019上午1:48:35
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
    public volatile boolean running = true;//标志位，共享变量

    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + "hello");
        }
        System.out.println("end");
    }
}
