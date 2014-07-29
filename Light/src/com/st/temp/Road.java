package com.st.temp;

import java.util.Random;
import java.util.concurrent.Executor;

public class Road {
	String name;
	Road next;
	int num = 0;
	public Road(String name, Road next) {
		super();
		this.name = name;
		this.next = next;
		Executor executor = new Executor() {
			
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				while(true){
					num++;
					try {
						Thread.sleep((long) (Math.random()*1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	}
	
}
