package com.itheima.student.study19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByBuffer {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		copy();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	public static void copy4() throws IOException {
		//43\46\91\49
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\1\\1.avi"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.avi"));
		int len;
		byte[] b = new byte[4096];
		while((len = inputStream.read(b)) != -1){
			outputStream.write(b, 0, len);
		}
		inputStream.close();
		outputStream.close();
	}
	public static void copy2() throws IOException {
		//52\88
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\1\\1.avi"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.avi"));
		int len;
		byte[] b = new byte[2048];
		while((len = inputStream.read(b)) != -1){
			outputStream.write(b, 0, len);
		}
		inputStream.close();
		outputStream.close();
	}
	
	public static void copy6() throws IOException {
		//293\77
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\1\\1.avi"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.avi"));
		int len;
		byte[] b = new byte[1024];
		while((len = inputStream.read(b)) != -1){
			outputStream.write(b, 0, len);
		}
		inputStream.close();
		outputStream.close();
	}
	
	public static void copy() throws IOException {
		//1123
		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\1\\1.avi"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.avi"));
		int ch;
		while((ch = inputStream.read()) != -1){
			outputStream.write(ch);
		}
		inputStream.close();
		outputStream.close();
	}
}
