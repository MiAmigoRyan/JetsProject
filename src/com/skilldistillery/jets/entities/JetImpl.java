package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, long price) {
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


	public void load() {
		System.out.println("Load em up!");
	}

}