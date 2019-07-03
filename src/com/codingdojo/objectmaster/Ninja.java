package com.codingdojo.objectmaster;

public class Ninja extends Human {
	
	// add a class variable for the number of objects instantiated
	private static int numberOfNinjas = 0;
	
	// Specific constructor to set the wizard class attributes
	public Ninja() {
		this.setStealth(10);
		
		// increment number of Ninjas and assign ID number
		this.setID(++numberOfNinjas);
		
	}

	// ---------------------How Many Method------------------------>
	// Find out how many Ninjas are currently spawned
	public int getHowMany() {
		System.out.println("There are currently " + numberOfNinjas + " Ninjas spawned at this time.");
		return numberOfNinjas;
	}

	// ---------------------Steal Method------------------------>
    // Decrease targets health by the Ninjas stealth (10) & Increase the Ninjas health by the same amount
	public void steal(Human target) {
		// Decrease the target's health
		target.setHealth(target.getHealth() - this.getStealth());
		// Increase the Ninjas health
		this.setHealth(this.getHealth() + this.getStealth());
		// Increase the Ninjas stealth
		//this.setStealth(this.getHealth()/6);
		
		
		String theif = this.getClass().getSimpleName();
		String victim = target.getClass().getSimpleName();
		System.out.println(theif + this.getID() + " has stolen the health of: " + victim + target.getID() + ", health remaining is: " + target.getHealth());
		target.getHealth();
	}
		
	// ---------------------Run Method------------------------>
	// Decrease the Ninjas health by 10
	public void runAway() {
		this.setHealth(this.getHealth()-10);
		
		String theif = this.getClass().getSimpleName();
		System.out.println(theif + this.getID() + " health has been impacted from running, time to rest! Health remaining is: " + this.getHealth());
	}	
	
}
