package com.itheima;

/**
 * ��5�⣺�ڴ�ӡ�������δ�ӡ��3��x������ 
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
		new A().new B().func(); // д��main����������func����
	}
}

class A {
	int x = 1;

	class B {
		int x = 2;

		void func() {
			int x = 3;
			System.out.println(		// ��д �� ������
					"��һ����" + A.this.x +
					"\n�ڶ�����" + this.x +
					"\n��������" + x
					);
		}
	}
}