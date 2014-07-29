package com.itheima.student.study18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWiterDemo {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("C:\\Users\\one\\Desktop\\2.txt");
			
			writer.write("Hello world");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(writer!=null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
