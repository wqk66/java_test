package com.code.chapter04_class_method;

/**
 * 
 * 数据交换
 * @author: wqk
 * @date: 2020下午11:32:59
 * @version: 1.0
 */
public class ReferenceTransferTest {

    public static void swap(DataWrap dw) {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap方法里，a field的值：" + dw.a + ";b field的值：" + dw.b);
        dw = null;

    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换后，a field的值是：" + dw.a + ";b field的值是：" + dw.b);

    }
}

class DataWrap {
    public int a;
    public int b;

}