package com.itheima.student.study20;

class Ball {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(++b);

		char[] c = new char[Byte.SIZE];
		for (int i = 0; i < Byte.SIZE; i++) {
			c[Byte.SIZE - 1 - i] = (char) (((b >> i) & 1) + '0');
		}
		System.out.println(new String(c));
	}
}