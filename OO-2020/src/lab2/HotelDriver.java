package lab2;

public class HotelDriver {
	
	public static void main(String[] args) {
		
		
		
		//New Objects
		HotelRoom roomA = new HotelRoom(200 , "Single" , 1 , 100);
		HotelRoom roomB = new HotelRoom(201, "Double" , 0 , 80);
		HotelRoom roomC = new HotelRoom(202, "Single", 0 , 90);
		
		
		//PrintOuts
		System.out.println("If Vancancy is 0 = Vacant , 1 = Occupied");
		System.out.println("\nroom number is " + roomA.getRoomNumber() + " , type is " + roomA.getRoomType() + " , Vacancy= " 
				+ roomA.getOccupancy() + " , Rate = " + roomA.getRate());
		
		System.out.println("\nroom number is " + roomB.getRoomNumber() + " , type is " + roomB.getRoomType() + " , Vacancy= " 
				+ roomB.getOccupancy() + " , Rate = " + roomB.getRate());
		
		System.out.println("\nroom number is " + roomC.getRoomNumber() + " , type is " + roomC.getRoomType() + " , Vacancy= " 
				+ roomC.getOccupancy() + " , Rate = " + roomC.getRate());
		
	}
}
