package com.itheima.student.study19;

import java.io.IOException;
import java.io.InputStream;

public class ReadIn {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		System.out.println("Go");
		StringBuilder stringBuilder = new StringBuilder();
		
		
		while (true) {
			int ch = in.read();
			if (ch == '\r') {
				continue;
			}else if (ch == '\n') {
				String s = stringBuilder.toString();
				if (s.trim().toUpperCase().equals("OVER")) {
					break;
				}
				System.out.println(s);
				stringBuilder.delete(0, stringBuilder.length());
				
			}else {
				stringBuilder.append((char)ch);
				
			}
		}
	}
}
