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
	public void addGoldToBackpack(int gold){
		backpack.addGold(gold);
	}
	public void removeGoldFromBackPack(int gold){
		backpack.removeGold(gold);
	}
	public int getGold(){
		return backpack.getGold();
	}
	public void weaponDamage(){
		super.damage+=backpack.weaponDamage();
	}
	public void drinkPotion(int choice){
		int healthReturn =backpack.inventory.usePotion(choice);
		if(super.health+healthReturn>MAX_HEALTH){
			super.health=MAX_HEALTH;
		} else{
		super.health+= healthReturn;
		}
	}
	public void pickUpPotion(int choice){
		backpack.inventory.addPotion(choice);
	}
	public String potionInventory(){
		return backpack.toString();
		
	}


}
