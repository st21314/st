package com.isoftstone.interview.traffic;

public enum Lamp {
	S2N("N2S", "S2W", false), S2W("N2E", "E2W", false), E2W("W2E", "E2S", false), E2S("W2N", "S2N", false),
	N2S(null, null, false), N2E(null, null, false), W2E(null, null, false), W2N(null, null, false),
	S2E(null, null, true), E2N(null, null, true), N2W(null, null, true), W2S(null, null, true);
	
	Lamp(){};
	Lamp(String opposite, String next, boolean lighted){
		this.opposite = opposite;
		this.next = next;
		this.lighted = lighted;
	}
	
	private boolean lighted;
	private String opposite;
	private String next;
	
	public boolean isLighted() {
		return lighted;
	}
	
	public void light() {
		this.lighted = true;
		if (opposite!=null) {
			Lamp.valueOf(opposite).light();
		}
		System.out.println(name()+ " is lighted");
	}
	
	Lamp nextLamp = null;
	public Lamp blackOut() {
		this.lighted = false;
		if (opposite!=null) {
			Lamp.valueOf(opposite).blackOut();
			Lamp.valueOf(next).light();
			nextLamp = Lamp.valueOf(next);
		}
		
		return nextLamp;
	}
}
