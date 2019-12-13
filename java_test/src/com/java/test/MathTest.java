package com.java.test;

import java.math.BigDecimal;

public class MathTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Double d = 23.4556667;
        BigDecimal bg = new BigDecimal(d);
        double val = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(val);
    }
}
