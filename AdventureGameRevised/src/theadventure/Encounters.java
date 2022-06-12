package theadventure;

import java.util.Random;

public class Encounters {

	static Random randhit = new Random();
	static Random enemy = new Random();
	static Enemies encounteredenemy;
	
	public static void encounter() {

		//Random number generator and number storage
		
		int randomenemy = enemy.nextInt(100);

		//Random enemy selection
		if(randomenemy >= 0 && randomenemy<=49) { //&&=and ||=or ^=xor 
			encounteredenemy=Main.goblin;
		}
		if(randomenemy>=50 && randomenemy <=98) {
			encounteredenemy=Main.skeleton;
		}
		if(randomenemy >=99) {
			encounteredenemy=Main.dragon;
		}
		//Encounter Text
			System.out.println("You have encountered a "+encounteredenemy.classname+"!");
			encounteredenemy.maxhitpoints = randhit.nextInt(encounteredenemy.maxhitpoints)+30;
			System.out.println("It has " + encounteredenemy.maxhitpoints + " hitpoints");
			System.out.println(
					"-----------------------------------------------------------------------------------");
		
	}
}
