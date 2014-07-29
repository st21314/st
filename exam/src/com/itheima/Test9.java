package com.itheima;

import java.io.*;

/**
 * ��д���򣬽�ָ��Ŀ¼������.java�ļ���������һ��Ŀ���У�������չ����Ϊ.txt
 * 
 * @author one
 * 
 */

public class Test9 {
	public static void main(String[] args) {
		File dirFrom = new File("D:\\exam"); // ָ��ԴĿ¼
		File dirTo = new File("D:\\exam1"); // ָ��Ŀ��Ŀ¼

		try {
			System.out.println("��ʼ����");
			copyFiles(dirFrom, dirTo); // ���ø����ļ�����
			System.out.println("�������");
		} catch (IOException e) {
			e.printStackTrace(); // �򵥵��쳣��������ӡ�쳣·��
		}

	}

	/**
	 * ��ָ��Ŀ¼dirFrom������.java�ļ�������Ŀ¼dirTo�У�������չ����Ϊ.txt
	 * 
	 * @param dirFrom
	 * @param dirTo
	 * @throws IOException
	 */
	private static void copyFiles(File dirFrom, File dirTo) throws IOException {
		if (!dirTo.exists()) {
			dirTo.mkdir(); // ��Ŀ��Ŀ¼�������򴴽�Ŀ¼
		}

		File[] files = dirFrom.listFiles(); // �г�ԴĿ¼�µ��ļ��б�
		for (File fileFrom : files) { // ����ԴĿ¼�µ��ļ�
			if (fileFrom.isDirectory()) {
				copyFiles(fileFrom, dirTo); // �����Ŀ¼�������б������Ʋ���
			} else if (fileFrom.getName().endsWith(".java")) { // �ж���չ��Ϊ.java
				// ���ļ���·��Ϊָ��Ŀ��Ŀ¼���ļ�����Դ�ļ���ͬ����չ����Ϊ.txt
				File fileTo = new File(dirTo, fileFrom.getName().replaceAll(
						"\\.java\\b", ".txt"));

				copy(fileFrom, fileTo); // ��IO���������ļ�
			}
		}
	}

	/**
	 * ��IO���������ļ� 
	 * �������ļ�fileTo������fileFrom�е����ݸ��Ƶ�fileTo��
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