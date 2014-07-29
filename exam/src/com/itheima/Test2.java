package com.itheima;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 第2题：创建ArrayList对象，添加5个元素，使用Iterator遍历输出
 * 
 * @author one
 */

public class Test2 {
	public static void main(String[] args) {

		// 创建ArrayList对象 arr
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// 添加5个元素
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		// 使用Iterator遍历输出
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
