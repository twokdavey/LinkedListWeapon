package MonsterStuff;

import java.util.Random;

public class EnemySoldierWeak extends Creatures {

	public EnemySoldierWeak() {

		super("Enemy Soldier", 50, 0, 2, 3, (int) (Math.random() * 15 + 1),1500);

	}

}
