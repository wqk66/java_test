package com.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @Description: java8日期时间-localedatetime
 * @author: wqk
 * @date: 2019上午12:09:31
 * @version: 1.0
 */
public class LocaleDateTimeDemo {

    public static void main(String[] args) {
        //        nowPrint();
        //        dateTimeFormatter_print();
        calculateDateTime_print();
    }

    public static void nowPrint() {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }

    //日期时间格式解析
    public static void dateTimeFormatter_print() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        //用自定义的格式解析
        LocalDateTime d2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(d2);

    }

    //计算日期时间
    public static void calculateDateTime_print() {
        //        LocalDateTime dt = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(dt);
        //加5天减3小时
        LocalDateTime dt2 = dt.plusDays(5).minusHours(3);
        System.out.println(dt2);
        //减1月
        LocalDateTime dt3 = dt2.minusMonths(1);
        System.out.println(dt3);
    }
}
