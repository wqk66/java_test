package com.java.test;

public class FlightSchedule {

	public static void main(String[] args) {
		
		byte sche = 3;;
		String[] dataValue = {"周日","周一","周二","周三","周四","周五","周六"};
		System.out.println("航班日期："+sche+"，以下为有日期的航班：");
		for(int i=0;i<7;i++) {
			if((sche & 1<<i)!=0){
				System.out.print(dataValue[i]+",");
			}
		}
		System.out.println();
	}
}
