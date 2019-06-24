package com.codingdojo.objectmaster;

public class Human {

	protected static int strength = 100;
	protected static int intelligence = 3;
	protected static int stealth = 3;
	protected static int health = 3;
	
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
		
		// Human attacking Human
		if(target == "Human" && attacker.equals("Human")) {
			System.out.println(attacker + " attacking: " + target);
	        Human.health = Human.health - Human.strength;
	        System.out.println("Human health level after attack: " + (Human.health));
		}

    }
	
	
}
