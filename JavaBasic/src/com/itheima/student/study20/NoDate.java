package com.itheima.student.study20;

import java.util.Calendar;
import java.util.Scanner;

public class NoDate {
	public static void main(String[] args) {
		System.out.println("hello");
		compare();
	}

	public static void compare() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("year 1 :\t");
		int year1 = scanner.nextInt();
		System.out.print("month 1 :\t");
		int month1 = scanner.nextInt();
		System.out.print("date 1 :\t");
		int date1 = scanner.nextInt();
		System.out.print("year 2 :\t");
		int year2 = scanner.nextInt();
		System.out.print("month 2 :\t");
		int month2 = scanner.nextInt();
		System.out.print("date 2 :\t");
		int date2 = scanner.nextInt();

		Calendar d1 = Calendar.getInstance();
		d1.set(year1, month1, date1);
		Calendar d2 = Calendar.getInstance();
		d2.set(year2, month2, date2);
		System.out.println(getDaysBetween(d1, d2));
		
		scanner.close();
	}

	static int getDaysBetween(Calendar d1, Calendar d2) {
		if (d1.after(d2)) {
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
		int y2 = d2.get(Calendar.YEAR);
		if (d1.get(Calendar.YEAR) != y2) {
			d1 = (Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
				d1.add(Calendar.YEAR, 1);
			} while (d1.get(Calendar.YEAR) != y2);
		}
		return days;
	}

	public static int count(Object[] list, Object obj) {
		int count = 0;
		for (Object object : list) {
			if (object.equals(obj)) {
				count++;
			}
		}
		return count;
	}

}
