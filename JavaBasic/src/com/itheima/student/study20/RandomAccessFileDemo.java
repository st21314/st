package com.itheima.student.study20;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
//		write();
//		read();
		w2();
//		System.out.println(Integer.toBinaryString(252));
	}
	public static void w2() throws Exception {
		RandomAccessFile r = new RandomAccessFile("D:\\1\\r.txt", "rw");
		r.seek(24);
		r.write("Rose".getBytes());
		r.writeInt(121);
		r.close();
	}
	public static void write() throws Exception {
		RandomAccessFile r = new RandomAccessFile("D:\\1\\r.txt", "rw");
		r.write("lisa".getBytes());
		r.writeInt(97);
		r.write("Jack".getBytes());
		r.writeInt(99);
		r.close();
	}
	
	public static void read() throws Exception {
		RandomAccessFile r = new RandomAccessFile("D:\\1\\r.txt", "r");
		System.out.println(r.getFilePointer());
		r.seek(8);
		byte[] b = new byte[4];
		r.read(b);
		String name = new String(b);
		System.out.println(name);
		
		int age = r.readInt();
		System.out.println(age);
		
		r.close();
	}
	
}
