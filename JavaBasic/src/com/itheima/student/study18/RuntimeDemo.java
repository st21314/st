package com.itheima.student.study18;

/**
 * runtime对象
 * 没有构造函数
 * 单例设计模式
 * 
 * static Runtime getRuntime(){}
 * @author one
 *
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("notepad.exe C:\\Users\\one\\Downloads\\daomubiji\\下载说明.txt");
			Thread.sleep(10000);
			process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
