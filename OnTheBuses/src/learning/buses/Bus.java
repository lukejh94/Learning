package learning.buses;

public class Bus {
	boolean[] seats = new boolean[20];
	int totalPassengers = 0;
	String route = null;
	
	public void fillSeat (int seatNumber){
		seats[seatNumber]=true;
		totalPassengers++;
	}
	
	public void emptySeat (int seatNumber) {
		seats[seatNumber]=false;
	}
}
