package com.itheima.student.study18;

import java.util.Random;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.random());
		double d = Math.ceil(13.1);
//		 Math.ceil(x) 相当于[x]
//		floor(x) 小于
		System.out.println(d);
		d = Math.floor(13.1);
		System.out.println(d);
		
		d = Math.round(13.1);
		System.out.println(d);
		
		System.out.println(Math.pow(2, 3));
		
		Math.random();
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(6*Math.random())+1);
			
		}
		
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
	}
}
