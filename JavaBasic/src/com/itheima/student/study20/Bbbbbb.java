package com.itheima.student.study20;

import java.util.ArrayList;

public class Bbbbbb {
	public static void main(String[] args) {
		
		
		System.out.println("hhhh");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);
		int count = 0;
		int pos = 0;
		while (a.size()>1) {
			count++;
			if (count == 3) {
				a.remove(pos);
				pos--;
				System.out.println(a);
			}else {
				pos++;
				
			}
			if (pos>=a.size()) {
				pos=0;
			}
		}
		System.out.println(a.get(0));
	}
	
	
}
