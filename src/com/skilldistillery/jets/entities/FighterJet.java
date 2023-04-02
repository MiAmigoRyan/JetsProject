package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	

	public FighterJet(String type, String model, double speed, int range, long price) {
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
		System.out.println();
		System.out.println("pewpew");
		System.out.println();
	}

	
	
	
	
	
}
