package com.itheima.student.study20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GbkUtfDemo {
	public static void main(String[] args) throws Exception {
		writeGBK();
		writeUTF();
		readGBK();
		readGBK_1();
		readUTF();
		readUTF_1();
		
	}

	private static void readGBK() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\gbk.txt")));
		System.out.println(reader.readLine());
		reader.close();
	}
	private static void readGBK_1() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\utf.txt")));
		System.out.println(reader.readLine());
		reader.close();
	}
	private static void readUTF() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\utf.txt"),"utf-8"));
		System.out.println(reader.readLine());
		reader.close();
	}
	private static void readUTF_1() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\gbk.txt"),"utf-8"));
		System.out.println(reader.readLine());
		reader.close();
	}

	private static void writeGBK() throws Exception {
		// TODO Auto-generated method stub
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("D:\\1\\gbk.txt"));
		writer.write("ÄãºÃ");
		writer.close();
	}

	private static void writeUTF() throws Exception  {
		// TODO Auto-generated method stub
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("D:\\1\\utf.txt"), "utf-8");
		writer.write("ÄãºÃ");
		writer.close();
	}
}
