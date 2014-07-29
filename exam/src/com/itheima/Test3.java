package com.itheima;

import java.util.Scanner;

/**
 * 第3题：从键盘接受一个数字，打印该数字表示的时间，最大单位到天，例如： 
 * 		键盘输入6，打印6秒； 
 * 		键盘输入60，打印1分； 
 * 		键盘输入66，打印1分6秒；
 * 		键盘输入666，打印11分6秒； 
 * 		键盘输入3601，打印1小时1秒
 * 
 * @author one
 * 
 */

public class Test3 {
	public static void main(String[] args) {
		int i = getInput(); // 从键盘接受一个数字
		printIt(i); // 打印该数字表示的时间
	}

	private static void printIt(int i) { // 打印该数字表示的时间
		StringBuilder time = new StringBuilder(); // 定义一个StringBuilder用于存放时间数据
		if (i >= 86400) { 	// 如达到一天则计算天数
			int day = i / 86400;
			time.append(day).append("天");
			i %= 86400; 	// 把不足一天的时间赋值给 i 
		}
		if (i >= 3600) {	// 如达到一小时则计算小时数
			int hour = i / 3600;
			time.append(hour).append("小时");
			i %= 3600;		// 把不足一小时的时间赋值给 i 
		}
		if (i >= 60) {		// 如达到一分钟则计算分钟数
			int min = i / 60;
			time.append(min).append("分");
			i %= 60;		// 把不足一分钟的时间赋值给 i 
		}
		if (i != 0) { 		// 如不为 0 秒则输出秒数
			time.append(i).append("秒");
		}
		System.out.println(time.toString());	// 打印出结果
	}
	
	private static int getInput() { // 从键盘接受一个数字
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		for (;;) { // 当输入错误字符串（不符合Integer形式或输入数字小于 0 ）时，做简单的处理，不至于使程序崩溃
			try {
				System.out.println("请输入秒数：");
				i = scanner.nextInt(); // 接收键盘输入的 int 型并存入变量 i 中
				if (i < 0) {
					throw new Exception(); // 如输入小于 0 的数，视为错误输入
				}
				break;
			} catch (Exception e) {
				System.out.println("您可能输入了错误的字符。"); // 简单的异常处理
				scanner.nextLine(); // 接收输入的错误字符串以备下一次输入
			}
		}
		scanner.close();
		return i;
	}
}
