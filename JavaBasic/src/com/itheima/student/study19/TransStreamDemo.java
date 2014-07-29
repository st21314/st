package com.itheima.student.study19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("go");

//		InputStream in = System.in;
//		InputStreamReader inputStreamReader = new InputStreamReader(in);
//		BufferedReader reader = new BufferedReader(inputStreamReader);

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\1.txt"))); // File
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // CMD
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out)); // CMD
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\1\\3.txt"))); // File
		
		
//		OutputStream out = System.out;
//		OutputStreamWriter oswriter = new OutputStreamWriter(out);
//		BufferedWriter writer = new BufferedWriter(oswriter);
//		
		
		String line = null;
		while((line = reader.readLine()) != null){
			if (line.trim().toLowerCase().equals("over")) {
				break;
			}
//			System.out.println(line);
			writer.write(line);
			writer.newLine();
			writer.flush();
		}
		
	}
}
