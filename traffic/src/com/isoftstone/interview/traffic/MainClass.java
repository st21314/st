package com.isoftstone.interview.traffic;

public class MainClass {
	public static void main(String[] args) {

		String[] directions = new String[]{
				"S2N", "S2W", "E2W", "E2S",
				"N2S", "N2E", "W2E", "W2N",
				"S2E", "E2N", "N2W", "W2S"
		};
		
		for (String string : directions) {
			new Road(string);
		}
		
		new LampController();
		
	}
}
