package lab2;

public class HotelDriver 
{	
	public static void main(String[] args) 
	{	
		HotelRoom roomA = new HotelRoom(200,"Signle",true,100);
		HotelRoom roomB = new HotelRoom(201,"Double",false,80);
		HotelRoom roomC = new HotelRoom(202,"Single",false,90);
		
		
		System.out.println(roomA.toString());
		System.out.println(roomB.toString());
		System.out.println(roomC.toString());
		
		
	}
}
