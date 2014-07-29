package com.itheima.student.study19;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class SystemInfo {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		try {
			properties.list(new PrintStream("D:\\1\\sysinfo.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
