package com.itheima.student.study19;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("D:\\1.txt");
//		MyLineNumberReader reader = new MyLineNumberReader(fileReader);
		
		LineNumberReader reader = new LineNumberReader(fileReader);
		String line = null;
		while((line = reader.readLine()) != null){
			System.out.println(reader.getLineNumber()+"\t:\t"+line);
		}
		
		reader.close();
		
		
	}
}

/**
 * Ä£ÄâLineNumberReader
 * @author one
 *
 */
class MyLineNumberReader{
	private Reader reader;
	private int lineNumber = 0;
	
	public MyLineNumberReader(Reader reader) {
		super();
		this.reader = reader;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String readLine() throws IOException{
		StringBuilder sb1 = new StringBuilder();
		int ch;
		lineNumber++;
//		sb1.append(lineNumber);
//		sb1.append(":\t");
//		
		while((ch = reader.read()) != -1){
			if (ch == '\r') {
				continue;
			} else if (ch == '\n') {
				return sb1.toString();
			} else {
				sb1.append(ch);
			}
		}
		
		if (sb1.length()>0) {
			return sb1.toString();
		}
		
		return null;
		
		
	}
	
	public void close() throws IOException {
		
		reader.close();
		
	}
}
