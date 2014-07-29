package com.itheima.student.study20;

import java.io.*;
import java.util.Properties;

public class PropDemo {
	public static void main(String[] args) throws IOException {
		count();
		
	}

	private static void count() throws IOException {
		Properties p = new Properties();
		File info = new File("D:\\1\\count.ini");
		System.out.println(info.exists());
		
		if (!info.exists()) {
			info.createNewFile();
		}
		
		FileInputStream in = new FileInputStream(info);
		p.load(in);
		System.out.println(p);
		int count = 0;
		String s = p.getProperty("count");
		System.out.println(s);
		if (s!=null) {
			count = Integer.parseInt(s);
			if (count>=5) {
				System.out.println("Done.");
				return;
			}
		}
		count++;
		System.out.println(count);
		p.setProperty("count", count+"");
		
		FileOutputStream out = new FileOutputStream(info);
		p.store(out, "Nuh");
	}
}
