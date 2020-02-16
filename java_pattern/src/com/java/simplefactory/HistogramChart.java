package com.java.simplefactory;

/**
 * 
   *    具体产品类
 *   
 * @author: wqk
 * @date: 2019下午11:19:59
 * @version: 1.0
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }

}
