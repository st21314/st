package com.itheima.student.study18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\Users\\one\\workspace\\JavaBasic\\src\\com\\itheima\\student\\study\\DateDemo.java");

			char[] chars = new char[1024];
//			int num = reader.read(chars);
//			System.out.println(num+"\t"+new String(chars, 0 , num));
			
			int num;
			while((num=reader.read(chars))!=-1){
				System.out.print(new String(chars, 0, num));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
