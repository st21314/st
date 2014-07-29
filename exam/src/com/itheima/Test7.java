package com.itheima;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * ��7�⣺����ȥ�ظ�������: ԭʼ������{4,2,4,6,1,2,4,7,8}���õ����{4,2,6,1,7,8}
 * 
 * @author one
 * 
 */

public class Test7 {
	public static void main(String[] args) {
		Object[] arr = { 4, 2, 4, 6, 1, 2, 4, 7, 8 };
		
		System.out.print("ԭʼ�����ǣ�\t");
		printArray(arr); // ��ӡԭʼ����

		Object[] newArr = getNewArray(arr); // ȥ�ظ����õ�������

		System.out.print("�õ������\t");
		printArray(newArr); // ��ӡ������
	}

	/**
	 * ʹ��LinkedHashSet������ݣ���֤�������ظ����ݣ�ͬʱ������ԭʼ����
	 * 
	 * @param objs
	 * @return newArr
	 */
	private static Object[] getNewArray(Object[] objs) { // ȥ�ظ����õ�������
		// ����LinkedHashSet���ڴ������
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		for (Object object : objs) {
			set.add(object); // ����Ԫ�أ�Ĭ��ȥ���ظ�Ԫ��
		}
		Object[] newArr = new Object[set.size()]; // �����ʵ���С��������

		Iterator<Object> it = set.iterator();
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = it.next(); 		// ���������������
		}
		return newArr; // ����������
	}

	private static void printArray(Object[] arr) { // ��ӡ����
		System.out.print("{");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[arr.length - 1] + "}");
	}
}