package com.skilldistillery.jets.entities;

public class Helicopter extends Jet {

	public Helicopter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void hover() {
		System.out.println("wop-wop-wop-wop");
	}
	
}
