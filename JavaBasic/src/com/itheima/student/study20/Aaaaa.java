package com.itheima.student.study20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Aaaaa {
	public static void main(String[] args) {
		ArrayList<Integer> arr = getArr();
		Map<Integer, Integer> times = getTimes(arr);
		printIt(times);
	}
	
	private static void printIt(Map<Integer, Integer> map) {
		int n = 0;
		for (Integer i : map.keySet()) {
			int time = map.get(i);
			System.out.println(i + ":" + time);
			if (map.get(n) == null) {
				n = i;
			} else if (time > map.get(n)) {
				n = i;
			}
		}
		System.out.println("largest:\n"+n+":"+map.get(n));
	}
	
	private static Map<Integer, Integer> getTimes(ArrayList<Integer> arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : arr) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.replace(i, map.get(i) + 1);
			}
		}
		return map;
	}
	
	private static ArrayList<Integer> getArr() {
		ArrayList<Integer> arr;
		arr = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			int j = random.nextInt(41) + 10;
			arr.add(j);
		}
		return arr;
	}
}
