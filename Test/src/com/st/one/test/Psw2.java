package com.st.one.test;

import java.util.Random;

public class Psw2 {
	public static void main(String[] args) {
		getPsw();
	}

	private static void getPsw() {
		Random random = new Random();
		int n3 = 2+random.nextInt(8);
		int n2 = 1+random.nextInt(n3-1);
		int n4 = 1+random.nextInt(n3-1);
		int n1 = random.nextInt(n2);
		int n5 = random.nextInt(n4);
		String password = ""+n1+n2+n3+n4+n5;
		System.out.println(password);
	}
}
