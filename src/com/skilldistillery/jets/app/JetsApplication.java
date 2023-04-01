package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	
	private Scanner sc = new Scanner(System.in);
	
	//is this correct? should Jet be an array list?
	private Jet[] fleet = new Jet[10];
	
	
	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}
	
	public void launch() {
		AirField af = new AirField();
		af.readFromFile();
		
		
	
	}
	
	public void exit() {
		System.out.println("GoodBye!");
	}
	
	public void menu() {
		boolean running = true;
		while(running) {
			System.out.println(""
					+ "\n 1. List Fleet "
					+ "\n 2. Fly All Jets"
					+ "\n 3. View Fastest Jet"
					+ "\n 4. View Jet With Longest Range"
					+ "\n 5. Load All Cargo Jets"
					+ "\n 6. Dogfight!"
					+ "\n 7. Add a Jet to the Fleet"
					+ "\n 8. Remove a Jet from the Fleet"
					+ "\n 9. Quit"
					);
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				//list fleet
				listFleet();
				break;
			case 2:
				//Fly all jets
				flyAll();
				break;
			case 3:
				//View Fastest jet
				fastest();
				break;
			case 4:
				//View jet with longest range
				longestRange();
				break;
			case 5: 
				//Load all Cargo Jets
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
		
	}
	public void flyAll() {
		
	}
	public void fastest() {
		
	}
	public void longestRange() {
		
	}
	public void loadCargoJets() {
		
	}
	public void dogfight() {
		
	}
	public void addJet() {
		System.out.println("What type of jet would you like to add : ");
		// print current list : listFleet();
		//
		//fleet.add
		
	}
	public void removeJet() {
	
	}
	

}
