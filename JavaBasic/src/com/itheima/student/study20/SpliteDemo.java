package com.itheima.student.study20;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;


public class SpliteDemo {
	public static void main(String[] args) throws IOException {
		spliteFile();
//		mergeFile();
		System.out.println("done".toCharArray());
	}
	
	public static void mergeFile() throws IOException {
		ArrayList<FileInputStream> arr = new ArrayList<FileInputStream>();
		File dir = new File("D:\\1\\2\\2");
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
			arr.add(new FileInputStream(file));
		}
		final Iterator<FileInputStream> iterator = arr.iterator();
		Enumeration<FileInputStream> e = new Enumeration<FileInputStream>() {

			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return iterator.hasNext();
			}

			public FileInputStream nextElement() {
				// TODO Auto-generated method stub
				return iterator.next();
			}
			
		};
		SequenceInputStream in = new SequenceInputStream(e);
		
		FileOutputStream out = new FileOutputStream("D:\\1\\2\\2.png");
		
		byte[] b = new byte[1024];
		int len = 0;
		while((len = in.read(b))!=-1){
			out.write(b, 0, len);
		}
		
		in.close();
		out.close();
		
	}
	
	public static void spliteFile() throws IOException {
		FileInputStream in = new FileInputStream("D:\\1\\2\\1.png");
		FileOutputStream out = null;
		byte[] b = new byte[1024*512];
		byte[] b1 = new byte[1024];
		int len = in.read(b1);
		int i = 1;
		while((len = in.read(b)) != -1){
			out = new FileOutputStream("D:\\1\\2\\2\\"+i+++".png");
			out.write(b1);
			out.write(b, 0, len);
			out.close();
		}
		in.close();
	}
	
}
