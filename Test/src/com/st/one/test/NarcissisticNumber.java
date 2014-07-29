package com.st.one.test;

import java.util.Date;

public class NarcissisticNumber {
	public static void main(String[] args) {
		long n = 0;
		long[][] pow = getPow();
		for (long i = 100; i < Long.MAX_VALUE; i++) {

			if (isNarcissisticNumber(i, pow)) {
				n++;
				System.out.print(new Date());
				System.out.println("\t" + n + ":\t" + i);
			}
		}
	}

	public static long[][] getPow() {
		long[][] table = new long[10][20];
		for (int i = 0; i<10;i++) {
			for (int j = 0; j < 20; j++) {
				table[i][j] = (long) Math.pow(i, j); 
			}
			
		}
		
		return table;
		
	}
	public static boolean isNarcissisticNumber(long i, long[][] pow) {
		String string = ""+i;
		long n = i;
		long sum = 0;
		while (i > 0) {
			sum += pow[(int) (i - 10 * (i / 10))][string.length()];
//			System.out.print(i - 10 * (i / 10)+"\t"+is.length()+"\t"+sum+"\t");
			i = i/10;
			
		}

//		System.out.println("\t"+sum+"\t"+n);
		
		return sum == n;
	}

}
