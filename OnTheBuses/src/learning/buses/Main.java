package learning.buses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello, welcome to Luke's bus service");
		
		Bus bbus=new Bus();
		bbus.route="41b";
		
		Bus pbus=new Bus();
		pbus.route="42b";
		
		System.out.println(busstats(bbus));
		System.out.println(busstats(pbus));
		System.out.println("Which seat has been filled?");
		String answer=scan.nextLine();
		int ans=Integer.parseInt(answer);
		
		bbus.fillSeat(ans);
		System.out.println(busstats(bbus));
		System.out.println(busstats(pbus));
		System.out.println("Which seat has been filled?");
		answer=scan.nextLine();
		ans=Integer.parseInt(answer);
		
		bbus.fillSeat(ans);
		System.out.println(busstats(bbus));
		System.out.println(busstats(pbus));
		System.out.println("Which seat has been vacated?");
		answer=scan.nextLine();
		ans=Integer.parseInt(answer);
		
		bbus.emptySeat(ans);
		System.out.println(busstats(bbus));
		System.out.println(busstats(pbus));
		
	}

	public static String busstats(Bus bus) {
		String stats = "Your bus has served "+bus.totalPassengers+" people today on route "+bus.route+".";
		for(boolean b:bus.seats) {
			System.out.print(b+",");
		}
		System.out.println("");
		return stats;
	}
	
	public static void mainMenu() {
		
	}
}
