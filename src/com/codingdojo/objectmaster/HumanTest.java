package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		
		
		System.out.println("Default strength is: " + h.strength());
		System.out.println("Default intelligence is: " + h.intelligence());
		System.out.println("Default stealth is: " + h.stealth());
		System.out.println("Default health is: " + h.health());
		
		h.attack("Human");
		h.attack("Human");

	}

}
