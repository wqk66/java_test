package com.java.sort;

/**
 * 
 *  ��ӡ��ʫ 
 * @author: wqk
 * @date: 2019����11:23:13
 * @version: 1.0
 */
public class PrintTangshi {

    public static void main(String[] args) {

        String[][] arrs = {

                            { "��", "ǰ", "��", "��", "��" }, { "��", "��", "��", "��", "˪" },
                            { "��", "ͷ", "��", "��", "��" }, { "��", "ͷ", "˼", "��", "��" }

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
