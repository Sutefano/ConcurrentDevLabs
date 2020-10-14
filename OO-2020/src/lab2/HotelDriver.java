package lab2;

public class HotelDriver {
	
	public static void main(String[] args) {
		
		//New Objects
		HotelRoom roomA = new HotelRoom(200 , "Single");
		HotelRoom roomB = new HotelRoom(201, "Double");
		
		//PrintOuts
		System.out.println("room number is " + roomA.getRoomNumber() + ",type is " + roomA.getRoomType());
		System.out.println("room number is " + roomB.getRoomNumber() + ",type is " + roomB.getRoomType());
		
	}
}
