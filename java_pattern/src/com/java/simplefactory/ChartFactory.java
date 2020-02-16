package com.java.simplefactory;

import com.java.util.PropertyUtil;

/**
 * ������
 * @author: wqk
 * @date: 2019����11:22:39
 * @version: 1.0
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("��ʼ��������״ͼ");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("��ʼ����������ͼ");
        }

        return chart;
    }

    public static void main(String[] args) {
        PropertyUtil proper = new PropertyUtil("config");
        Chart chart = null;
        try {
            Class c = Class.forName(proper.getValue("className"));
            chart = (Chart) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (chart == null) {
            return;
        }
        chart.display();
    }

}
