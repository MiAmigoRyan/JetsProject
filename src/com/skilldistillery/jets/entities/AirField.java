package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet;
	
	public AirField() { 
		readFromFile();
	}
	
	public List<Jet> readFromFile() {
		
		
		fleet = new ArrayList<>();
		
		Jet newJet = null;
		
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String aJet;
			while ((aJet = bufIn.readLine()) != null) {

				String[] jetDetails = aJet.split(",");
				String type = jetDetails[0];  
				String model = jetDetails[1];
				double speed = Double.parseDouble(jetDetails[2]);
				int range = Integer.parseInt(jetDetails[3]);
				long price = Long.parseLong(jetDetails[4]);

				if (type.equals("Passenger")) {
					newJet = new JetImpl(type, model, speed, range, price);
				}
				if (type.equals("Fighter")) {
					newJet = new FighterJet(type, model, speed, range, price);
				}
				if (type.equals("UFO")) {
					newJet = new UFO(type, model, speed, range, price);
				}
				if (type.equals("Squirel Suit")) {
					newJet = new Squirel(type, model, speed, range, price);
				}
				if (type.equals("Helicopter")) {
					newJet = new Helicopter(type, model, speed, range, price);
				}
				fleet.add(newJet);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fleet;
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	}
	

}
