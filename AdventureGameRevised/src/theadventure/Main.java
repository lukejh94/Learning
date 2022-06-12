package theadventure;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	static PlayerClass activeplayer;
	static int potionnumber = 1;
	static int playerscore = 0;
	
	//MAIN METHOD
	public static void main(String[] args) {

// INTRO
		System.out.println("Hello and welcome to Luke's text based adventure game.");
		System.out.println("please enter the name of your hero...");

		String name = in.nextLine();
		System.out.println("Welcome hero " + name);

		while (activeplayer == null) {

			System.out.println("please type the name of the class to choose your class, \nyou can choose from...");
			System.out.println("warrior or mage");

			String chosenclass = in.nextLine();

			if (chosenclass.equals("warrior")) {
				activeplayer = warrior;
			} else if (chosenclass.equals("mage")) {
				activeplayer = mage;
			}
		}
		System.out.println("you have chosen to play the " + activeplayer.classname + " class."
				+ "\n-----------------------------------------------------------------------------------");

// GAME:
		while (activeplayer.hitpoints > 0) {
			Travel.nextLocation();
			Encounters.encounter();
			Combat.Battle();
			if(Combat.currenthealth ==0) {
				break;
			}
		}

	}

	// PLAYER + ENEMY CLASSES + ITEMS
	public static PlayerClass warrior = new PlayerClass("warrior", 160, 40, 50, 50, 50);
	public static PlayerClass mage = new PlayerClass("mage", 120, 60, 30, 50, 60);

	public static Enemies goblin = new Enemies("Goblin", 30, 20, 30, 20, 20);
	public static Enemies skeleton = new Enemies("Skeleton", 10, 40, 40, 30, 30);
	public static Enemies dragon = new Enemies("Dragon", 500, 100, 100, 100, 100);

	public static EnemyDrops potion = new EnemyDrops("potion", 50);
}
