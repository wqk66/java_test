package com.code.utils;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @Description: ���鹤����
 * @author: wqk
 * @date: 2020����10:15:12
 * @version: 1.0
 */
public class ArrayUtils {

    /**
     * 
     * @Description: ��ѯ�����и�ֵ��һ�γ��ֵ��±�
     * @param arr
     * @param val
     * @return
     * @return: int
     */
    public static int Search(String[] arr, String val) {
        if (arr == null || val == null) {
            return 0;
        }
        List<String> list = Arrays.asList(arr);
        return list.indexOf(val);
    }

    public static void main(String[] args) {
        String[] arr = { "aa", "bb", "cc", "dd" };
        System.out.println(Search(arr, "bb"));
    }
}
