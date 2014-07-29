package com.itheima.student.study18;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\Users\\one\\Desktop\\2.txt");
			
			int ch;
			while((ch=reader.read())!=-1){
				System.out.println(ch+"\t"+(char)ch);
			}
			
			
//			while(true) {
//				int ch = reader.read();
//				if (ch==-1) {
//					break;
//				}
//				System.out.println((char)ch);
//			}
			
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
