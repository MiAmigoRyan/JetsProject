package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Helicopter;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;
import com.skilldistillery.jets.entities.Squirel;
import com.skilldistillery.jets.entities.UFO;

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
					+ "\n 3. View Fastest Jet" + "\n 4. View Jet With Longest Range"
					+ "\n 5. Load All Cargo Carrier Jets" + "\n 6. Dogfight!" + "\n 7. Add a Jet to the Fleet"
					+ "\n 8. Remove a Jet from the Fleet" + "\n 9. Quit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAll();
				break;
			case 3:
				fastest();
				break;
			case 4:
				longestRange();
				break;
			case 5:
				loadCargoJets();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addJet();
				break;
			case 8:
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
		System.out.println("The fastest jet in the fleet is \n" + fastest);
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
		System.out.println("The jet with the longest range in the fleet is \n" + longestRange);
	}

	public void loadCargoJets() {
		for (Jet jet : af.getFleet()) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
	}

	public void dogfight() {
		for (Jet jet : af.getFleet()) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
	}

	public void addJet() {
		System.out.println("ADD A NEW JET");
		System.out.println();
		System.out.println("Choose a type of jet:");
		System.out.println("\t1. Fighter Jet");
		System.out.println("\t2. Passenger Jet");
		System.out.println("\t3. UFO");
		System.out.println("\t4. Squirrel Suit");
		System.out.println("\t5. Helicopter");
		System.out.println();
		String type = "";
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			type = "Fighter Jet";
			break;
		case 2:
			type = "Passenger Jet";
			break;
		case 3:
			type = "UFO";
			break;
		case 4:
			type = "Squirrel Suit";
			break;
		case 5:
			type = "Helicopter";
			break;
		default:
			System.out.println("Invalid choice!");
			return;
		}
		System.out.println("Enter the Model of the Jet you would like to add");
		String model = sc.next();
		System.out.println("Enter the Speed");
		double speed = sc.nextDouble();
		System.out.println("Enter the Range");
		int range = sc.nextInt();
		System.out.println("Enter the Price");
		long price = sc.nextLong();
		Jet newJet = null;
		switch (choice) {
		case 1:
			newJet = new FighterJet(type, model, speed, range, price);
			break;
		case 2:
			newJet = new JetImpl(type, model, speed, range, price);
			break;
		case 3:
			newJet = new UFO(type, model, speed, range, price);
			break;
		case 4:
			newJet = new Squirel(type, model, speed, range, price);
			break;
		case 5:
			newJet = new Helicopter(type, model, speed, range, price);
			break;
		default:
			System.out.println("Invalid choice!");
			return;
		}
		af.getFleet().add(newJet);

		System.out.println("Your new Jet : " + "\n" + newJet);
		System.out.println();
		System.out.println("Would you like to see an updated fleet?");
		System.out.println("Press 1 for Yes \nPress 2 for No");
		int choice2 = sc.nextInt();
		switch (choice2) {
		case 1:
			System.out.println("Updated Fleet :");
			System.out.println();
			listFleet();
			break;
		case 2:
			System.out.println("Thanks for adding to our fleet!");
			break;
		default:
			System.out.println("Invalid choice!");
			return;
		}
	}

	public void removeJet() {
		listFleet();
		System.out.println("Enter the number of the jet you want to remove:");
		int jetIndex = sc.nextInt();
		if (jetIndex >= 1 && jetIndex <= af.getFleet().size()) {
			Jet removedJet = af.getFleet().remove(jetIndex - 1);
			System.out.println("Jet: " + removedJet.getJetId() + " " + removedJet.getModel()
					+ " has been removed from the fleet.");
			System.out.println("Would you like to see an updated fleet?");
			System.out.println("Press 1 for Yes \nPress 2 for No");
			int choice2 = sc.nextInt();
			switch (choice2) {
			case 1:
				System.out.println("Updated Fleet :");
				System.out.println();
				listFleet();
				break;
			case 2:
				System.out.println("Thanks for adding to our fleet!");
				break;
			default:
				System.out.println("Invalid choice!");
				return;
			}
		} else {
			System.out.println("Invalid jet number. Returning to Main Menu.");
		}
	}

	public void exit() {
		System.out.println("GoodBye!");
	}

}
