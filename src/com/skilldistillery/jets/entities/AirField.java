package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet;

	public List<Jet> readFromFile() {
		fleet = new ArrayList<>();
		Jet newJet = null;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String aJet;
			while ((aJet = bufIn.readLine()) != null) {

				String[] jetDetails = aJet.split(",");

				String model = jetDetails[0];
				double speed = Double.parseDouble(jetDetails[1]);
				int range = Integer.parseInt(jetDetails[2]);
				long price = Long.parseLong(jetDetails[3]);

				if (model.equals("Passenger")) {
					newJet = new JetImpl(model, speed, range, price);
				}
				if (model.equals("Fighter")) {
					newJet = new FighterJet(model, speed, range, price);
				}
				if (model.equals("UFO")) {
					newJet = new UFO(model, speed, range, price);
				}
				if (model.equals("Squirel Suit")) {
					newJet = new Squirel(model, speed, range, price);
				}
				if (model.equals("Helicopter")) {
					newJet = new Helicopter(model, speed, range, price);
				}

				fleet.add(newJet);
				System.out.println(fleet);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fleet;
	}

}
