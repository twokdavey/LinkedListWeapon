package Weapons;

import Inventory.Items;

public class SwordClass extends Items {
	private String name;
	private double damage;

	public SwordClass( String name, double damage) {
		super(3);
		this.name=name;
		this.damage=damage;
	}

	public String getName() {
		return name;
	}

	public double getDamage() {
		return damage;
	}

	public String toString(){
		return name+": "+ damage;
	}
	public String Description(){
		return"There is no weapon to describe";
	}
}
