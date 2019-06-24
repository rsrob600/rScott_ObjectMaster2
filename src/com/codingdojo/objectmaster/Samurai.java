package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	protected static int currentStrength = strength;
	protected static int currentIntelligence = intelligence;
	protected static int currentStealth = stealth;
	protected static int currentHealth = 200;
	

	
    // Death Blow Method
	public void deathBlow(String target){
		String attacker = this.getClass().getSimpleName();
		
		// Samurai attacking Wizard
		if(target == "Wizard") {
			System.out.println(attacker + " death blow to: " + target);
	        Wizard.currentHealth = 0;
	        Samurai.currentHealth = Samurai.currentHealth / 2;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Samurai attacking Ninja
		if(target == "Ninja") {
			System.out.println(attacker + " death blow to: " + target);
			Ninja.currentHealth = 0;
			Samurai.currentHealth = Samurai.currentHealth / 2;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}

    }
	
	
	// Meditate Method
	public void meditate() {
		System.out.println("Ommmmmm");
		int meditationChi = Samurai.currentHealth / 2;
		Samurai.currentHealth = Samurai.currentHealth + meditationChi;
		//System.out.println("Samurai health level after meditation: " + (Samurai.currentHealth));
	}
	
	
	// How Many Method (not quite sure how to implement this method)
	public void howMany() {
		System.out.println();
	}
	
}
