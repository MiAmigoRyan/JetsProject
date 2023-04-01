package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private int jetId;
	private static int jetCounter;

	
	public void fly() {
		double timeFly = range / speed;
		System.out.println("this jet can fly " + timeFly + " hours");
		System.out.println(toString());
		System.out.println();
	}

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;

		jetCounter++;
		jetId = jetCounter;
	}

	@Override
	public String toString() {
		return "Jet ID " + jetId + "\n Model:" + model + "\n Speed:" + speed + "MPH " + "\n Range:" + range + " miles "
				+ "\n Price:" + price;
	}

	// Getters and Setters
	public int getJetId() {
		return jetId;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}