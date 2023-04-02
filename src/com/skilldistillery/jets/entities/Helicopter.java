package com.skilldistillery.jets.entities;

public class Helicopter extends Jet implements CombatReady, CargoCarrier {

	public Helicopter(String type, String model, double speed, int range, long price) {
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
		System.out.println(model + " " +type);
		System.out.println("GET IN ZE CHOPPER!!!");
		System.out.println();

	}

	@Override
	public void fight() {
		System.out.println(model + " " +type);
		System.out.println("bip bip bip bip");
		System.out.println();

	}

}
