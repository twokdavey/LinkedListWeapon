package MonsterStuff;

import PlayerStuff.CharacterClass;

public class Creatures extends CharacterClass {
	protected int goldDrop;
	protected int creatureSpeed;

	public Creatures(String name, int health, int defense, int str, double damage, int goldDrop, int creatureSpeed) {
		super(name, health, defense, str, damage);
		this.goldDrop = goldDrop;
		this.creatureSpeed = creatureSpeed;
		
	}

	public int getGold() {
		return goldDrop;
	}
	public int getCreatureSpeed(){
		return creatureSpeed;
	}

}
