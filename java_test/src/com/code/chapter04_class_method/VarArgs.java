package com.code.chapter04_class_method;

import java.util.Map;

/**
 * 
 * @Description: 可变参数练习
 * @author: wqk
 * @date: 2020下午11:41:50
 * @version: 1.0
 */
public class VarArgs {

    public static void test(int a, String... books) {
        for (String tmp : books) {
            System.out.println(tmp);
        }

        System.out.println(a);

    }

    public static void main(String[] args) {
        test(5, new String[] { "a", "b" });

        //        Map<String, String> dataMap1 = new HashMap<String, String>();
        //        dataMap1.put("1", "data11");
        //        dataMap1.put("2", "data12");
        //        dataMap1.put("3", "data13");
        //        dataMap1.put("4", "data14");
        //
        //        Map<String, String> dataMap2 = new HashMap<String, String>();
        //        dataMap2.put("1", "data21");
        //        dataMap2.put("2", "data22");
        //        dataMap2.put("3", "data23");
        //        dataMap2.put("4", "data24");
        //
        //        test2(dataMap1, dataMap2);
    }

    public static void test2(Map<String, String>... dataMap) {
        for (Map<String, String> map : dataMap) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("key：" + entry.getKey());
                System.out.println("value:" + entry.getValue());
            }
        }
    }
}
