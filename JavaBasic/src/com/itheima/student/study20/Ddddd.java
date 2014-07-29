package com.itheima.student.study20;

public class Ddddd {
	 public static void main(String[] args) {
		String string = "abcd";
		
		getStrings(string);
	}

	private static void getStrings(String string) {
		String[] strings = string.split("");
		for (String string2 : strings) {
			System.out.println(string2);
		}
	}
	
	
	public static String[] name(String[] strings, String string) {
		if (string.length()==1) {
			
			return string.split("");
		}
		return strings;
		
	}
}
