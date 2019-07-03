package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	// add a class variable for the number of objects instantiated
	private static int numberOfSamurais = 0;
	
	// Specific constructor to set the wizard class attributes
	public Samurai() {
		this.setHealth(200);
		
		// increment number of Samurai and assign ID number
		this.setID(++numberOfSamurais);
		
	}
	
	// ---------------------How Many Method------------------------>
	// Method to return the total number of Samurai class objects
	public int getHowMany() {
		System.out.println("There are currently " + numberOfSamurais + " Samurais spawned at this time.");
		return numberOfSamurais;
	}
	
	// ---------------------Death Blow Method------------------------>
    // Decrease target's health to 0 and the Samurai health by half
	public void deathBlow(Human target){
		String attacker = this.getClass().getSimpleName();
		String attacked = target.getClass().getSimpleName();
		
		// Decrease target's health to 0
		target.setHealth(0);
		System.out.println(attacked + target.getID() + " has been dealt a death blow and is now expired! Health remaining is: " + target.getHealth());

		// Decrease the Samurai health by half
		this.setHealth(this.getHealth()/2);
		System.out.println(attacker + this.getID() + ", that death blow has cost you, you need to meditate quickly to recover! Health remaining is: " + this.getHealth());
    }
	
	// ---------------------Meditate Method------------------------>
    // Increase the Samurai health by an increment of half of the Samurai current health
	public void meditate() {
		String meditator = this.getClass().getSimpleName();
		
		this.setHealth(this.getHealth() + (this.getHealth()/2));
		System.out.println("Ommmmmm, " + meditator + this.getID() + " your health has been restored and is now at: " + this.getHealth());
	}
	
}
