package com.code.chapter_05_object;

public class EnumTest {

    public void judge(SeasonNum s) {
        switch (s) {
            case SPRING:
                System.out.println("春天，正好踏青");
                break;
            case SUMMER:
                System.out.println("夏天，适合游泳");
                break;
            case FALL:
                System.out.println("秋天，进补及时");
                break;
            case WINTER:
                System.out.println("冬天，围炉赏雪");
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
