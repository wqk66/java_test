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

        //��ָ��ö��ֵ����set
        EnumSet<Seasons> set3 = EnumSet.of(Seasons.SPRING, Seasons.WINTER);
        System.out.println(set3);

        //���ö��ֵ�ķ�Χ
        EnumSet<Seasons> set4 = EnumSet.range(Seasons.SPRING, Seasons.FALL);
        System.out.println(set4);

        //���ȫ��ö��ֵ
        EnumSet<Seasons> set5 = EnumSet.complementOf(set3);
        System.out.println(set5);

    }
}
