package com.codingdojo.objectmaster;

public class NinjaTest {
	
	public static void main(String[] args) {
		Ninja n = new Ninja();

		
		System.out.println("Default strength is: " + Ninja.currentStrength);
		System.out.println("Default intelligence is: " + Ninja.currentIntelligence);
		System.out.println("Default stealth is: " + Ninja.currentStealth);
		System.out.println("Default health is: " + Ninja.currentHealth);
		
		System.out.println("-------------------------------------");
		/*
		n.attack("Human");
		n.attack("Human");
		*/
		
		n.attack("Wizard");
		n.attack("Wizard");
		System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		
		
		System.out.println("-------------------------------------");
		n.attack("Ninja");
		n.attack("Ninja");
		System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		
		
		System.out.println("-------------------------------------");
		n.attack("Samurai");
		n.attack("Samurai");
		System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		
		
		System.out.println("-------------------------------------");
		n.steal("Wizard");
		System.out.println("Wizard health level after theft: " + (Wizard.currentHealth));
        System.out.println("Ninja health level after theft: " + (Ninja.currentHealth));
		
		
        System.out.println("-------------------------------------");
		n.steal("Samurai");
		n.steal("Samurai");
		n.steal("Samurai");
		System.out.println("Samurai health level after theft: " + (Samurai.currentHealth));
        System.out.println("Ninja health level after theft: " + (Ninja.currentHealth));
		
        
        System.out.println("-------------------------------------");
		n.runAway();
		System.out.println("Ninja health level after running away: " + (Ninja.currentHealth));
		
	}
	
}
