package com.code.chapter_05_object;

public class EnumTest {

    public void judge(SeasonNum s) {
        switch (s) {
            case SPRING:
                System.out.println("���죬����̤��");
                break;
            case SUMMER:
                System.out.println("���죬�ʺ���Ӿ");
                break;
            case FALL:
                System.out.println("���죬������ʱ");
                break;
            case WINTER:
                System.out.println("���죬Χ¯��ѩ");
                break;
        }

    }

    public static void main(String[] args) {
        for (SeasonNum s : SeasonNum.values()) {
            System.out.println(s);
        }

        new EnumTest().judge(SeasonNum.SPRING);
        System.out.println(SeasonNum.SUMMER.compareTo(SeasonNum.SUMMER));
        System.out.println(SeasonNum.SPRING);
    }
}
