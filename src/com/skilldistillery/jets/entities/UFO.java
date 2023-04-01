package com.skilldistillery.jets.entities;

public class UFO extends Jet {

	public UFO(String model, double speed, int range, long price) {
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
	public void abduct() {
		System.out.println("Take me to your leader");

	}

}
