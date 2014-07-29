package com.itheima.student.study18;

import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DATE));
		
		String[] month = {"1月","2月","3月","4月",
				"5月","6月","7月","8月",
				"9月","10月","11月","12月",};

		System.out.println(calendar.get(Calendar.YEAR)+"年"
				+month[calendar.get(Calendar.MONTH)]
						+calendar.get(Calendar.DATE));
		
//		calendar.set(2012, 11, 21);
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.get(Calendar.YEAR)+"年"
				+month[calendar.get(Calendar.MONTH)]
						+calendar.get(Calendar.DATE));
		
		for (int i = 2010; i < 2100; i++) {
			System.out.print(i+"年\t");
			calendar.set(i, 2, 1);
			calendar.add(Calendar.DATE, -1);
			System.out.println(calendar.get(Calendar.DATE));
		}
		
		
	}
}
