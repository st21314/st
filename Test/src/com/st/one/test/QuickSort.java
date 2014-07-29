package com.st.one.test;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		System.out.println("hello");

		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		sort(arr);
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	public static void sort(int[] arr, int start, int end) {
		if (start < end) {
			int pos = p(arr, start, end);

			sort(arr, start, pos - 1);
			sort(arr, pos + 1, end);
		}
	}

	public static int p(int[] arr, int start, int end) {
		int temp = arr[start];
		while (start < end) {
			while (end > start && arr[end] > temp)
				end--;
			arr[start] = arr[end];
			while (start < end && arr[start] <= temp)
				start++;
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}
}
