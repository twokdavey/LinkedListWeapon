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
import Weapons.WeaponList;

public class PlayerBackpack {

	private int weak = 0;
	private int normal = 0;
	private int strong = 0;
	private int gold;

	private WeaponList weaponList;
	private Consumables inventory;

	public PlayerBackpack() {
		inventory = new Consumables();
		weaponList = new WeaponList();

		gold = 0;
	}

	public int getGold() {
		return gold;
	}

	public void addGold(int addGold) {
		gold += addGold;
	}

	public void removeGold(int removeGold) {
		gold -= removeGold;
	}

	public double weaponDamage(int key) {
		double sword = getWeaponList().getWeapons().get(key).getDamage();

		return sword;
	}

	public String toString() {
		return "inventory: \n Weak Potions:" + getInventory().getWeakPotionSize() + "\n Normal Potions: "
				+ getInventory().getNormalPotionSize() + "\n String Potions: " + getInventory().getStrongPotionSize();
	}

	public Consumables getInventory() {
		return inventory;
	}

	public WeaponList getWeaponList() {
		return weaponList;
	}
}
