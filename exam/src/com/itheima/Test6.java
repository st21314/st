package com.itheima;

/**
 * ��6�⣺����һ������˽�г�Ա�����ͺ������࣬�ٶ���һ���ڲ��࣬ ���ڲ��ຯ���з����ⲿ��Ա�������������ⲿ������
 * ���ⲿ�ຯ���д����ڲ�����󣬵����ڲ��ຯ����
 * 
 * @author one
 * 
 */

public class Test6 { 
	public static void main(String[] args) {
		new Outer().new Inner().funcInner(); // ���ú������Խ��
	}
}

class Outer {	// ����һ���ⲿ��
	private String nameOuter = "outer"; // �����ⲿ��˽�г�Ա����
	private Inner inner;

	private void funcOuter() { 		// �����ⲿ�ຯ��
		System.out.println("�ⲿ�ຯ��ִ��");
		if (inner == null) { 		// ���жϽ���һ�������ⲿ�ຯ��ʱ�����ڲ�����󣬷�ֹ��ѭ��
			System.out.println("�����ڲ������");
			inner = new Inner(); 	// ���ⲿ�ຯ���д����ڲ������
			System.out.println("�����ڲ��ຯ��");
			System.out.println("******************");
			inner.funcInner(); 		// ���ⲿ�ຯ���е����ڲ��ຯ��
		}
	}

	class Inner { // ����һ���ڲ���
		void funcInner() { // �����ڲ��ຯ��
			System.out.println("�ڲ��ຯ��ִ��");
			System.out.println("�����ⲿ��Ա������" + nameOuter); // ���ڲ��ຯ���з����ⲿ��Ա����
			System.out.println("�����ⲿ�ຯ��");
			System.out.println("******************");
			funcOuter(); // ���ڲ��ຯ���е����ⲿ����
		}
	}
}