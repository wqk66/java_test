package com.code.chapter_05_object;

/**
 * 
 * @Description: ����ģʽ
 * @author: wqk
 * @date: 2020����12:22:48
 * @version: 1.0
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 
     * @Description: ��ȡ��������
     * @return
     * @return: Singleton
     */
    public static Singleton getInstance() {
        //���Ϊnull����˵��û�д����ö��󣬷��򴴽�
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
