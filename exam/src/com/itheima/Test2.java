package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ��2�⣺����ArrayList��������5��Ԫ�أ�ʹ��Iterator�������
 * 
 * @author one
 */

public class Test2 {
	public static void main(String[] args) {

		// ����ArrayList���� arr
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// ����5��Ԫ��
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		// ʹ��Iterator�������
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}