package com.skilldistillery.jets.entities;

public class Helicopter extends Jet {

	public Helicopter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void fly() {
		super.fly();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void hover() {
		System.out.println("wop-wop-wop-wop");
	}
	
}
