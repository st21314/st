package com.itheima.student.study19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		FileWriter writer = null;
		BufferedWriter bufferedWriter = null;
		try {
			writer = new FileWriter("D:\\1.txt");
			bufferedWriter = new BufferedWriter(writer);
			for (int i = 0; i < 20; i++) {
				for (int k = i; k < 20; k++) {
					bufferedWriter.write(" ");
				}
				for (int j = 0; j < i; j++) {
					bufferedWriter.write("* ");
					
				}
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}


