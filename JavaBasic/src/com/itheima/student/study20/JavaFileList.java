package com.itheima.student.study20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JavaFileList {
	public static void main(String[] args) {
		File dir = new File("D:\\");
		String regex = ".*\\.info";
		List<File> list = new ArrayList<File>();
		fileToList(dir, list, regex);
		System.out.println(list.size());
		String fileName = "D:\\1\\AviFile.txt";
		writerToFile(list, fileName);
	}

	private static void writerToFile(List<File> list, String fileName) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			for (File file : list) {
				writer.write(file.getAbsolutePath());
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (writer!=null) {
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void fileToList(File dir, List<File> list, String regex ) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory() && !file.isHidden()) {
				fileToList(file, list, regex);
			}else {
				if (file.getName().matches(regex)) {
					list.add(file);
				}
			}
		}
		
	}
	
}
