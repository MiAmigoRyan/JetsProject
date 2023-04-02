package com.skilldistillery.jets.entities;

public class JetImpl extends Jet implements CargoCarrier {

	public JetImpl(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	
	@Override
	public void fly() {
		super.fly();
	}


	@Override
	public String toString() {
		return super.toString();
	}


	@Override
	public void loadCargo() {
		System.out.println();
		System.out.println("ALL ABOARD!!!");
		System.out.println();
		
	}

}