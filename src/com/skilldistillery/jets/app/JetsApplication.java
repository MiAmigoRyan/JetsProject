package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

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
		// instance of
		for (Jet jet : af.getFleet()) {
			if (jet instanceof CargoPlane) {
				((CargoCarrier) jet).loadCargo();
			}
		}

	}

	public void dogfight() {
		for (Jet jet : af.getFleet()) {
			if (jet instanceof FighterJet) {
				((CombatReady) jet).fight();
			}
		}
	}

	public void addJet() {
		// print current list : listFleet();
		// can be a JetImpl (passenger)
		// STRETCH GOAL : Sub Menu initate to choose type of jet (Cargo, Combat, Impl)

		System.out.println("ADD A NEW JET");
		System.out.println();

		System.out.println("Enter a type of jet");
		String type = sc.next();
//			switch
//			case

		System.out.println("Enter the Model of the Jet you would like to add");
		String model = sc.next();

		System.out.println("Enter the Speed");
		double speed = sc.nextDouble();

		System.out.println("Enter the Range");
		int range = sc.nextInt();

		System.out.println("Enter the Price");
		long price = sc.nextLong();

		Jet newJet = new JetImpl(model, speed, range, price);

		af.getFleet().add(newJet);

	}

	public void removeJet() {
		// print current list as a submenu;
		// prompt user to choose a jet to delete by number
		listFleet();

		System.out.println("Enter the number of the jet you want to remove:");

		int jetIndex = sc.nextInt();

		// Remove the jet from the fleet if it exists
		if (jetIndex >= 1 && jetIndex <= af.getFleet().size()) {

			Jet removedJet = af.getFleet().remove(jetIndex - 1);
			System.out.println("Jet: " + removedJet.getJetId() + " " + removedJet.getModel()
					+ " has been removed from the fleet.");
//bonus: print updated list of fleet
//	        System.out.println("Would you like to see an updated list of the fleet? Enter Y or N ");	
//	        String anwsr = sc.next();
//	        	continue code

		} else {

			System.out.println("Invalid jet number. Returning to Main Menu.");
		}
	}

	public void exit() {
		System.out.println("GoodBye!");
	}

}
