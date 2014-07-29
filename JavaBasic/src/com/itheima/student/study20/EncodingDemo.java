package com.itheima.student.study20;

import java.util.Arrays;

public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		String string = "ÁªÍ¨";
		byte[] gbk = string.getBytes();
		
		for (byte b : gbk) {
			System.out.println(Integer.toBinaryString((int)b&255));;
		}
		
		System.out.println(Arrays.toString(gbk));
		String g_u = new String(gbk,"utf-8");
		System.out.println(g_u);
//		byte[] utf = string.getBytes("utf-8");
//		
//		System.out.println(Arrays.toString(utf));
//		
//		String u_g = new String(utf);
//		System.out.println(u_g);
//		
//		
//		String u_g_u = new String(u_g.getBytes("gbk"),"utf-8");
//		System.out.println(u_g_u);
//		
//		byte[] bytes = g_u.getBytes("utf-8");
//		System.out.println(Arrays.toString(bytes));
//		String g_u_g = new String(bytes,"gbk");
//		System.out.println(g_u_g);
	}
}
