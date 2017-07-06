package Inventory;

public class normalHealthPotion extends Potions {

	public normalHealthPotion() {
		super(30,"Normal Health pot", 1);
		
	}

	public String toString(){
		return "This potion restores 30 health to the user";
	}
}
