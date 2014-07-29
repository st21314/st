package com.itheima.student.study20;

import java.io.*;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		writeObj();
		readObj();
	}

	private static void readObj() throws Exception {
		ObjectInputStream in =
				new ObjectInputStream(new FileInputStream("D:\\1\\person.object"));
		Object obj = in.readObject();
		Person p = (Person)obj;
		System.out.println(p.toString());
		in.close();
	}
	
	private static void writeObj() throws IOException {
		ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream("D:\\1\\person.object"));
		out.writeObject(new Person("zhang", 20));
		out.close();
	}
}

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name::"+name+"\tage::"+age;
	}
}


