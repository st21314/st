package com.itheima;

/**
 * 第5题：在打印语句中如何打印这3个x变量？ 
 * 	class A { 
 * 		int x = 1; 
 * 		class B { 
 * 			int x = 2; 
 * 			void func() {
 * 				int x = 3; 
 * 				System.out.println( ? ); 
 * 			} 
 * 		} 
 * 	}
 * 
 * @author one
 * 
 */
public class Test5 {	
	public static void main(String[] args) {
		new A().new B().func(); // 写出main方法，调用func函数
	}
}

class A {
	int x = 1;

	class B {
		int x = 2;

		void func() {
			int x = 3;
			System.out.println(		// 填写 ？ 处如下
					"第一个：" + A.this.x +
					"\n第二个：" + this.x +
					"\n第三个：" + x
					);
		}
	}
}