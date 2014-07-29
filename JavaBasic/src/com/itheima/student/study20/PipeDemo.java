package com.itheima.student.study20;

import java.io.*;

public class PipeDemo {
	public static void main(String[] args) throws Exception {
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream(in);
		Read read = new Read(in);
		Write write = new Write(out);
		new Thread(read).start();
		new Thread(write).start();
	}
}

class Read implements Runnable {

	private PipedInputStream in;

	public Read(PipedInputStream in) {
		super();
		this.in = in;
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("in.go");
			
			byte[] b = new byte[1024];
			int len = in.read(b);
			System.out.println("in.got");
			String s = new String(b, 0, len);
			System.out.println(s);
			in.close();
			System.out.println("in.done");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("ERROR");
		}
	}

}

class Write implements Runnable {
	private PipedOutputStream out;

	public Write(PipedOutputStream out) {
		super();
		this.out = out;
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Go");
			Thread.sleep(6000);
			out.write("111".getBytes());
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

}