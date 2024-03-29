package com.itheima;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 第7题：数组去重复，例如: 原始数组是{4,2,4,6,1,2,4,7,8}，得到结果{4,2,6,1,7,8}
 * 
 * @author one
 * 
 */

public class Test7 {
	public static void main(String[] args) {
		Object[] arr = { 4, 2, 4, 6, 1, 2, 4, 7, 8 };
		
		System.out.print("原始数组是：\t");
		printArray(arr); // 打印原始数组

		Object[] newArr = getNewArray(arr); // 去重复，得到新数组

		System.out.print("得到结果：\t");
		printArray(newArr); // 打印新数组
	}

	/**
	 * 使用LinkedHashSet存放数据，保证不包含重复数据，同时不打乱原始排序
	 * 
	 * @param objs
	 * @return newArr
	 */
	private static Object[] getNewArray(Object[] objs) { // 去重复，得到新数组
		// 定义LinkedHashSet用于存放数据
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		for (Object object : objs) {
			set.add(object); // 添加元素，默认去除重复元素
		}
		Object[] newArr = new Object[set.size()]; // 定义适当大小的新数组

		Iterator<Object> it = set.iterator();
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = it.next(); 		// 将结果存入新数组
		}
		return newArr; // 返回新数组
	}

	private static void printArray(Object[] arr) { // 打印数组
		System.out.print("{");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[arr.length - 1] + "}");
	}
}
