package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	private Scanner sc = new Scanner(System.in);

	// is this correct? should Jet be an array list?
	private Jet[] fleet = new Jet[10];

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}

	public void launch() {
//		AirField af = new AirField();
//
//		af.readFromFile();

		menu();
	}

	public void menu() {
		boolean running = true;
		while (running) {
			System.out.println("CHOOSE AN OPTION AND PRESS \" ENTER \"" + "\n 1. List Fleet " + "\n 2. Fly All Jets" + "\n 3. View Fastest Jet"
					+ "\n 4. View Jet With Longest Range" + "\n 5. Load All Cargo Jets" + "\n 6. Dogfight!"
					+ "\n 7. Add a Jet to the Fleet" + "\n 8. Remove a Jet from the Fleet" + "\n 9. Quit" 
					);
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
		// sysout id, model, speed, range, and price
		AirField af = new AirField();
		af.readFromFile();
	}

	public void flyAll() {
		// will call fly() an print the details of each jet
		// prints ammount of time a jet can fly
		// equation based on speed and range
	}
	
	
	//NEEDS TO BE TESTED***********************************
	public void fastest() {
		// search the list<Jets> to find fastest
		Jet fastest = null;
		double nextSpeed = 0;
		for(int jet = 0; jet < fleet.length; jet++) {
			if(fleet[jet] !=null) {
				if(fleet[jet].getSpeed()>nextSpeed) {
					nextSpeed = fleet[jet].getSpeed();
					fastest = fleet[jet];
				}
			}
		}
	}

	//NEEDS TO BE TESTED***********************************
	public void longestRange() {
		// search list<Jets> to find longest range
		Jet longestRange = null;
		int nextRange =0;
		for (int jet=0; jet<fleet.length; jet++) {
			if(fleet[jet] !=null) {
				if(fleet[jet].getRange()>nextRange) {
					nextRange = fleet[jet].getRange();
					longestRange = fleet[jet];
					}
			}
		}
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
	}

	public void removeJet() {
		// print current list as a submenu;
		// prompt user to choose a jet to delte by number
	}

	public void exit() {
		System.out.println("GoodBye!");
	}

}
