package PlayerStuff;

public class CharacterClass {

	// not yet implemented
	private SwordClass weapon;
	private ArmorClass armor;

	private String name;
	protected double damage;
	protected int health;
	protected int defense;
	protected int str;
	

	public CharacterClass(String name, int health, int defense, int str, double damage) {
		this.name = name;
		this.health = health;
		this.defense = defense;
		this.str = str;
		this.damage = damage;

	}

	public int getHealth() {
		return health;
	}

	public int getDefense() {
		return defense;
	}

	public int getStr() {
		return str;
	}

	public double getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public String toString() {
		return "Name: "+ name+" health: "+ health+ " Damage: "+damage;
	}
}
