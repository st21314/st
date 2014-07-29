package com.itheima.student.study20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		System.out.println(1);
		test();
	}
	
	
	public static void test() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out, true);
		
		String line = null;
		while(!(line = in.readLine()).equals("end")){
			out.println(line);
		}
		out.close();
	}
	
}
