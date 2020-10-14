package lab2;

public class HotelRoom {
	
	/*To enhance our room management system we want to know if the room is occupied
	or vacant. Add a new private integer which can be either 0 or 1 (0 means vacant, 1
	means occupied). In addition, we need to know what the nightly rate for each room
	is. Add a double variable called rate. Write the necessary methods to set and get this
	new variable. In the driver program set roomA to be occupied with a rate of 100, and
	roomB to be unoccupied with a rate of 80 by calling the appropriate method.
	Add these values to the output statements.*/
	
	
	//Variable
	private int roomNumber;
	private String roomType;
	private int occupancy;
	private double rate;
	
	//Constructor
	public HotelRoom() {
		setRoomNumber(0);
		setRoomType("");
	}
	
	public HotelRoom(int roomNumber, String roomType, int occupancy, double rate) {
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setOccupancy(occupancy);
		setRate(rate);
	}
	
	
	//Getters and Setters
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	//toString
		
	
	
}
