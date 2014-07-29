package com.itheima;

import java.io.*;

/**
 * 编写程序，将指定目录下所有.java文件拷贝到另一个目的中，并将扩展名改为.txt
 * 
 * @author one
 * 
 */

public class Test9 {
	public static void main(String[] args) {
		File dirFrom = new File("D:\\exam"); // 指定源目录
		File dirTo = new File("D:\\exam1"); // 指定目标目录

		try {
			System.out.println("开始复制");
			copyFiles(dirFrom, dirTo); // 调用复制文件方法
			System.out.println("复制完成");
		} catch (IOException e) {
			e.printStackTrace(); // 简单的异常处理，打印异常路径
		}

	}

	/**
	 * 将指定目录dirFrom下所有.java文件拷贝到目录dirTo中，并将扩展名改为.txt
	 * 
	 * @param dirFrom
	 * @param dirTo
	 * @throws IOException
	 */
	private static void copyFiles(File dirFrom, File dirTo) throws IOException {
		if (!dirTo.exists()) {
			dirTo.mkdir(); // 如目标目录不存在则创建目录
		}

		File[] files = dirFrom.listFiles(); // 列出源目录下的文件列表
		for (File fileFrom : files) { // 遍历源目录下的文件
			if (fileFrom.isDirectory()) {
				copyFiles(fileFrom, dirTo); // 如果是目录则对其进行遍历复制操作
			} else if (fileFrom.getName().endsWith(".java")) { // 判断扩展名为.java
				// 新文件父路径为指定目标目录，文件名与源文件相同，扩展名改为.txt
				File fileTo = new File(dirTo, fileFrom.getName().replaceAll(
						"\\.java\\b", ".txt"));

				copy(fileFrom, fileTo); // 用IO操作复制文件
			}
		}
	}

	/**
	 * 用IO操作复制文件 
	 * 创建新文件fileTo，并将fileFrom中的数据复制到fileTo中
	 * 
	 * @param fileFrom
	 * @param fileTo
	 * @throws IOException
	 */
	private static void copy(File fileFrom, File fileTo) throws IOException {
		fileTo.createNewFile();
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				fileFrom));
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream(fileTo));
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		in.close();
		out.close();
	}
}
