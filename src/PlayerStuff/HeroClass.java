package PlayerStuff;

import java.util.Scanner;

public class HeroClass extends CharacterClass {
	Scanner scan= new Scanner(System.in);
	protected PlayerBackpack backpack;
	protected final int MAX_HEALTH=100;

	public HeroClass(String name, int health, int defense, int str, double damage) {
		super(name, health, defense, str, damage);
		backpack = new PlayerBackpack();
		
	}

	public void drinkPotion(int choice){
		int healthReturn =backpack.getInventory().usePotion(choice);
		if(super.health+healthReturn>MAX_HEALTH){
			super.health=MAX_HEALTH;
		} else{
		super.health+= healthReturn;
		}
	}


	public PlayerBackpack getBackpack(){
		return backpack;
	}
}
