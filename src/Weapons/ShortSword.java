package Weapons;


public class ShortSword extends SwordClass {
	private final static int WEAPON_DAMAGE = 20;
	

	public ShortSword() {
		super("Short Sword", WEAPON_DAMAGE);
	}

	public String Description() {
		return "This is a short sword that does decent damage";
	}

}
