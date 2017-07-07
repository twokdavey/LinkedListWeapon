package Weapons;

import java.util.HashMap;

public class WeaponList {

	HashMap<Integer, SwordClass> weapons;

	public WeaponList() {
		weapons = new HashMap<Integer, SwordClass>();
		populateWeapons();
	}

	public void populateWeapons(){
		weapons.put(1, new Dagger());
		weapons.put(2, new ShortSword());
		
	}

	/**
	 * @return the weapons
	 */
	public HashMap<Integer, SwordClass> getWeapons() {
		return weapons;
	}
	
}
