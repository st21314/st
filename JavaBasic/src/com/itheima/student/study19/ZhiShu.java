package com.itheima.student.study19;

import java.util.Random;
import java.util.Scanner;

public class ZhiShu {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(isZhiShu(97));
		find();
		Scanner s = new Scanner(System.in);
		System.out.println("«Î ‰»Î£∫");

		Integer st = s.nextInt();
		Integer[] list = new Integer[st];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Random().nextInt(1000);
		}
		De.mp(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
	}

	public static boolean isZhiShu(int in) {

		for (int i = 2; i < Math.pow(in, 0.5); i++) {
			if (in % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void find() {
		for (int i = 1; i < 101; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.pow(i, 0.5); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}

class De {
	public static void mp(Integer[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - x - 1; y++) {
				if (arr[y] < arr[y + 1]) {
					int temp = arr[y + 1];
					arr[y + 1] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
}
