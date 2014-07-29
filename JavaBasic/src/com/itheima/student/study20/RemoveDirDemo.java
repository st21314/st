package com.itheima.student.study20;

import java.io.File;

@SuppressWarnings("unused")
public class RemoveDirDemo {
	public static void main(String[] args) {
		// test();
		String string = "123456.";
		System.out.println(string.matches(".*[^a-zA-Z0-9].*")
				&& string.length() >= 7);
		boolean b = string.matches("(?=.*[^a-zA-Z0-9].*).{7,}");
		System.out.println(b);

	}

	private static void test() {
		File dir = new File("D:\\a");
		long start = System.currentTimeMillis();
		removeDir(dir);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void removeDir(File dir) {
		File[] files = dir.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
				removeDir(file);
			} else {
				System.out.println(file.delete());
			}
		}

		System.out.println(dir.delete());

	}

}
