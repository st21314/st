package com.itheima.student.study23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ͨ��UDP���䷽ʽ����һ���������ݷ��ͳ�ȥ
 * ˼·��
 * 	1.����socket����
 * 	2.�ṩ���ݣ����
 * 	3.ͨ��socket���������ݰ�
 * 	4.�ر���Դ
 * @author one
 *
 */
public class UdpDemo {
	public static void main(String[] args) {
		try {
			UdpReceive.receive();
			UdpSend.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class UdpSend{
	public static void send() throws Exception {
		DatagramSocket socket = new DatagramSocket();
		byte[] buf = "UDP".getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.109"),10010);
		socket.send(packet);
		socket.close();
		
		
	}
}
class UdpReceive{
	public static void receive() throws Exception {
		DatagramSocket socket = new DatagramSocket(10010);
		byte[] buf = new byte[1024];
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		String s = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println(s);
		
		int port = packet.getPort();
		
		System.out.println("IP::"+port);
		
		System.out.println(packet.toString());
		System.out.println(packet.getAddress().getHostAddress());
		
		
		socket.close();
	}
}