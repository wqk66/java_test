package com.java.test;

import java.util.Calendar;
import java.util.Scanner;

public class TaxCharge {

	public static void main(String[] args) {

		getTaxCharge();
	}

	public static void getTaxCharge() {
		double len;// 行驶千米数
		int wait;// 等待秒数
		double startPriceInDay = 2d;// 白天起步价
		double startPriceInNight = 2.3;// 晚上起步价
		double perPriceInDay = 2.0;// 白天每千米价格
		double perPriceInNight = 2.3;// 夜晚每千米价格
		double basePrice = 0.0;// 基本里程费
		double waitPrice = 0.0;// 等待非
		double emptyBackPrice = 0.0;// 返回空驶价格
		double totalPrice = 0.0;// 总价

		// 获得当前系统的时间小时数
		int nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行驶千米数：");
		len = sc.nextDouble();

		System.out.println("请输入等待时间（单位：s）：");
		wait = sc.nextInt();

		if (nowTime >= 7 && nowTime < 23) {// 白天
			basePrice += startPriceInDay;
			if (len > 3) {
				basePrice += (int) (len - 3.0 + 1) * perPriceInDay;
			}
		} else {// 晚上
			basePrice += startPriceInNight;
			if (len > 3) {
				basePrice += (int) (len - 3.0 + 1) * perPriceInNight;
			}
		}

		if (len > 15) {
			emptyBackPrice += (int) (len - 15.0 + 1) * 1;
		}

		waitPrice += (wait / 60)*2;
		
		totalPrice += (basePrice+emptyBackPrice+waitPrice);
		System.out.println("出租车应收款如下：");
		System.out.println("基本里程费："+basePrice);
		System.out.println("空驶费："+emptyBackPrice);
		System.out.println("等待费："+waitPrice);
		System.out.println("总计："+totalPrice);
	}
}
