package workcomplaints;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("I'm sorry to hear that you have a complaint to file");
		System.out.println("please detail your complaint below and press enter for a quick resolution");
		String complaint=scan.nextLine();
		
		System.out.println("Thank you for your complaint regarding "+complaint);
		System.out.println("");
		
		System.out.println("Welp guess what! I don't give a shit! Not my fucking problem!");
		System.out.println("");
		
		System.out.println("On a scale of 1 to 10 how helpful do you feel this resolution to be?");
		String resolution=scan.nextLine();
		System.out.println("Guess what bitch! I don't give a shit about that either! Hahaha!!");
	}

}
