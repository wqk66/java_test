package com.java.test;

public class FlightSchedule {

	public static void main(String[] args) {
		
		byte sche = 3;;
		String[] dataValue = {"����","��һ","�ܶ�","����","����","����","����"};
		System.out.println("�������ڣ�"+sche+"������Ϊ�����ڵĺ��ࣺ");
		for(int i=0;i<7;i++) {
			if((sche & 1<<i)!=0){
				System.out.print(dataValue[i]+",");
			}
		}
		System.out.println();
	}
}
