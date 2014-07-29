package com.itheima.student.study19;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		reader = new FileReader("D:\\1.txt");
		bufferedReader = new BufferedReader(reader);
		String string = null;
		while ((string = bufferedReader.readLine()) != null) {
			System.out.println(string);
		}
		bufferedReader.close();
	}
}
