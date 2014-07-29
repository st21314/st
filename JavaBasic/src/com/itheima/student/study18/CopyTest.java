package com.itheima.student.study18;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyTest {
	public static void main(String[] args) throws Exception {
		FileReader reader = null;
		FileWriter writer = null;
		writer = new FileWriter("D:\\2.txt");
		reader = new FileReader("D:\\1.txt");
		int len;
		char[] buffer = new char[1024];
		while((len=reader.read(buffer))!=-1){
			writer.write(buffer, 0, len);
			writer.flush();
		}
		writer.close();reader.close();
	}
}

