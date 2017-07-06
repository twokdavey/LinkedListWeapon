package PlayerStuff;

import java.util.Iterator;
import java.util.LinkedList;

public class Dagger extends SwordClass {
	private int test = 15;
	LinkedList<Dagger> list = new LinkedList<Dagger>();

	Dagger() {
		super("Stinger", 15);
	}

	public String Description() {
		return "This is a Stinger that does decent damage";
	}

	public int getTest() {
		return test;
	}

}
