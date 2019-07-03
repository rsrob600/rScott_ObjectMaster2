package com.codingdojo.objectmaster;

public class Wizard extends Human {
	
	// add a class variable for the number of objects instantiated
	private static int numberOfWizards = 0;
	
	// Specific constructor to set the wizard class attributes
	public Wizard() {
		this.setIntelligence(8);
		this.setHealth(50);
		
		// increment number of Wizards and assign ID number
		this.setID(++numberOfWizards);
		
	}
	
	// ---------------------How Many Method------------------------>
	// Find out how many Wizards are currently spawned
	public int getHowMany() {
		System.out.println("There are currently " + numberOfWizards + " Wizards spawned at this time.");
		return numberOfWizards;
	}

	// ---------------------Heal Method------------------------>
	
    // Increase target's health by Wizards intelligence(8)
	public void heal(Human target) {
		target.setHealth(target.getHealth() + this.getIntelligence());
		
		String healer = this.getClass().getSimpleName();
		String healed = target.getClass().getSimpleName();
		System.out.println(healer + this.getID() + " has healed " + healed + target.getID() + ", health is now: " + target.getHealth());
		}

	// ---------------------Fireball Method------------------------>

    // Decrease target's health by Wizards intelligence * 3 (24)
	public void fireball(Human target) {
		target.setHealth(target.getHealth() - (this.getIntelligence()*3));
		
		String flamer = this.getClass().getSimpleName();
		String flamed = target.getClass().getSimpleName();
		System.out.println(flamer + this.getID() + " has thrown a fireball at " + flamed + target.getID() + ", health is now: " + target.getHealth());
		}
	
}
