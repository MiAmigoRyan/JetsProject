package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//only this class will talk to jets 
	public class AirField {
	
		public AirField() {
			
		}
		
		private List<Jet> fleet;
	
		public List<Jet> readFromFile(String fn) {
			List<Jet> jets = new ArrayList<>();
			//read in the various jet types from the file jet.txt
			//add that specific jet to your jets list
			try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
				  String aJet;
				  while ((aJet = bufIn.readLine()) != null) {				    
					  //as you read a jet create a jet
					  String[] jetDetails = aJet.split(",");
					  //create the appropriateJet based on all Jet details
					 // if (jetDetals[0]) {
						  //create jet class instance
					 // }
					//  if(jetDetails[1]) {
						  //add other jet instance
					 // }
					 // if (//keep going with above){ }
							  
					//add the specific jet type to jets list 		  
				  }
				}
				catch (IOException e) {
				  System.err.println(e);
				}
			
			
			return jets;
		}
	}
