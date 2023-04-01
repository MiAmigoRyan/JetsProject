package com.skilldistillery.jets.entities;

public class FighterJet extends Jet{

	
	public void fight() {
		//intitate fight method "fighting"
		System.out.println("fighting");
		
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	
	}
	
	
	
	
	
}
