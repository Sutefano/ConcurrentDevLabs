
package lab2;

public class HotelRoom {
	private String roomType;
	private int roomNumber;
	private double rate;
	private boolean occupancy;
	
	
	/**
	 * 
	 */
	
	
	
	public HotelRoom() {
		
	}
	
	public HotelRoom(int roomNumber, String roomType , boolean occupancy, double rate) {
		
		setRoomNumber(roomNumber);
		
		setRoomType(roomType);
	
		setOccupancy(occupancy);

		setRate(rate);
	}
		
	/*
	 * 
	 */
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {	
		this.roomNumber = roomNumber;
	}
	 
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

		
	public boolean isOccupancy() {
		OccupancyDecision();	
		return occupancy;
	}
	

	public void setOccupancy(boolean occupancy) {
		this.occupancy = occupancy;
	}


	@Override
	public String toString() {
			
		return "Room number is " + getRoomNumber() + ", Type is " + getRoomType() + ". the room is " + OccupancyDecision() + " and the rate is " + getRate();
			
	}
	
	public String OccupancyDecision() {
		if(this.occupancy == true) {
			return "Occupied";
		}
		else {
			return "Vacant";
		}
		
	}
		
	
	
		
	
	
}
