package com.skilldistillery.jets.entities;

public class Helicopter extends Jet implements CombatReady, CargoCarrier{

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

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
}
