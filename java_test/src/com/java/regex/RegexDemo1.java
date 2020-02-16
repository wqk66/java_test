package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @Description: ∆•≈‰µÁª∞∫≈¬Î
 * @author: wqk
 * @date: 2019œ¬ŒÁ11:32:27
 * @version: 1.0
 */
public class RegexDemo1 {

    public static void main(String[] args) {
        matchTime();
    }

    /**
     * 
     * @Description: ∆•≈‰µÁª∞
     * @return: void
     */
    public static void matchMobile() {
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println(g1);
            System.out.println(g2);

        } else {
            System.out.println("∆•≈‰ ß∞‹");
        }
    }

    /**
     * 
     * @Description: ∆•≈‰ ±øÃ
     * @return: void
     */
    public static void matchTime() {
        Pattern p = Pattern.compile("(\\d{1,2}):(\\d{2}):(\\d{2})");
        Matcher m = p.matcher("23:30:59");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            String g3 = m.group(3);
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
        } else {
            System.out.println("∆•≈‰ ß∞‹");
        }
    }
}
