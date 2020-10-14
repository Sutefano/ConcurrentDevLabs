package lab2;

public class HotelRoom {
	//Variable
	private int roomNumber;
	private String roomType;
	
	//Constructor
	public HotelRoom() {
		setRoomNumber(0);
		setRoomType("");
	}
	
	public HotelRoom(int roomNumber, String roomType) {
		setRoomNumber(roomNumber);
		setRoomType(roomType);
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
	
	
}
