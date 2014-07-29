package com.itheima.student.study20;

import java.io.*;
import java.util.Vector;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		Test();
	}

	public static void Test() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in1 = new FileInputStream("D:\\1\\1.txt");
		FileInputStream in2 = new FileInputStream("D:\\1\\2.txt");
		FileInputStream in3 = new FileInputStream("D:\\1\\3.txt");

		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(in1);
		v.add(in2);
		v.add(in3);

		SequenceInputStream in = new SequenceInputStream(v.elements());
		
		FileOutputStream out = new FileOutputStream("D:\\1\\sq.txt");
		
		int len = 0;
		byte[] b = new byte[1024];
		while((len = in.read(b))!=-1){
			out.write(b, 0, len);
			
		}
		in.close();
		out.close();
		
	}
}
