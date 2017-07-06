package Inventory;

import java.util.ArrayList;
import java.util.Iterator;


public class Consumables {
	private ArrayList<weakPotion> weakPotions;
	private ArrayList<normalHealthPotion> normalPotions;
	private ArrayList<StrongHealthPotion> strongPotions;
	private Potions potion;
	
	/**
	 * @initialies ArrayList for potions
	 */
	public Consumables(){
		weakPotions = new ArrayList<weakPotion>();
		normalPotions = new ArrayList<normalHealthPotion>();
		strongPotions = new ArrayList<StrongHealthPotion>();
		
	}

	/**
	 * @param option
	 *1=weak potion, 2=normal potion, 3=strong potion
	 * @return
	 *returns the amount gained depending on potion
	 */
	public int usePotion(int option) {

		if (option == 1) {
			if (!weakPotions.isEmpty()) {
				int healthGain = weakPotions.get(0).getHealthReturn();
				weakPotions.remove(0);
				return healthGain;
			}else{
				System.out.println("You dont have a weak potion to use");
			}
		} else if (option == 2) {
			if (!normalPotions.isEmpty()) {
				int healthGain = normalPotions.get(0).getHealthReturn();
				normalPotions.remove(0);
				return healthGain;
			}else{
				System.out.println("You dont have a normal potion to use");
			}
		} else {
			if (!strongPotions.isEmpty()) {
				int healthGain = strongPotions.get(0).getHealthReturn();
				strongPotions.remove(0);
				return healthGain;
			}else{
				System.out.println("You dont have a strong potion to use");
			}

		}
		return 0;
	}

	/**
	 * @param option
	 *1=weak potion, 2=normal potion, 3=strong potion
	 */
	public void addPotion(int option) {
		if (option == 1) {
			// weakPotion weakPotionNew+uniqueID = new weakPotion(choice);
			weakPotions.add(new weakPotion());
			
		} else if (option == 2) {
			// normalHealthPotion normalPotionNew = new
			// normalHealthPotion(choice);
			normalPotions.add(new normalHealthPotion());
			
		} else if (option == 3) {
			// StrongHealthPotion strongPotionNew = new
			// StrongHealthPotion(choice);
			strongPotions.add(new StrongHealthPotion());
			
		}
	}
	
	public int getWeakPotionSize(){
		return weakPotions.size();
	}
	public int getNormalPotionSize(){
		return normalPotions.size();
	}
	public int getStrongPotionSize(){
		return strongPotions.size();
	}

	public String toString() {
		return "inventory: \n Weak Potions:" + weakPotions.size() + "\n Normal Potions: " + normalPotions.size()
				+ "\n String Potions: " + strongPotions.size();
	}

}
