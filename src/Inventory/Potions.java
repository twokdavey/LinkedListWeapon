package Inventory;

import java.util.ArrayList;

public class Potions extends Items {
	

	private int healthReturn;
	private String name;

	/**
	 * @param healthReturn
	 *How much health is healed for
	 * @param name
	 *Name of the potion
	 * @param weight
	 *weight for backpack
	 */
	public Potions(int healthReturn, String name,int weight) {
		super(weight);
		this.healthReturn = healthReturn;
		this.name = name;

	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthReturn() {
		return healthReturn;
	}

	public void setHealthReturn(int healthReturn) {
		this.healthReturn = healthReturn;
	}

	
}
