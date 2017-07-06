package Scenes;

import java.util.Scanner;

import Battle.BattleZone;
import Merchant.Merchant;
import MonsterStuff.BossMitch;
import MonsterStuff.Creatures;
import MonsterStuff.EnemySoldierWeak;
import MonsterStuff.SludgeMonster;
import PlayerStuff.CharacterClass;
import PlayerStuff.HeroClass;

public class Chapter1Invasion {
	BattleZone battle;
	Merchant merchant;
	Scanner scan = new Scanner(System.in);

	// CharacterClass hero;
	public Chapter1Invasion(HeroClass hero) {

		opening(hero);
	}

	public void opening(HeroClass hero) {
		System.out.println("**Smoke fills your lungs.. from a deep sleep you lunge forward**");
		System.out.println("**from the ground**");
		delay(2000);
		System.out.println("**waking from the daze, you seem to have been laying outside**");
		System.out.println("**the keep where you and your family stay, footsteps approach**");
		delay(5000);
		System.out.println("Hey!......");
		delay(1000);
		System.out.println("...");
		delay(1000);
		System.out.println("...");
		delay(1000);
		System.out.println("Kid! Whats your name?....");

		String name = scan.nextLine();
		hero.setName(name);
		System.out.println("!!!!!!!!!");
		delay(1000);
		System.out.println(hero.getName() + " of course it's you!");
		delay(2000);
		System.out.println(
				"You must have been knocked out before the invasion started,\n" + "half our army is missing!\n");
		delay(4000);
		System.out.println("My names Mitch, I know your father kept you away from violence\n"
				+ "so you may not have heard of me. I am Commanding Officer of the Royal\n" + "White Winged Knights!");
		delay(4000);
		System.out.println(".........\n");
		delay(2000);
		System.out.println(
				"Mitch:Sorry... I get caught up in formalities. We need to find a \n " + "way out of the kingdom\n");
		delay(4000);
		System.out.println("Mitch:We've been overrun and need to regroup, we\n"
				+ " are heading to the nearest town till we figure out what to do next.\n");
		delay(4000);
		System.out.println("Mitch:Look out " + hero.getName() + "!");
		System.out.println("**A slimey creature approaches, it appears sad, but, something**");
		System.out.println("**feels like it doesnt want to cause harm, it lunges at you**");
		delay(1000);
		System.out.println(
				"?????????:HEY CATCH! **A young man from behind you in the shadows throws a sword at your feet**");
		delay(4000);
		Creatures sludge = new SludgeMonster();
		battle = new BattleZone();
		battle.battle(hero, sludge);
		System.out.println("Mitch:You can fight?....mm oh!");
		System.out.println("Mitch:You're safe! Thank goodness " + hero.getName() + ".");
		System.out.println("Mitch:We have two ways to outside the town and since you seemed to handle");
		System.out.println("yourself well, you choose where we go, either:");
		System.out.println("1. Walk through town through the front entrance");
		System.out.println("2. Go through the tunnel from where that slime creature came from");
		int decision = 0;
		while (!(decision == 1) || !(decision == 2)) {
			decision = scan.nextInt();
			if (decision == 1) {
				walkThroughTown(hero);
			} else if (decision == 2) {
				walkThroughTunnel(hero);
			} else {
				System.out.println("Please select 1 or 2");
			}
		}
	}

	private void walkThroughTown(HeroClass hero) {
		System.out.println("Mitch: A fine choice indeed!");
		System.out.println("**A mysterious figure approaches, would you like any wares?");
		scan.nextLine();
		String choice= scan.nextLine();
		if(choice.equalsIgnoreCase("yes")){
			merchant = new Merchant(hero,3,3,3);
		}
		System.out.println("Enemy Soldier: STOP RIGHT THERE!");
		System.out.println("**Enemy approaches you, sword aiming at your chest**");
		System.out.println("(Where did Mitch go?)");
		Creatures enemySoldierWeak1= new EnemySoldierWeak();
		battle.battle(hero, enemySoldierWeak1);
		System.out.println("Mitch:Wow, you are really quite something.");
		System.out.println("I really didnt want to get my hands dirty..");
		System.out.println("**Mitch slashes your back with his claymore sword");
		hero.setHealth(hero.getHealth()/2);
		Creatures mitch = new BossMitch();
		battle.battle(hero, mitch);
		
		
		
		
		

	}

	private void walkThroughTunnel(HeroClass hero) {

	}

	private void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException exp) {
		}
	}

}
