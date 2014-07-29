package com.itheima.student.study20;

import java.io.*;
import java.util.*;

/**
 * 有五个学生，每个学生有3门课的成绩； 从键盘输入以上数据（包括姓名，三门课成绩）； 输入格式：张三，30，40，60 计算出总成绩
 * 把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中
 * 
 * @author one
 * 
 */

public class Texting {
	public static void main(String[] args) {

		System.out.println("hello");
		try {
			Comparator<Student> c = Comparator.reverseOrder();

			TreeSet<Student> students = getStudents(c);
			
			output(students);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void output(TreeSet<Student> students) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				System.out));
		writer.write("[name,Chinese,Math,English]\ttotal");
		writer.newLine();

		for (Student student : students) {
			writer.write(student.toString());
			writer.newLine();
		}
		writer.close();
	}

	public static TreeSet<Student> getStudents()
			throws IOException {
				return getStudents(null);
	
	}
	public static TreeSet<Student> getStudents(Comparator<Student> c)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		TreeSet<Student> students = null;
		if (c==null) {
			students = new TreeSet<Student>();

		}else {
			students = new TreeSet<Student>(c);
			
		}

		String in = null;
		while (!(in = reader.readLine()).equals("end")) {
			String[] info = in.split(",");
			Student s = new Student(info[0], Integer.parseInt(info[1]),
					Integer.parseInt(info[2]), Integer.parseInt(info[3]));
			students.add(s);
		}

		reader.close();
		return students;
	}

}

class Student implements Comparable<Student> {
	String name;
	int cn, ma, en, sum;

	public Student(String name, int yuwen, int math, int english) {
		super();
		this.name = name;
		this.cn = yuwen;
		this.ma = math;
		this.en = english;
		this.sum = yuwen + math + english;
	}

	@Override
	public String toString() {
		return "Student[" + name + ", " + cn + ", " + ma + ", " + en + "]\t"+sum;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + sum * 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			throw new ClassCastException("Not a class");
		}
		return this.hashCode() == obj.hashCode();
	}

	public int compareTo(Student o) {
		int i;
		if ((i = new Integer(this.sum).compareTo(new Integer(o.sum))) != 0) {
			return i;
		} else if ((i = new Integer(this.cn).compareTo(new Integer(o.cn))) != 0) {
			return i;
		} else if ((i = new Integer(this.ma).compareTo(new Integer(o.ma))) != 0) {
			return i;
		} else if ((i = new Integer(this.en).compareTo(new Integer(o.en))) != 0) {
			return i;
		} else if ((i = this.name.compareTo(o.name)) != 0) {
			return i;
		}
		return 0;
	}

}