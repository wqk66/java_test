package com.java.enums;

public class EnumTest {

    public static void main(String[] args) {
        WeekDay day = WeekDay.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("work at home");
        } else {
            System.out.println("work at office");
        }
    }
}

enum WeekDay {

              MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private WeekDay(int dayValue) {
        this.dayValue = dayValue;
    }

}
