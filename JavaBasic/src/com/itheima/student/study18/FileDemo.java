package com.itheima.student.study18;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("C:\\Users\\one\\Desktop\\2.txt", true);
			
			writer.write("\r\nHello");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
