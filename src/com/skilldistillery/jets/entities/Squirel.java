package com.skilldistillery.jets.entities;

public class Squirel extends Jet implements CombatReady {

	public Squirel(String type, String model, double speed, int range, long price) {
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
	public void fight() {
		System.out.println(model + " " +type);
		System.out.println("AHHHAHHAHHAHHHHHHH");
		System.out.println();
	}
}
