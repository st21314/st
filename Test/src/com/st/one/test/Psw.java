package com.st.one.test;

import java.util.ArrayList;
import java.util.Random;

public class Psw {
	public static void main(String[] args) {
		ArrayList<String> passwords = getPasswords();
		
		for (String password : passwords) {
			System.out.println(password);
		}
		
		System.out.println("arrayList.size()\t"+passwords.size());
		
		String password = getPassword(passwords);
		System.out.println(password);
	}
	
	private static String getPassword(ArrayList<String> passwords) {
		String password = passwords.get(new Random().nextInt(passwords.size()));
		return password;
	}
	
	private static ArrayList<String> getPasswords() {
		ArrayList<String> passwords = new ArrayList<String>();
		
		for (int n1 = 0; n1 < 10; n1++) {
			for (int n2 = n1 + 1; n2 < 10; n2++) {
				for (int n3 = n2 + 1; n3 < 10; n3++) {
					for (int n4 = 0; n4 < n3; n4++) {
						for (int n5 = 0; n5 < n4; n5++) {
							passwords.add(new StringBuilder().append(n1)
									.append(n2).append(n3).append(n4)
									.append(n5).toString());
						}
					}
				}
			}
		}
		return passwords;
	}
}
