package com.itheima.student.study19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			System.out.println(arr[2]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				Date d = new Date();
				PrintStream ps = new PrintStream("D:\\1\\1.log");
				ps.println(d.toString());
				System.setOut(ps);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace(System.out);
		}
	}
}
//log4j