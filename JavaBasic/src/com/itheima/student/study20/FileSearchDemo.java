package com.itheima.student.study20;

import java.io.File;

public class FileSearchDemo {
	static File[] fs;
	public static void main(String[] args) {
//		File dir = new File("C:\\Users\\one\\workspace\\JavaBasic");
		File dir = new File("D:\\");
		findTxt(dir, 0);
	}
	
	public static String getLevel(int level) {
		StringBuilder builder = new StringBuilder();
		builder.append("|-");
		for (int i = 0; i < level; i++) {
			builder.insert(0, "| ");
		}
		return builder.toString();
	}
	
	public static void findTxt(File dir, int level) {
		System.out.println(getLevel(level)+dir.getName());
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()&&!file.isHidden()) {
				level++;
				findTxt(file,level+1);
			}else {
				if (file.getName().endsWith(".txt")) {
					System.out.println(getLevel(level)+file.getName());
				}
			}
		}
	}
	
}
