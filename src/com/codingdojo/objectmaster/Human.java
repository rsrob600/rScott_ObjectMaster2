package com.codingdojo.objectmaster;

public class Human {

	protected static int strength = 3;
	protected static int intelligence = 3;
	protected static int stealth = 3;
	protected static int health = 100;
	
	
	
	// Strength Attributes
    public int strength() {
    	return strength;
    }
    
    public int displayStrength(int cstrength) {
    	strength = cstrength;
    	//System.out.println(strength);
    	return strength;
    }
	
    // Intelligence Attributes
    public int intelligence() {
    	return intelligence;
    }
    
    public int displayIntelligence(int cintelligence) {
    	intelligence = cintelligence;
    	//System.out.println(intelligence);
    	return intelligence;
    }
    
    // Stealth Attributes
    public int stealth() {
    	return stealth;
    }
    
    public int displayStealth(int cstealth) {
    	stealth = cstealth;
    	//System.out.println(stealth);
    	return stealth;
    }
    
    // Health Attributes
    public int health() {
    	return health;
    }
    
    public int displayHealth(int chealth) {
    	health = chealth;
    	//System.out.println(health);
    	return health;
    }
    
    // Attack Method
	public void attack(String target){
		String attacker = this.getClass().getSimpleName();
		
		/* -----------------------Human----------------------- */
		
		/*
		// Human attacking Human
		if(target == "Human" && attacker.equals("Human")) {
			System.out.println(attacker + " attacking: " + target);
	        Human.health = Human.health - Human.strength;
	        System.out.println("Human health level after attack: " + (Human.health));
		}
		
		// Human attacking Wizard
		if(target == "Wizard" && attacker.equals("Human")) {
			System.out.println(attacker + " attacking: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Human.strength;
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Human attacking Ninja
		if(target == "Ninja" && attacker.equals("Human")) {
			System.out.println(attacker + " attacking: " + target);
	        Ninja.currentHealth = Ninja.currentHealth - Human.strength;
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}
		// Human attacking Samurai
		if(target == "Samurai" && attacker.equals("Human")) {
			System.out.println(attacker + " attacking: " + target);
	        Samurai.currentHealth = Samurai.currentHealth - Human.strength;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		}
		*/
		
		/* -----------------------Wizard----------------------- */
		// Wizard attacking Wizard
		if(target == "Wizard" && attacker.equals("Wizard")) {
			System.out.println(attacker + " attacking: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Wizard.currentStrength;
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Wizard attacking Ninja
		if(target == "Ninja" && attacker.equals("Wizard")) {
			System.out.println(attacker + " attacking: " + target);
	        Ninja.currentHealth = Ninja.currentHealth - Wizard.currentStrength;
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}
		// Wizard attacking Samurai
		if(target == "Samurai" && attacker.equals("Wizard")) {
			System.out.println(attacker + " attacking: " + target);
	        Samurai.currentHealth = Samurai.currentHealth - Wizard.currentStrength;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		}
		/* -----------------------Ninja----------------------- */
		// Ninja attacking Wizard
		if(target == "Wizard" && attacker.equals("Ninja")) {
			System.out.println(attacker + " attacking: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Ninja.currentStrength;
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Ninja attacking Ninja
		if(target == "Ninja" && attacker.equals("Ninja")) {
			System.out.println(attacker + " attacking: " + target);
	        Ninja.currentHealth = Ninja.currentHealth - Ninja.currentStrength;
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}
		// Ninja attacking Samurai
		if(target == "Samurai" && attacker.equals("Ninja")) {
			System.out.println(attacker + " attacking: " + target);
	        Samurai.currentHealth = Samurai.currentHealth - Ninja.currentStrength;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		}
		/* -----------------------Samurai----------------------- */
		// Samurai attacking Wizard
		if(target == "Wizard" && attacker.equals("Samurai")) {
			System.out.println(attacker + " attacking: " + target);
	        Wizard.currentHealth = Wizard.currentHealth - Samurai.currentStrength;
	        //System.out.println("Wizard health level after attack: " + (Wizard.currentHealth));
		}
		// Samurai attacking Ninja
		if(target == "Ninja" && attacker.equals("Samurai")) {
			System.out.println(attacker + " attacking: " + target);
	        Ninja.currentHealth = Ninja.currentHealth - Samurai.currentStrength;
	        //System.out.println("Ninja health level after attack: " + (Ninja.currentHealth));
		}
		// Samurai attacking Samurai
		if(target == "Samurai" && attacker.equals("Samurai")) {
			System.out.println(attacker + " attacking: " + target);
	        Samurai.currentHealth = Samurai.currentHealth - Samurai.currentStrength;
	        //System.out.println("Samurai health level after attack: " + (Samurai.currentHealth));
		}
		

    }
	
	
}
