package com.skilldistillery.jets.entities;

public class UFO extends Jet implements CombatReady, CargoCarrier{

	public UFO(String type, String model, double speed, int range, long price) {
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
		System.out.println("Take me to your leader");
		System.out.println();
		
	}

	@Override
	public void fight() {
	 System.out.println();
	 System.out.println("zapp!");
	 System.out.println();
		
	}

}
