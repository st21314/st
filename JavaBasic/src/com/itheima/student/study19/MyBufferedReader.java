package com.itheima.student.study19;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	private FileReader reader;

	public MyBufferedReader(FileReader reader) {
		this.reader = reader;
	}

	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		int ch;
		while ((ch = reader.read()) != -1) {
			if (ch == '\r') {
				continue;
			} else if (ch == '\n') {
				return sBuilder.toString();
			} else {
				sBuilder.append((char) ch);
			}
		}
		if (sBuilder.length() <= 0) {
			return sBuilder.toString();
		}
		return null;
	}

	public void close() throws IOException  {
		reader.close();

	}

	public static void main(String[] args) throws Exception {
		MyBufferedReader reader = new MyBufferedReader(new FileReader(
				"D:\\1.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {

			System.out.println(line);
		}

	}
}
