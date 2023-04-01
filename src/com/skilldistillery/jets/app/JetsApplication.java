package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	
	private AirField af = new AirField();
		
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}

	public void launch() {
		menu();
	}

	public void menu() {
		boolean running = true;
		while (running) {
			System.out.println("CHOOSE AN OPTION AND PRESS \" ENTER \"" + "\n 1. List Fleet " + "\n 2. Fly All Jets"
					+ "\n 3. View Fastest Jet" + "\n 4. View Jet With Longest Range" + "\n 5. Load All Cargo Jets"
					+ "\n 6. Dogfight!" + "\n 7. Add a Jet to the Fleet" + "\n 8. Remove a Jet from the Fleet"
					+ "\n 9. Quit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				// list fleet
				listFleet();
				break;
			case 2:
				// Fly all jets
				flyAll();
				break;
			case 3:
				// View Fastest jet
				fastest();
				break;
			case 4:
				// View jet with longest range
				longestRange();
				break;
			case 5:
				// Load all Cargo Jets
				loadCargoJets();
				break;
			case 6:
				// Dogfight!
				dogfight();
				break;
			case 7:
				// add a jet to the fleet
				addJet();
				break;
			case 8:
				// remove a jet from the fleet
				removeJet();
				break;
			case 9:
				exit();
				running = false;
				break;
			default:
				System.out.println("invalid entry.");
			}
		}

	}

	public void listFleet() {
		for (Jet jet : af.getFleet()) {
			System.out.println(jet);
		}
	}

	public void flyAll() {
		for (Jet jet : af.getFleet()) {
			jet.fly();
			
		}
	}

	public void fastest() {
		Jet fastest = null;
		double nextSpeed = 0;
		for (int i = 0; i < af.getFleet().size(); i++) {

			if (af.getFleet().get(i).getSpeed() > nextSpeed) {

				nextSpeed = af.getFleet().get(i).getSpeed();
				fastest = af.getFleet().get(i);

			}
		}
		System.out.println("The fastest jet in the fleet is " + fastest);
	}

	public void longestRange() {
		Jet longestRange = null;
		int nextRange = 0;
		for (int i = 0; i < af.getFleet().size(); i++) {
			if (af.getFleet().get(i).getRange() > nextRange) {
				nextRange = af.getFleet().get(i).getRange();
				longestRange = af.getFleet().get(i);
			}
		}
		System.out.println("The jet with the longest range in the fleet is " + longestRange);
	}

	public void loadCargoJets() {
		// present option specific to CargoCarrier Interface
		// find all implementations of cargoCarrier
		// call loadCargo() on each
	}

	public void dogfight() {
		// same as above loadCargoJets method but interface CombatReady
	}

	public void addJet() {
		// print current list : listFleet();
		// can be a JetImpl (passenger)
		// STRETCH GOAL : Sub Menu initate to choose type of jet (Cargo, Combat, Impl)
		// this process will be similar to foodtruck app
		// ask user to enter model, speed, range, and price
		// add new jet to jets.txt and list<Jet>
		// fleet.add
		System.out.println("ADD A NEW JET");
		System.out.println();

		System.out.println("Enter a type of jet");
		String type = sc.next();
		
		System.out.println("Enter the Model of the Jet you would like to add");
		String model = sc.next();

		System.out.println("Enter the Speed");
		double speed = sc.nextDouble();

		System.out.println("Enter the Range");
		int range = sc.nextInt();
	
		System.out.println("Enter the Price");
		long price = sc.nextLong();
		
		Jet newJet = new Jet(type, model, speed, range, price);
		
		
		// Jet newJet = new Jet (model, speed, range, price);
	}

	public void removeJet() {
		// print current list as a submenu;
		// prompt user to choose a jet to delte by number
	}

	public void exit() {
		System.out.println("GoodBye!");
	}

}
