package com.code.chapter04_class_method;

/**
 * 
 * ���ݽ���
 * @author: wqk
 * @date: 2020����11:32:59
 * @version: 1.0
 */
public class ReferenceTransferTest {

    public static void swap(DataWrap dw) {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap�����a field��ֵ��" + dw.a + ";b field��ֵ��" + dw.b);
        dw = null;

    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("������a field��ֵ�ǣ�" + dw.a + ";b field��ֵ�ǣ�" + dw.b);

    }
}

class DataWrap {
    public int a;
    public int b;

}