package com.itheima.student.study20;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

@SuppressWarnings("unused")
public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\1");
		String[] list =  file.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		});
		for (String string : list) {
			System.out.println(string);
		}
		
	}

	private static void list() {
		File file = new File("D:\\1");
		String[] list = file.list();
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void listroots() {
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void m1() throws IOException {
		File file = new File("D:"+File.separator+"1"+File.separator+"a.txt");
		System.out.println(file);

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.lastModified());
		System.out.println(file.length());
	}
}
