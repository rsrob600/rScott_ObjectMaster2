package com.codingdojo.objectmaster;

public class Human {

	
	// default member instance variables or attributes of the human superclass
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
    // ----------------------ID Tracking Attributes----------------------->
	
	// add an instance variable for the object ID
	private int id;
	
	// ID Getter Method
	public int getID() {
		return id;
	}
	
	// ID Setter Method
	public void setID(int id) {
		this.id = id;
	}
		
    // ----------------------ID Tracking Attributes----------------------->
	
	// Default Constructor
	public Human() {
	}
		
    // ----------------------Attack Method----------------------->
    
    // Method which takes in the "attacking object instance" and the "target object instance" and decrements the target health by the attacking object instance strength
	public Human attack(Human target) {
		target.health -= this.strength;
		
		String attacker = this.getClass().getSimpleName();
		String attacked = target.getClass().getSimpleName();
		System.out.println(attacker + this.getID() + " has attacked " + attacked + target.getID() +  ", health remaining is: " + target.getHealth());
		return null;
    }
		
	// ---------------------Strength Attributes------------------------>
	
	// Strength Getter Method (used to retrieve the private attributes from the human superclass for the instance object calling it)
    public int getStrength() {
    	return strength;
    }
    
    // Strength Setter Method (used to set the attributes of the instance object)
    public void setStrength(int health) {
    	this.health = health;
    }    
	
    // ---------------------Intelligence Attributes------------------------>
    
    // Intelligence Getter Method
    public int getIntelligence() {
    	return intelligence;
    }
    
    // Intelligence Setter Method
    public void setIntelligence(int intelligence) {
    	this.intelligence = intelligence;
    }
    
    // ---------------------Stealth Attributes------------------------>
    
    // Stealth Getter Method
    public int getStealth() {
    	return stealth;
    }
    
    // Stealth Setter Method
    public void setStealth(int stealth) {
    	this.stealth = stealth;
    }
    
    // ----------------------Health Attributes------------------------>
    
    // Health Getter Method
    public int getHealth() {
    	return health;
    }
    
    // Health Setter Method
    public void setHealth(int health) {
    	this.health = health;
    }
	
	
}
