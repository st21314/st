package com.st.one.test;

public class Testttt {
	public static void main(String[] args) {
		System.out.print("===");
		for (int i = 0; i < 10; i++) {
			System.out.print("\b=>");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
