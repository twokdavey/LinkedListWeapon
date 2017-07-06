import Battle.BattleZone;
import MonsterStuff.SludgeMonster;
import PlayerStuff.CharacterClass;
import PlayerStuff.HeroClass;
import Scenes.Chapter1Invasion;

public class Main {
	public static void main(String[] args){
		//Creates main hero used for almost all parameters
		HeroClass hero = new HeroClass(null,100,0,0,5);
		
		
		//starts the game (easier to manage data in chapters)
		Chapter1Invasion chap1 = new Chapter1Invasion(hero);
		
	}

}
