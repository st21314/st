package com.itheima.student.study19;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyBufferedInputStreamDemo {
	private InputStream in ;
	private byte[] buffer = new byte[1024];
	private int pos = 0, count = 0;
	public MyBufferedInputStreamDemo(InputStream in) {
		super();
		this.in = in;
	}
	
	public int read() throws IOException {
		if (count == 0) {
			count = in.read(buffer);
			if (count<0) {
				return -1;
			}
			pos=0;
		}
		byte b = buffer[pos++];
		count--;
		return b&0xff;
		
	}
	
	public void close() throws IOException {
		in.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		copy();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void copy() throws FileNotFoundException, IOException {
		MyBufferedInputStreamDemo inputStream = new MyBufferedInputStreamDemo(new FileInputStream("D:\\1\\1.avi"));
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:\\1\\2.avi"));
		int ch;
		while((ch = inputStream.read()) != -1){
			outputStream.write(ch);
		}
		inputStream.close();
		outputStream.close();
	}
	
}
