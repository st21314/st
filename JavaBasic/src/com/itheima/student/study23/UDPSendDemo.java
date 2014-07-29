package com.itheima.student.study23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(8888);
		byte[] buf = "UDP123123123".getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"),10000);
		socket.send(packet);
		socket.close();
		
		
	}
}
