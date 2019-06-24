package com.codingdojo.objectmaster;

public class WizardTest {

	public static void main(String[] args) {
		Wizard w = new Wizard();

		
		System.out.println("Default strength is: " + Wizard.currentStrength);
		System.out.println("Default intelligence is: " + Wizard.currentIntelligence);
		System.out.println("Default stealth is: " + Wizard.currentStealth);
		System.out.println("Default health is: " + Wizard.currentHealth);
		
		System.out.println("-------------------------------------");
		/*
		w.attack("Human");
		w.attack("Human");
		*/
		
		w.attack("Wizard");
		w.attack("Wizard");
		System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		
		
		System.out.println("-------------------------------------");
		w.attack("Ninja");
		w.attack("Ninja");
		System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		
		
		System.out.println("-------------------------------------");
		w.attack("Samurai");
		w.attack("Samurai");
		System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Wizzard current health is: " + Wizard.currentHealth);
		w.heal("Wizard");
		System.out.println("Wizard health level after healing: " + (Wizard.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Ninja current health is: " + Ninja.currentHealth);
		w.heal("Ninja");
		System.out.println("Ninja health level after healing: " + (Ninja.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Samurai current health is: " + Samurai.currentHealth);
		w.heal("Samurai");
		System.out.println("Samurai health level after healing: " + (Samurai.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Wizard current health is: " + Wizard.currentHealth);
		w.fireball("Wizard");
		System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Ninja current health is: " + Ninja.currentHealth);
		w.fireball("Ninja");
		System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Samurai current health is: " + Samurai.currentHealth);
		w.fireball("Samurai");
		System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		
	}

}
