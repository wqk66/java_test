package com.java.test;

import java.util.Calendar;
import java.util.Scanner;

public class TaxCharge {

	public static void main(String[] args) {

		getTaxCharge();
	}

	public static void getTaxCharge() {
		double len;// ��ʻǧ����
		int wait;// �ȴ�����
		double startPriceInDay = 2d;// �����𲽼�
		double startPriceInNight = 2.3;// �����𲽼�
		double perPriceInDay = 2.0;// ����ÿǧ�׼۸�
		double perPriceInNight = 2.3;// ҹ��ÿǧ�׼۸�
		double basePrice = 0.0;// ������̷�
		double waitPrice = 0.0;// �ȴ���
		double emptyBackPrice = 0.0;// ���ؿ�ʻ�۸�
		double totalPrice = 0.0;// �ܼ�

		// ��õ�ǰϵͳ��ʱ��Сʱ��
		int nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ʻǧ������");
		len = sc.nextDouble();

		System.out.println("������ȴ�ʱ�䣨��λ��s����");
		wait = sc.nextInt();

		if (nowTime >= 7 && nowTime < 23) {// ����
			basePrice += startPriceInDay;
			if (len > 3) {
				basePrice += (int) (len - 3.0 + 1) * perPriceInDay;
			}
		} else {// ����
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
		System.out.println("���⳵Ӧ�տ����£�");
		System.out.println("������̷ѣ�"+basePrice);
		System.out.println("��ʻ�ѣ�"+emptyBackPrice);
		System.out.println("�ȴ��ѣ�"+waitPrice);
		System.out.println("�ܼƣ�"+totalPrice);
	}
}
