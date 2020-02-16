package com.java.simplefactory;

public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折现图");
    }

    @Override
    public void display() {

        System.out.println("显示折线图");

    }

}
