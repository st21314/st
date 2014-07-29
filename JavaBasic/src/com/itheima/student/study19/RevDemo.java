package com.itheima.student.study19;

public class RevDemo {
	public static void main(String[] args) {
		String string = "abc";
		String s = "abc";
		string+="";
		System.out.println(s==string);
		System.out.println(isTheThing(s));
	}
	
	public static boolean isTheThing(String string) {
		return string.equals(new StringBuilder(string).reverse().toString());
	}
}
