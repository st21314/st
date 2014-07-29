package com.itheima.student.study23;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TcpDemo {
	public static void main(String[] args) {
		System.out.println("Go");
		new Thread(new Server()).start();
		new Thread(new Client()).start();
	}
}

class Client implements Runnable{

	public void run() {
		try {
			Socket s = new Socket("192.168.1.109", 10086);
			Scanner scanner = new Scanner(System.in);
			OutputStream out = s.getOutputStream();
			out.write(scanner.nextLine().getBytes());
			
			InputStream in = s.getInputStream();
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			System.out.println(new String(buf, 0, len));
			scanner.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Server implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(10086);
			Socket s = server.accept();
			InputStream in = s.getInputStream();
			
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String string = new String(buf, 0, len);
			System.out.println(s.getInetAddress().getHostName()+"::"+string);
			
			OutputStream out = s.getOutputStream();
			String re = new StringBuilder(string).reverse().toString();
			out.write(re.getBytes());
			s.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}