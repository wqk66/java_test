package com.java.sort;

/**
 * 
 *  打印唐诗 
 * @author: wqk
 * @date: 2019下午11:23:13
 * @version: 1.0
 */
public class PrintTangshi {

    public static void main(String[] args) {

        String[][] arrs = {

                            { "床", "前", "明", "月", "光" }, { "疑", "是", "地", "上", "霜" },
                            { "举", "头", "望", "明", "月" }, { "低", "头", "思", "故", "乡" }

        };
        System.out.println(" ");
        for (int i = 0; i < arrs[0].length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                System.out.print(arrs[arrs.length - j - 1][i] + " ");
            }
            System.out.println();
        }
    }
}
