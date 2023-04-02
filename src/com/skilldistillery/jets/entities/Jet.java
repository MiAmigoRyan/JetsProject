package com.skilldistillery.jets.entities;

public abstract class Jet {
	protected String model;
	private double speed;
	private int range;
	private long price;
	private int jetId;
	protected String type;
	private static int jetCounter;

	public void fly() {
		double timeFly = Math.round((range / speed) * 100);
		System.out.println("this " + type + " can fly " + timeFly + " hours");
		System.out.println(toString());
		System.out.println();
	}

	public Jet(String type, String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.type = type;
		jetCounter++;
		jetId = jetCounter;
	}

	@Override
	public String toString() {
		return "Jet " + jetId + " : " + type + "\n Model: " + model + "\n Speed: " + speed + " MPH " + "\n Range: "
				+ range + " miles " + "\n Price: " + price + "\n ------------------------------";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}