package com.itheima.student.study20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		// getAndSet();
		// getInfo();
		getP();
	}

	public static void getP() throws IOException {
		Properties p = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader(
				"D:\\1\\info.txt"));

		FileOutputStream out = new FileOutputStream("D:\\1\\i.info");

		p.load(reader);
		p.list(System.out);
		p.store(out, "new");

	}

	public static void getInfo() throws IOException {
		File file = new File("D:\\1\\info.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));

		Properties p = new Properties();

		String string = reader.readLine();
		while ((string = reader.readLine()) != null) {
			System.out.println(string);
			String[] arr = string.split("=");
			p.setProperty(arr[0], arr[1]);

		}
		reader.close();

		System.out.println(p);
	}

	public static void getAndSet() throws IOException {
		// BufferedWriter writer = new BufferedWriter(new
		// FileWriter("D:\\info.txt"));
		PrintWriter printWriter = new PrintWriter("D:\\1\\info.txt");

		Properties properties = new Properties();
		properties.setProperty("Jack", "20");
		properties.setProperty("Rose", "10");
		System.out.println(properties);
		properties.list(printWriter);
		Set<String> names = properties.stringPropertyNames();
		for (String string : names) {
			System.out.println(string + ":\t" + properties.getProperty(string));

		}

		printWriter.close();
	}
}
