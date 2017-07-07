package Battle;

import PlayerStuff.CharacterClass;
import PlayerStuff.HeroClass;

import java.util.Scanner;

import MonsterStuff.Creatures;

public class BattleZone {
	Scanner scan = new Scanner(System.in);

	
	/**
	 * @param hero
	 *hero is put into battle phase immediately
	 * @param enemy
	 *enemy is put into battle phase immediately
	 */
	public BattleZone(HeroClass hero, Creatures enemy) {
		battle(hero, enemy);

	}

	public BattleZone() {

	}

	/**
	 * @param hero
	 *used for information about the hero in between attacks
	 * @param enemy
	 *used for information about the creature in between attacks
	 * @enemyCounter 
	 *used for keeping track on how long between attacks are done, longer time means bonus damage to hero
	 * @attackMechanic
	 *attacks are successful if hero has correct math answer, complex problems based on creature str
	 */
	public void battle(HeroClass hero, Creatures enemy) {

		while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
			System.out.println("============================================");
			System.out.println(hero.toString());
			System.out.println();
			System.out.println(enemy.toString());
			System.out.println();
			System.out.println();
			System.out.println("Choose your action! (use numbers for decision)");
			System.out.println("1.Attack");
			System.out.println("2.Defend");
			System.out.println("3.Flee");
			System.out.println("4.Use Item");
			
			int choice = scan.nextInt();
			long enemyCounter = System.currentTimeMillis();

			/*
			 * choice=1 is Attack
			 * choice=2 is Defend
			 * choice=3 is Flee
			 */
			if (choice == 1) {
				int randomNum1 = (int) (Math.random() * 10 + 1);
				int randomNum2 = (int) (Math.random() * (10 * enemy.getStr()) + 1);
				int correctAnswer = randomNum1 + randomNum2;
				System.out.print("What is: " + randomNum1 + " + " + randomNum2 + "=");
				int fightChoice = scan.nextInt();
				if (fightChoice == correctAnswer) {
					System.out.println();
					System.out.println();
					System.out.println("Successful hit!!!");
					attack(hero, enemy);
					attack(enemy, hero);
					delay(500);
				} else {
					System.out.println();
					System.out.println();
					System.out.println("Target missed!!!");
					attack(enemy, hero);
					delay(500);
				}
			} else if (choice == 2) {
				int tempArmor = hero.getDefense() + (1 + hero.getDefense() / 2);
				int tempOriginalArmor = hero.getDefense();
				hero.setDefense(tempArmor);
				attack(enemy, hero);
				hero.setDefense(tempOriginalArmor);
			} else if (choice == 3) {
				int random = (int) (Math.random() * 100 + 1);
				if (random >= 75) {
					System.out.println(random);
					System.out.println("You have sucessfully fled!");
					return;
				}
				System.out.println("You were unsucessful in fleeing");
				attack(enemy, hero);
			} else if(choice ==4){
				useItem(hero);
			}
			long endEnemyCounter = System.currentTimeMillis();
			int damageDelay = (int) (endEnemyCounter - enemyCounter) / enemy.getCreatureSpeed();

			hero.setHealth(hero.getHealth() - damageDelay);
			if (damageDelay > 0) {
				System.out.println("While you were planning your next hit, " + enemy.getName()
						+ " hit you for an extra " + damageDelay);
				delay(1500);
			}
			System.out.println("============================================");
			System.out.println();
		}
		
		//checks if hero or enemy has died
		if (hero.getHealth() > 0) {

			System.out.println("You Win!");
			receiveReward(hero, enemy);
		} else if (hero.getHealth() <= 0) {
			System.out.println("YOU HAVE DIED!");
			System.exit(0);
		}

	}

	/**
	 * @param PersonAttacking
	 *.getDamage() is used to determine hp of personBeingAttacked
	 * @param PersonBeingAttacked
	 *.getDefense() is used to determine how much atk damage is being blocked
	 */
	private void attack(CharacterClass personAttacking, CharacterClass personBeingAttacked) {
		double totalDamage = personAttacking.getDamage() - personBeingAttacked.getDefense();
		if (totalDamage > 0) {
			personBeingAttacked.setHealth((int) (personBeingAttacked.getHealth() - totalDamage));
		}
	}

	/**
	 * @param PersonAttacking
	 *Gold is added to personAttacking backpack
	 * @param PersonThatDied
	 *Amount of gold is given to person Attacking if defeated
	 */
	private void receiveReward(HeroClass PersonAttacking, Creatures PersonThatDied) {
		int gold = PersonThatDied.getGold();
		PersonAttacking.getBackpack().addGold(gold);
		System.out.println("Gold rewarded: " + gold + ". Total gold: " + PersonAttacking.getBackpack().getGold());
	}

	public void useItem(HeroClass hero) {
		System.out.println(hero.getBackpack().toString());
		int choice = scan.nextInt();
		hero.drinkPotion(choice);

	}

	private void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException exp) {
		}
	}
}