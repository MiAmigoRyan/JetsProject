package com.skilldistillery.jets.entities;

public class UFO extends Jet {

	public UFO(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void abduct() {
		System.out.println("Take me to your leader");

	}

}
