package com.st;

public class Light {
	public static void main(String[] args) {
		Road e1 = new Road(false);
		Road e2 = new Road(false);
		Road e3 = new Road(true);
		Road s1 = new Road(false);
		Road s2 = new Road(false);
		Road s3 = new Road(true);
		Road w1 = new Road(false);
		Road w2 = new Road(false);
		Road w3 = new Road(true);
		Road n1 = new Road(false);
		Road n2 = new Road(false);
		Road n3 = new Road(true);

		Road[] roads = { e1, e2, e3, s1, s2, s3, w1, w2, w3, n1, n2, n3 };

		int n = 0;

		for (int i = 0; i < 12; i++) {
			System.out.print(roads[i]);
		}
		while (true) {

			for (int i = 0; i < 12; i++) {
				if (Math.random() < 0.25) {
					roads[i].num += 1;
				}
				if (roads[i].green&&roads[i].num>0) {
					roads[i].num -= 1;
				}
				System.out.print(roads[i].num + "\t");
			}
			switch (n) {
			case 0:
				roads[1].green = true;
				roads[7].green = true;
				break;
			case 10:
				roads[0].green = true;
				roads[1].green = false;
				roads[6].green = true;
				roads[7].green = false;
				break;
			case 20:
				roads[0].green = false;
				roads[4].green = true;
				roads[6].green = false;
				roads[10].green = true;
				break;
			case 30:
				roads[3].green = true;
				roads[4].green = false;
				roads[9].green = true;
				roads[10].green = false;
				break;

				
				
				
				
			default:
				break;
			}
			n++;

			if (n >= 40) {
				n = 0;
			}
			System.out.println(roads.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
