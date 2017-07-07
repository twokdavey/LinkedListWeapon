package PlayerStuff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Inventory.Consumables;
import Inventory.StrongHealthPotion;
import Inventory.normalHealthPotion;
import Inventory.weakPotion;
import Weapons.Dagger;
import Weapons.SwordClass;

public class PlayerBackpack {
	
	
	private int weak = 0;
	private int normal = 0;
	private int strong = 0; 
	private int gold;
	
	private SwordClass sword;
	private Consumables inventory;
	private Map<Integer,SwordClass> weapons;
	public PlayerBackpack(){
		setInventory(new Consumables());
		weapons = new HashMap<Integer,SwordClass>();
		gold=0;
	}
	public void collectWeapons(){
		weapons.put(1, new Dagger());
		SwordClass test = weapons.get(1);
		test.Description();
		
	}
	

	public int getGold() {
		return gold;
	}

	public void addGold(int addGold) {
		gold += addGold;
	}
	public void removeGold(int removeGold){
		gold-= removeGold;
	}
	public double weaponDamage(){
		sword = new SwordClass("soulstealer",5.0);
		double damageAmplifier = sword.getDamage();
		return damageAmplifier;
	}


	public String toString() {
		return "inventory: \n Weak Potions:" + getInventory().getWeakPotionSize() + "\n Normal Potions: " + getInventory().getNormalPotionSize()
				+ "\n String Potions: " + getInventory().getStrongPotionSize();
	}
	public Consumables getInventory() {
		return inventory;
	}
	public void setInventory(Consumables inventory) {
		this.inventory = inventory;
	}
}
