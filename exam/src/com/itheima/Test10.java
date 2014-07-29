package com.itheima;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * ��10�⣺ʹ��TCPЭ�����һ���ͻ���һ�����������ͻ��˴Ӽ��������ȡһ���ַ��������͵���������
 * ���������տͻ��˷��͵��ַ�������ת֮�󷢻ؿͻ��ˡ��ͻ��˽��ղ���ӡ��
 * 
 * ˼·�����������ƣ�������ʹ�ñ������ӣ�localhost������������ͻ����ö��̷߳�ʽ��ͬһ���ն����С�
 * 
 * @author one
 * 
 */
public class Test10 {
	public static void main(String[] args) {
		new Thread(new Server()).start(); // ����������
		new Thread(new Client()).start(); // �����ͻ���
	}
}

/**
 * �ͻ����࣬�������벢�����ת�����ʵ��Runnable�ӿ�����Ϊ�̵߳��á�
 * 
 * @author one
 * 
 */
class Client implements Runnable {
	public void run() {
		Socket socket = null;
		Scanner scanner = null;
		try {
			socket = new Socket("localhost", 10086); // ������ʹ��localhost/127.0.0.1���˿ڶ���10086
			scanner = new Scanner(System.in); // ����Scanner���ռ���¼��
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // ����PrintWriter�������������������
			BufferedReader in = new BufferedReader(new InputStreamReader(
					socket.getInputStream())); // ����BufferedReader��ȡ���������ص��ַ���

			String string = scanner.nextLine();// �ͻ��˴Ӽ��������ȡһ���ַ���
			out.println(string); // ���ַ������͵�������
			
			String reString = in.readLine(); // �ͻ��˽��ղ���ӡ���������ص��ַ���
			System.out.println("���������ط�ת����ַ���:\t" + reString);
		} catch (Exception e) {
			e.printStackTrace(); // �쳣��������ӡ����·��
		} finally { // �ر���Դ
			if (scanner != null) {
				scanner.close();
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

/**
 * �������࣬�����ַ��������ط�ת����ַ�����ʵ��Runnable�ӿ�����Ϊ�̵߳��á�
 * 
 * @author one
 * 
 */
class Server implements Runnable {
	public void run() {
		ServerSocket server = null;
		Socket socket = null;
		try {
			server = new ServerSocket(10086); // ������������˿ڶ���10086
			socket = server.accept(); // ��ȡsocket����
			BufferedReader in = new BufferedReader(new InputStreamReader(
					socket.getInputStream())); // ����BufferedReader���ڶ�ȡ�ͻ��˴�����ַ���
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // ����PrintWriter������ͻ��˷�������

			String ip = socket.getInetAddress().getHostAddress(); // ��ȡ�ͻ���IP������Ϊ127.0.0.1��
			System.out.println(ip + "has connected");

			String line = in.readLine(); // ���տͻ��˴�����ַ���
			System.out.println(ip + "�����ַ�����\t" + line);
			
			String reString = new StringBuilder(line).reverse().toString(); // �õ���ת�ַ���
			out.println(reString); // ���ط�ת����ַ������ͻ���
		} catch (Exception e) {
			e.printStackTrace(); // �쳣��������ӡ����·��
		} finally { // �ر���Դ
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}