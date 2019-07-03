package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
		// Instantiation of Squad A
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		Ninja ninja1 = new Ninja();
		Ninja ninja2 = new Ninja();
		
		
		// Instantiation of Squad B
		Ninja ninja3 = new Ninja();
		Wizard wizard3 = new Wizard();
		Samurai samurai1 = new Samurai();
		
		
		// Attack Activity
		System.out.println("---------------Attack Activity----------------------");
		wizard1.attack(ninja3);
		wizard3.attack(ninja1);
		ninja3.steal(wizard1);
		ninja3.steal(wizard1);
		ninja3.runAway();
		wizard2.heal(wizard1);
		wizard2.heal(ninja1);
		
		
		ninja3.attack(wizard2);
		wizard2.fireball(ninja3);
		ninja1.steal(ninja3);
		samurai1.deathBlow(ninja2);
		wizard1.fireball(samurai1);
		samurai1.meditate();
		samurai1.meditate();
		samurai1.deathBlow(wizard1);

		
		// Health Status Update
		System.out.println("----------------Squad A: Health Status Update---------------------");
		System.out.println("Wizard1 health is: " + wizard1.getHealth());
		System.out.println("Wizard2 health is: " + wizard2.getHealth());
		System.out.println("Ninja1 health is: " + ninja1.getHealth());
		System.out.println("Ninja2 health is: " + ninja2.getHealth());
		
		System.out.println("----------------Squad B: Health Status Update---------------------");
		System.out.println("Wizard3 health is: " + wizard3.getHealth());
		System.out.println("Ninja3 health is: " + ninja3.getHealth());
		System.out.println("Samurai1 health is: " + samurai1.getHealth());
		
		
		// Number of Players Left
		System.out.println("----------------Number Player Update---------------------");
		wizard1.getHowMany();
		ninja1.getHowMany();
		samurai1.getHowMany();
		
		

		
		
	}

}
