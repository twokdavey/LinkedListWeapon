package Merchant;

import Inventory.Consumables;
import PlayerStuff.HeroClass;
import Weapons.SwordClass;
import Weapons.WeaponList;

import java.util.Scanner;

public class Merchant {
	Consumables potions;
	WeaponList weapon;
	SwordClass weaponForSale;
	Scanner scan = new Scanner(System.in);
	private final int WEAK_POTION_PRICE = 1;
	private final int NORMAL_POTION_PRICE = 2;
	private final int STRONG_POTION_PRICE = 3;

	public Merchant(HeroClass hero, int weakPotionCount, int normalPotionCount, int strongPotionCount, int weapontype) {
		potions = new Consumables();
		weapon = new WeaponList();
		createInventory(weakPotionCount, normalPotionCount,strongPotionCount);
		weaponForSale =weapon.getWeapons().get(weapontype);
		
		inventoryMenu(hero);
	}
	/**
	 * @param
	 * all variables can be set to have a specific amount of potions
	 */
	public void createInventory(int weakPotionCount, int normalPotionCount, int strongPotionCount){
		if (weakPotionCount > 0) {
		for (int i = 0; i < weakPotionCount; i++) {
			potions.addPotion(1);
		}
	}
	if (normalPotionCount > 0) {
		for (int i = 0; i < normalPotionCount; i++) {
			potions.addPotion(2);
		}
	}
	if (strongPotionCount > 0) {
		for (int i = 0; i < strongPotionCount; i++) {
			potions.addPotion(3);
		}
	}
	}
	public void inventoryMenu(HeroClass hero) {
		boolean shopping = true;
		while (shopping) {
			System.out.println("Gold: " + hero.getBackpack().getGold());
			System.out.println("Hello traveler, would you like to take a look at my selection?");
			System.out.println("Player options: 1, 2 ,3, No");
			System.out.println("Weak Potion: " + potions.getWeakPotionSize() + "Cost: " + WEAK_POTION_PRICE);
			System.out.println("Normal Potion: " + potions.getNormalPotionSize() + "Cost: " + NORMAL_POTION_PRICE);
			System.out.println("Strong Potion: " + potions.getStrongPotionSize() + "Cost: " + STRONG_POTION_PRICE);
			System.out.println(weaponForSale.getName()+": Description:" + weaponForSale.Description()+". Damage: "+weaponForSale.getDamage());
			String choice = scan.nextLine();
			shopping =buyPhase(choice, hero);

		}

	}

	private boolean buyPhase(String choice, HeroClass hero) {
		if (choice.equalsIgnoreCase("no")) {
			System.out.println("You be safe out there!");
			return false;

		}
		int newChoice = Integer.parseInt(choice);

		if (newChoice == WEAK_POTION_PRICE) {
			if (hero.getBackpack().getGold() >= WEAK_POTION_PRICE) {
				hero.getBackpack().getInventory().addPotion(WEAK_POTION_PRICE);
				hero.getBackpack().removeGold(WEAK_POTION_PRICE);

			} else {
				System.out.println("Sorry, you seem to be low on gold to afford this...");
			}
		} else if (newChoice == NORMAL_POTION_PRICE) {
			if (hero.getBackpack().getGold() >= NORMAL_POTION_PRICE) {
				hero.getBackpack().getInventory().addPotion(NORMAL_POTION_PRICE);
				hero.getBackpack().removeGold(NORMAL_POTION_PRICE);
			} else {
				System.out.println("Sorry, you seem to be low on gold to afford this...");
			}
		} else if (newChoice == STRONG_POTION_PRICE) {
			if (hero.getBackpack().getGold() >= STRONG_POTION_PRICE) {
				hero.getBackpack().getInventory().addPotion(STRONG_POTION_PRICE);
				hero.getBackpack().removeGold(STRONG_POTION_PRICE);
			} else {
				System.out.println("Sorry, you seem to be low on gold to afford this...");
			}
		}
		return true;

	}

}