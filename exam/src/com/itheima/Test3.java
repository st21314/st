package com.itheima;

import java.util.Scanner;

/**
 * ��3�⣺�Ӽ��̽���һ�����֣���ӡ�����ֱ�ʾ��ʱ�䣬���λ���죬���磺 
 * 		��������6����ӡ6�룻 
 * 		��������60����ӡ1�֣� 
 * 		��������66����ӡ1��6�룻
 * 		��������666����ӡ11��6�룻 
 * 		��������3601����ӡ1Сʱ1��
 * 
 * @author one
 * 
 */

public class Test3 {
	public static void main(String[] args) {
		int i = getInput(); // �Ӽ��̽���һ������
		printIt(i); // ��ӡ�����ֱ�ʾ��ʱ��
	}

	private static void printIt(int i) { // ��ӡ�����ֱ�ʾ��ʱ��
		StringBuilder time = new StringBuilder(); // ����һ��StringBuilder���ڴ��ʱ������
		if (i >= 86400) { 	// ��ﵽһ�����������
			int day = i / 86400;
			time.append(day).append("��");
			i %= 86400; 	// �Ѳ���һ���ʱ�丳ֵ�� i 
		}
		if (i >= 3600) {	// ��ﵽһСʱ�����Сʱ��
			int hour = i / 3600;
			time.append(hour).append("Сʱ");
			i %= 3600;		// �Ѳ���һСʱ��ʱ�丳ֵ�� i 
		}
		if (i >= 60) {		// ��ﵽһ��������������
			int min = i / 60;
			time.append(min).append("��");
			i %= 60;		// �Ѳ���һ���ӵ�ʱ�丳ֵ�� i 
		}
		if (i != 0) { 		// �粻Ϊ 0 �����������
			time.append(i).append("��");
		}
		System.out.println(time.toString());	// ��ӡ�����
	}
	
	private static int getInput() { // �Ӽ��̽���һ������
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		for (;;) { // ����������ַ�����������Integer��ʽ����������С�� 0 ��ʱ�����򵥵Ĵ�����������ʹ�������
			try {
				System.out.println("������������");
				i = scanner.nextInt(); // ���ռ�������� int �Ͳ�������� i ��
				if (i < 0) {
					throw new Exception(); // ������С�� 0 ��������Ϊ��������
				}
				break;
			} catch (Exception e) {
				System.out.println("�����������˴�����ַ���"); // �򵥵��쳣����
				scanner.nextLine(); // ��������Ĵ����ַ����Ա���һ������
			}
		}
		scanner.close();
		return i;
	}
}