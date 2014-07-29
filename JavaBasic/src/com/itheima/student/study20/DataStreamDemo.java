package com.itheima.student.study20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import sun.text.normalizer.UTF16;

@SuppressWarnings("unused")
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		readUtf();
	}

	private static void readUtf() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream(new FileInputStream("D:\\1\\utfdata.txt"));
		System.out.println(in.readUTF());
		in.close();
	}

	private static void utf_8() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("D:\\1\\utf.txt");
		OutputStreamWriter writer = new OutputStreamWriter(out, "utf-8");
		writer.write("我们亚洲");
		writer.close();
	}

	private static void utf() throws IOException {
		// TOO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\1\\utfdata.txt"));
		out.writeUTF("我们亚洲");
		out.close();
	}

	private static void Read() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream(new FileInputStream("D:\\1\\data.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		in.close();
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\1\\data.txt"));
		out.writeInt(97);
		out.writeBoolean(true);
		out.close();
	}
	
	
	
}
