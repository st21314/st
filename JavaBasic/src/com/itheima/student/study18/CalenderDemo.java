package com.itheima.student.study18;

import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
		
		String[] month = {"1��","2��","3��","4��",
				"5��","6��","7��","8��",
				"9��","10��","11��","12��",};

		System.out.println(calendar.get(Calendar.YEAR)+"��"
				+month[calendar.get(Calendar.MONTH)]
						+calendar.get(Calendar.DATE));
		
//		calendar.set(2012, 11, 21);
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.get(Calendar.YEAR)+"��"
				+month[calendar.get(Calendar.MONTH)]
						+calendar.get(Calendar.DATE));
		
		for (int i = 2010; i < 2100; i++) {
			System.out.print(i+"��\t");
			calendar.set(i, 2, 1);
			calendar.add(Calendar.DATE, -1);
			System.out.println(calendar.get(Calendar.DATE));
		}
		
		
	}
}
