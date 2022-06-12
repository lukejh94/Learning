package theadventure;

import java.util.Random;

public class Travel {

	public static void nextLocation() {

		Random rand = new Random();
		int location = rand.nextInt(3);
		
		if(location == 0){
			System.out.println("You stumble into a vile swamp");
		}
		else if(location == 1){
			System.out.println("You find yourself standing in a dark cave");
		}
		else if(location == 2){
			System.out.println("You feel a chill as you cross into a frozen tundra");
		}
	}
}