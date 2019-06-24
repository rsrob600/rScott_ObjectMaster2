package com.codingdojo.objectmaster;

public class Ninja extends Human {
	
	protected static int currentStrength = strength;
	protected static int currentIntelligence = intelligence;
	protected static int currentStealth = 10;
	protected static int currentHealth = health;


	
    // Steal Method
	public void steal(String target){
		String stealer = this.getClass().getSimpleName();
		
		// Ninja stealing Wizard
		if(target == "Wizard") {
			System.out.println(stealer + " stealing health from: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Ninja.currentStealth;
	        Ninja.currentHealth = Ninja.currentHealth + Ninja.currentStealth;
	        //System.out.println("Wizard health level after theft: " + (Wizard.currentHealth));
	        //System.out.println("Ninja health level after theft: " + (Ninja.currentHealth));
		}
		// Ninja stealing Samurai
		if(target == "Samurai") {
			System.out.println(stealer + " stealing health from: " + target);
			Samurai.currentHealth = Samurai.currentHealth - Ninja.currentStealth;
	        Ninja.currentHealth = Ninja.currentHealth + Ninja.currentStealth;
	        //System.out.println("Samurai health level after theft: " + (Samurai.currentHealth));
	        //System.out.println("Ninja health level after theft: " + (Ninja.currentHealth));
		}

    }
	
	
	// Run Away Method
	public void runAway() {
		Ninja.currentHealth = Ninja.currentHealth - 10;
		//System.out.println("Ninja health level after running away: " + (Ninja.currentHealth));
	}
	
}
