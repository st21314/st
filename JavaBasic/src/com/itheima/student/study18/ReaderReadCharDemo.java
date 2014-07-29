package com.itheima.student.study18;

import java.io.FileReader;
import java.io.IOException;

public class ReaderReadCharDemo {
	public static void main(String[] args) {
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:\\Users\\one\\Desktop\\2.txt");
			
			char[] chars = new char[1024];
//			int num = reader.read(chars);
//			System.out.println(num+"\t"+new String(chars, 0 , num));
			
			int num;
			while((num=reader.read(chars))!=-1){
				System.out.println(new String(chars, 0, num));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null)
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
