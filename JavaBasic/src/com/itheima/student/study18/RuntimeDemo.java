package com.itheima.student.study18;

/**
 * runtime����
 * û�й��캯��
 * �������ģʽ
 * 
 * static Runtime getRuntime(){}
 * @author one
 *
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("notepad.exe C:\\Users\\one\\Downloads\\daomubiji\\����˵��.txt");
			Thread.sleep(10000);
			process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
