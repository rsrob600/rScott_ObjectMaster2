package com.codingdojo.objectmaster;

public class Wizard extends Human {
	
	protected static int currentStrength = strength;
	protected static int currentIntelligence = 8;
	protected static int currentStealth = stealth;
	protected static int currentHealth = 50;
	

	
    // Heal Method
	public void heal(String target){
		String healer = this.getClass().getSimpleName();
		
		// Wizard healing Wizard
		if(target == "Wizard") {
			System.out.println(healer + " healing: " + target);
	        Wizard.currentHealth = Wizard.currentHealth + Wizard.currentIntelligence;
	        //System.out.println("Wizard health level after healing: " + (Wizard.currentHealth));
		}
		// Wizard healing Ninja
		if(target == "Ninja") {
			System.out.println(healer + " healing: " + target);
	        Ninja.currentHealth = Ninja.currentHealth + Wizard.currentIntelligence;
	        //System.out.println("Ninja health level after healing: " + (Ninja.currentHealth));
		}
		// Wizard healing Samurai
		if(target == "Samurai") {
			System.out.println(healer + " healing: " + target);
	        Samurai.currentHealth = Samurai.currentHealth + Wizard.currentIntelligence;
	        //System.out.println("Samurai health level after healing: " + (Samurai.currentHealth));
		}

    }
	
    // Fireball Method
	public void fireball(String target){
		String flamer = this.getClass().getSimpleName();
		
		// Wizard flaming Wizard
		if(target == "Wizard") {
			System.out.println(flamer + " throwing fireball at: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Wizard.currentIntelligence * 3;
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Wizard flaming Ninja
		if(target == "Ninja") {
			System.out.println(flamer + " throwing fireball at: " + target);
	        Ninja.currentHealth = Ninja.currentHealth - Wizard.currentIntelligence * 3;
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}
		// Wizard flaming Samurai
		if(target == "Samurai") {
			System.out.println(flamer + " throwing fireball at: " + target);
	        Samurai.currentHealth = Samurai.currentHealth - Wizard.currentIntelligence * 3;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		}

    }
	
}
