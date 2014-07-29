package com.itheima.student.study18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd E  HH:mm:ss");
		
		System.out.println(format.format(date));
		
	}
}
