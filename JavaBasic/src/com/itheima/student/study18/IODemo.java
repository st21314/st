package com.itheima.student.study18;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {
		try {
			
			FileWriter writer = new FileWriter("C:\\Users\\one\\Desktop\\1.txt");
			writer.write("hello world\n"
					+ "123123123");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
