package com.itheima.student.study20;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		ArrayList<Integer> arr = getNums();
		guess(arr);

	}

	private static void guess(ArrayList<Integer> arr) {
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int g = 0;
		for (Integer i : arr) {
			System.out.println("����1��1000֮�����");
			g = scanner.nextInt();
			while (g != i) {
				if (g < i) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}
				g = scanner.nextInt();
				count++;
			}
			System.out.println("�����ˣ����β���" + count + "��");
		}
		scanner.close();

	}

	private static ArrayList<Integer> getNums() {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random random = new Random();
		while (arr.size() < 10) {
			Integer i = random.nextInt(1000) + 1;
			if (arr.indexOf(i) == -1) {
				arr.add(i);
				System.out.println(i);
			}
		}
		return arr;
	}
}
