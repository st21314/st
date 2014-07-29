package com.st.one.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ChatDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Go");
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receiveSocket = new DatagramSocket(10086);
		
		UdpReceive01 receive = new UdpReceive01(receiveSocket);
		UdpSend01 send = new UdpSend01(sendSocket);
		
		new Thread(receive).start();
		new Thread(send).start();
	}
}

class UdpSend01 implements Runnable {
	private DatagramSocket socket;

	public UdpSend01(DatagramSocket socket) {
		this.socket = socket;
	}

	public UdpSend01() {
		try {
			this.socket = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		try {

			Scanner scanner = new Scanner(System.in);
			String line = null;
			while ((line = scanner.nextLine())!=null) {
				byte[] b = line.getBytes();
				DatagramPacket packet = new DatagramPacket(b, b.length,
						InetAddress.getByName("192.168.1.109"), 10086);
				socket.send(packet);
				
				if (line.equals("886")) {
					break;
				}
				
			}
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}

}

class UdpReceive01 implements Runnable {
	private DatagramSocket socket;

	public UdpReceive01(DatagramSocket socket) {
		super();
		this.socket = socket;
	}

	public UdpReceive01() {
		try {
			this.socket = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			for (;;) {
				byte[] buf = new byte[1024];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				String ip = packet.getAddress().getHostAddress();
				String name = packet.getAddress().getHostName();
				String data = new String(packet.getData(), 0, packet.getLength());
				System.out.println(name + "/" + ip + "::\t" + data);
				if (data.equals("886")) {
					System.out.println(name + "/" + ip + "  is out");
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}