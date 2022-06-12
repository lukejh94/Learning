package theadventure;

import java.util.Scanner;
import java.util.Random;

public class Combat {

	public static Scanner in = new Scanner(System.in);
	public static Random rand = new Random();
	static int enemyhp = Encounters.encounteredenemy.maxhitpoints;
	static int currenthealth = Main.activeplayer.hitpoints;
	static String action;

	// Intro to combat
	public static void Battle() {

		enemyhp = Encounters.encounteredenemy.maxhitpoints;

		while (enemyhp > 0 && currenthealth > 0) {
			while (action != "attack" || action != "heal" || action != "runaway") {
				System.out.println("You face down your foe... what is your next move?");
				System.out.println("attack \nheal (you have " + Main.potionnumber + " health potions left) \nrunaway");
				System.out
						.println("-----------------------------------------------------------------------------------");
				action = in.nextLine();
				if (action.equals("attack") || action.equals("heal") || action.equals("runaway")) {
					break;
				}
			}

			// ATTACK
			if (action.equals("attack")) {
				int multiplier = rand.nextInt(4) + 6;
				int critroll = rand.nextInt(20);

				int playerdamagedealt = Main.activeplayer.attackstat * multiplier / 10;
				if (critroll >= 19) {
					playerdamagedealt = Main.activeplayer.attackstat * multiplier / 10 * 2;
					System.out.println("You land a critical hit!");
				}
				System.out.println("You attack the " + Encounters.encounteredenemy.classname + " for "
						+ playerdamagedealt + " damage!");
				System.out
						.println("-----------------------------------------------------------------------------------");
				enemyhp = enemyhp - playerdamagedealt;
			}

			// HEAL
			else if (action.equals("heal")) {
				if (Main.potionnumber > 0) {
					int healmult = rand.nextInt(5) + 6;
					int amounthealed = Main.potion.itemhealamount * healmult / 10;
					System.out.println("You drink a health potion and heal for " + amounthealed + " hitpoints");
					currenthealth = currenthealth + amounthealed;
					if (currenthealth > Main.activeplayer.hitpoints) {
						currenthealth = Main.activeplayer.hitpoints;
						Main.potionnumber--;
					}

					System.out.println("You now have " + currenthealth + " hitpoints");
					System.out.println(
							"-----------------------------------------------------------------------------------");
				}

				if (Main.potionnumber == 0) {
					System.out.println("You don't have any health potions!");
					System.out.println(
							"-----------------------------------------------------------------------------------");
				}
			}

			// RUN
			if (action.equals("runaway")) {
				System.out.println("You turn and run from the " + Encounters.encounteredenemy.classname + "!");
				int escapechance = Main.activeplayer.escapechance * rand.nextInt(11) + 5 / 10;
				int escaperoll = Encounters.encounteredenemy.escapechance * (11) + 5 / 10;
				if (escapechance > escaperoll) {
					System.out.println("You successfully flee from the " + Encounters.encounteredenemy.classname + "!");
					System.out.println(
							"-----------------------------------------------------------------------------------");
					break;
				}
				if (escaperoll > escapechance) {
					System.out.println("You can't escape the " + Encounters.encounteredenemy.classname + "!");
					System.out.println(
							"-----------------------------------------------------------------------------------");
				}
			}
			// DAMAGE DEALT AND ATTACK BACK
			if (enemyhp > 0) {
				System.out.println(
						"The " + Encounters.encounteredenemy.classname + " still has " + enemyhp + " hitpoints left!");

				System.out.println("The " + Encounters.encounteredenemy.classname + " attacks you!");
				int enemymultiplier = rand.nextInt(4) + 6;
				int critroll = rand.nextInt(20);
				int enemydamagedealt = Encounters.encounteredenemy.attackstat * enemymultiplier / 10;
				if (critroll >= 19) {
					enemydamagedealt = Encounters.encounteredenemy.attackstat * enemymultiplier / 10 * 2;
					System.out.println("The attack critically hit you!");
				}
				currenthealth = currenthealth - enemydamagedealt;
				if (currenthealth <= 0) {
					currenthealth = 0;
				}
				System.out.println("It hits you for " + enemydamagedealt + " damage! \nyou have " + currenthealth
						+ " hitpoints left!");
				System.out
						.println("-----------------------------------------------------------------------------------");

				if (currenthealth == 0) {
					break;
				}
			}
		}

		if (currenthealth == 0) {
			System.out.println("You have fallen in battle! You fought well, your score is " + Main.playerscore
					+ " points! \nThank you for playing!");
		}
		if (enemyhp <= 0) {
			System.out.println("congratulations you have defeated the " + Encounters.encounteredenemy.classname + "!");
			System.out.println("-----------------------------------------------------------------------------------");
			Main.playerscore = Main.playerscore + Encounters.encounteredenemy.maxhitpoints;
			int enemydropchance = rand.nextInt(10);
			if (enemydropchance >= 8) {
				Main.potionnumber++;
				System.out.println(
						"you pick up a " + Main.potion.itemname + " from the " + Encounters.encounteredenemy.classname);
				System.out
						.println("-----------------------------------------------------------------------------------");
			}

		}
	}
}
