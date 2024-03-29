package com.itheima;

/**
 * 编写一个可以获取文件扩展名的函数，形参接收一个文件名字符串，返回一个扩展名字符串。
 * 
 * @author one
 * 
 */

public class Test8 {
	public static void main(String[] args) {
		String fileName = "test.fake_extension_name.java.txt";
		System.out.println("文件名：" + fileName); // 输出文件名
		String extensionName = getExtensionName(fileName); // 获取文件扩展名
		System.out.println("扩展名：" + extensionName); // 输出扩展名
	}

	/**
	 * 可以获取文件扩展名的函数
	 * 使用正则表达式（.*\.）匹配直到最后一个点之前（包括这个点）的所有字符串，
	 * 并替换为空字符串，即删除除扩展名以外的所有字符，返回扩展名
	 * 
	 * @param fileName
	 * @return extensionName
	 */
	private static String getExtensionName(String fileName) {
		return fileName.replaceAll(".*\\.", "");
	}
}
