package com.code.chapter_03_array;

import java.util.Arrays;

/**
 * 
 * @Description:中文显示金额 
 * @author: wqk
 * @date: 2020上午12:31:12
 * @version: 1.0
 */
public class NumRmb {

    private String[] hanArr  = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    private String[] unitArr = { "十", "佰", "千", "万", "十万", "百万", "千万", "亿", "十亿", "百亿", "千亿" };
    private String   point   = "点";

    private String[] divid(double num) {
        long zheng = (long) num;
        long xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };

    }

    /**
     * 
     * 将阿拉伯类型的金额转换成中文显示，逻辑如下：金额的整数部分和小数部分分别处理，
     * 遍历整数部分的每个数值，如果是最后一位或者该数值为0，则不加单位，否则加上单位；
     * 小数部分和整数部分逻辑相同           
     * @param numStr
     * @return
     * @return: String
     */
    private String toHanStr(String numStr) {

        if (numStr == null || numStr.length() == 0) {
            return null;
        }
        //最中显示的中文金额
        String result = "";

        //将小数点替换成下划线，便于处理
        String[] nums = numStr.replace(".", "_").split("_");
        //整数部分长度
        int numLen = nums[0].length();
        //处理整数,便利每个数
        for (int i = 0; i < numLen; i++) {

            //金额的每个数刚好对应中文金额数组下标
            int num = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            //如果不是最后一个数或者该数为0，则加上金额的单位，否则不加单位
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];

            } else {

                if (hanArr[num].equals("零")) {
                    if (result.length() == 0) {
                        continue;
                    }
                    if (String.valueOf(result.charAt(result.length() - 1)).equals("零")) {
                        continue;
                    }
                }
                result += hanArr[num];
            }

        }
        //处理小数部分
        if (nums.length == 2) {
            int len = nums[1].length();
            String content = "";
            for (int j = 0; j < len; j++) {
                int pointNum = Integer.parseInt(String.valueOf(nums[1].charAt(j)));
                content += hanArr[pointNum];
            }
            result += (point + content);
        }
        return result;
    }

    public static void main(String[] args) {
        NumRmb rmb = new NumRmb();
        System.out.println(Arrays.toString(rmb.divid(236711125.123)));
        System.out.println(rmb.toHanStr("01006109.13"));
    }

}
