package com.itheima.student.study19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyDemo {
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader("D:\\1.txt"));
			writer = new BufferedWriter(new FileWriter("D:\\2.doc"));
			
			String line = null;
			while((line = reader.readLine())!=null){
				writer.write(line);
				writer.newLine();
				writer.flush();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
