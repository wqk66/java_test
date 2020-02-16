package com.code.chapter_05_object;

/**
 * 
 * @Description: 单例模式
 * @author: wqk
 * @date: 2020上午12:22:48
 * @version: 1.0
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 
     * @Description: 获取单例对象
     * @return
     * @return: Singleton
     */
    public static Singleton getInstance() {
        //如果为null，则说明没有创建该对象，否则创建
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
