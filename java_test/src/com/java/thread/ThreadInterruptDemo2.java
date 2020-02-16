package com.java.thread;

public class ThreadInterruptDemo2 {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new MyThread4();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread4 extends Thread {

    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hello.start();
    }
}

class HelloThread extends Thread {

    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + "hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
