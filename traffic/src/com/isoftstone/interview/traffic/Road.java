package com.isoftstone.interview.traffic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Road {
	List<String> vechicles = new ArrayList<String>();
	String name = null;

	public Road(String name) {
		this.name = name;

		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.execute(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					vechicles.add(Road.this.name + "_" + i);
					try {
						Thread.sleep((new Random().nextInt(10)+1)*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		ScheduledExecutorService timer = Executors.newScheduledThreadPool(1);
		timer.scheduleAtFixedRate(
				new Runnable() {
					
					public void run() {
						if (vechicles.size()>0) {
							boolean lighted = Lamp.valueOf(Road.this.name).isLighted();
							if (lighted) {
								System.out.println(vechicles.remove(0) + " is traversing!");
							}
						}
					}
				},
				1,
				1,
				TimeUnit.SECONDS);

	}

}
