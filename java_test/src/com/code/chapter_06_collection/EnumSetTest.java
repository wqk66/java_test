package com.code.chapter_06_collection;

import java.util.EnumSet;

enum Seasons {
              SPRING, SUMMER, FALL, WINTER;

}

public class EnumSetTest {

    public static void main(String[] args) {
        EnumSet<Seasons> set = EnumSet.allOf(Seasons.class);
        System.out.println(set);

        EnumSet<Seasons> set2 = EnumSet.noneOf(Seasons.class);
        System.out.println(set2);
        set2.add(Seasons.SPRING);
        set2.add(Seasons.SUMMER);
        System.out.println(set2);

        //以指定枚举值创建set
        EnumSet<Seasons> set3 = EnumSet.of(Seasons.SPRING, Seasons.WINTER);
        System.out.println(set3);

        //获得枚举值的范围
        EnumSet<Seasons> set4 = EnumSet.range(Seasons.SPRING, Seasons.FALL);
        System.out.println(set4);

        //填充全部枚举值
        EnumSet<Seasons> set5 = EnumSet.complementOf(set3);
        System.out.println(set5);

    }
}
