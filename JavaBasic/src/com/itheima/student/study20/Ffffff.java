package com.itheima.student.study20;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ffffff {
	public static void main(String[] args) {
		func1();
	}

	private static void func1() {
		BigInteger num = BigInteger.valueOf(1);
		for (int i = 1; i < 1001; i++) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num);
		
		int count = 0;
		String s = num.toString();
		Pattern p = Pattern.compile("0");
		Matcher m = p.matcher(s);
		while(m.find()){
			count++;
		}
		System.out.println(count);
	}
	private static void func() {
		BigInteger num = BigInteger.valueOf(1);
		for (int i = 1; i < 1001; i++) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num);
		
		int count = 0;
		char[] b = num.toString().toCharArray();
		for (char c : b) {
			if (c == '0')
				count++;
		}
		System.out.println(count);
	}
}
