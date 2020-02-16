package com.java.expression;

import java.util.Scanner;

public class ExpressionTest {

    public static void main(String[] args) {

        //双精度计算
        //        char zhong = '疯';
        //        int zhongVal = zhong;
        //        double d = -5.5d;
        //        double c = d / 0;
        //        float e = -4.5f;
        //        float f = 0;
        //        float m = e / f;
        //        double z = .234d;
        //        System.out.println(z);

        //表达式类型的自动提升
        //        byte b = 40;
        //        char c = 'a';
        //        int i = 23;
        //        double d = .314;
        //        double result = b + c + i * d;
        //        System.out.println(result);
        //        System.out.println("hello!" + 'a' + 7);
        //        System.out.println('a' + 7 + "hello!");

        //通过math画出圆形

        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        r = sc.nextInt();
        for (int i = 0; i <= r; i = i + 2) {//上半圆
            int height = r - i;

            int width = (int) Math.round(Math.sqrt(r * r - height * height));

            for (int j = r - width; j >= 0; j--) {//左上
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = r - width; j < r + width; j++) {//右上
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = r; i >= 0; i = i - 2) {//下半圆
            int height = r - i;
            int width = (int) Math.round(Math.sqrt(r * r - height * height));
            for (int j = r - width; j >= 0; j--) {//左下半圆
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = r + width; j > r - width; j--) {//右下半圆
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
