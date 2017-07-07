package Weapons;


public class Dagger extends SwordClass {
	private final static int WEAPON_DAMAGE = 15;
	

	public Dagger() {
		super("Stinger", WEAPON_DAMAGE);
	}

	public String Description() {
		return "This is a Stinger that does decent damage";
	}

}
