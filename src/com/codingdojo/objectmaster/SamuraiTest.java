package com.codingdojo.objectmaster;

public class SamuraiTest {

	public static void main(String[] args) {
		Samurai s = new Samurai();

		
		System.out.println("Default strength is: " + Samurai.currentStrength);
		System.out.println("Default intelligence is: " + Samurai.currentIntelligence);
		System.out.println("Default stealth is: " + Samurai.currentStealth);
		System.out.println("Default health is: " + Samurai.currentHealth);
		
		System.out.println("-------------------------------------");
		/*
		s.attack("Human");
		s.attack("Human");
		*/
		
		s.attack("Wizard");
		s.attack("Wizard");
		System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		
		
		System.out.println("-------------------------------------");
		s.attack("Ninja");
		s.attack("Ninja");
		System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		
		
		System.out.println("-------------------------------------");
		s.attack("Samurai");
		System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		
		
		System.out.println("-------------------------------------");
		s.deathBlow("Wizard");
        System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
        System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		
        
        System.out.println("-------------------------------------");
		s.meditate();
		s.meditate();
		s.meditate();
		System.out.println("Samurai health level after meditation: " + (Samurai.currentHealth));
		
	}

}
