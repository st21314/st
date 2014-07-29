package com.itheima.student.study18;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		Set<Object> objects = properties.keySet();
		for (Object object : objects) {
			String value = (String)properties.get(object);
			System.out.println(object+"::"+value);
			
			
		}
	}

}
