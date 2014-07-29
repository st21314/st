package com.itheima.student.study19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
	public static void main(String[] args) {
		try {
			copyPng();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writerFile() throws IOException {
		FileOutputStream stream = new FileOutputStream("D:\\1\\2.txt");
		stream.write("Hello".getBytes());
		stream.close();
	}
	
	
	
	@SuppressWarnings("resource")
	public static void copyPng3() throws IOException {
		FileInputStream inputStream = new FileInputStream("D:\\1\\1.png");
		FileOutputStream outputStream = new FileOutputStream("D:\\1\\2.jpg");
		int num = inputStream.available();
		byte[] b = new byte[num];
		inputStream.read(b);
		outputStream.write(b);
		
		System.out.println(new String(b));
	}
	
	public static void copyPng() throws IOException {
		FileInputStream inputStream = new FileInputStream("D:\\1\\1.png");
		FileOutputStream outputStream = new FileOutputStream("D:\\1\\2.png");
		int len ;
		
		byte[] bs = new byte[1024];
		
		
		while((len = inputStream.read(bs))!=-1){
//			System.out.println(new String(bs, 0, len));
			outputStream.write(bs, 0, len);
			
		}
		
		inputStream.close();
		outputStream.close();
	}
}

