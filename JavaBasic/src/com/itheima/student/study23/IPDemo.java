package com.itheima.student.study23;

import java.net.InetAddress;

public class IPDemo {
	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.toString());
		System.out.println(address);
		System.out.println(address.getHostName());
		
		InetAddress i = InetAddress.getByName("192.168.1.109");
		print(i);

		InetAddress[] baidu = InetAddress.getAllByName("www.baidu.com");
		System.out.println(baidu);
		for (InetAddress inetAddress : baidu) {
			print(inetAddress);
		}
		
	}

	private static void print(InetAddress i) {
		System.out.println(i+"\t"+i.getHostName());
	}

}
