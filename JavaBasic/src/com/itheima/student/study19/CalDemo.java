package com.itheima.student.study19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		cal();
		
		
	}

	private static void cal() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		String buf = null;
		double d = 0 ;
		
		for(;;){
			buf = reader.readLine();
			if (buf.length() <= 0) {
				continue;
			}
			if (buf.equals("end")) {
				break;
			}
			if (buf.startsWith("+")) {
				d+=new Double(buf.substring(1));
				string += buf;
			}else if (buf.startsWith("-")) {
				d-=new Double(buf.substring(1).trim());
				string += buf;
			}else if (buf.startsWith("*")) {
				d*=new Double(buf.substring(1).trim());
				string = "("+string+")"+buf;
			}else if (buf.startsWith("/")) {
				d/=new Double(buf.substring(1).trim());
				string = "("+string+")"+buf;
			}else {
				d = new Double(buf);
				string = buf;
			}
			if ((d - Math.round(d)) == 0) {
				System.out.print((int)d);
			}else {
				System.out.print(d);
			}
			System.out.println( "\t(" + string + ")");
		}
	}
}
