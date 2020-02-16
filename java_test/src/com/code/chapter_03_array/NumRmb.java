package com.code.chapter_03_array;

import java.util.Arrays;

/**
 * 
 * @Description:������ʾ��� 
 * @author: wqk
 * @date: 2020����12:31:12
 * @version: 1.0
 */
public class NumRmb {

    private String[] hanArr  = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
    private String[] unitArr = { "ʮ", "��", "ǧ", "��", "ʮ��", "����", "ǧ��", "��", "ʮ��", "����", "ǧ��" };
    private String   point   = "��";

    private String[] divid(double num) {
        long zheng = (long) num;
        long xiao = Math.round((num - zheng) * 100);
        return new String[] { zheng + "", String.valueOf(xiao) };

    }

    /**
     * 
     * �����������͵Ľ��ת����������ʾ���߼����£������������ֺ�С�����ֱַ���
     * �����������ֵ�ÿ����ֵ����������һλ���߸���ֵΪ0���򲻼ӵ�λ��������ϵ�λ��
     * С�����ֺ����������߼���ͬ           
     * @param numStr
     * @return
     * @return: String
     */
    private String toHanStr(String numStr) {

        if (numStr == null || numStr.length() == 0) {
            return null;
        }
        //������ʾ�����Ľ��
        String result = "";

        //��С�����滻���»��ߣ����ڴ���
        String[] nums = numStr.replace(".", "_").split("_");
        //�������ֳ���
        int numLen = nums[0].length();
        //��������,����ÿ����
        for (int i = 0; i < numLen; i++) {

            //����ÿ�����պö�Ӧ���Ľ�������±�
            int num = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            //����������һ�������߸���Ϊ0������Ͻ��ĵ�λ�����򲻼ӵ�λ
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];

            } else {

                if (hanArr[num].equals("��")) {
                    if (result.length() == 0) {
                        continue;
                    }
                    if (String.valueOf(result.charAt(result.length() - 1)).equals("��")) {
                        continue;
                    }
                }
                result += hanArr[num];
            }

        }
        //����С������
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
