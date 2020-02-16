package com.java.thread;

public class ThreadInterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Mythread3();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class Mythread3 extends Thread {
    public void run() {
        int n = 0;
        System.out.println("aaaaa:" + isInterrupted());
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}
