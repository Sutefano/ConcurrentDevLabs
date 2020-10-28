package lab2b;

public class RectangleDriver {
	public static void main(String[] args) {
		Rectangle Rect1 = new Rectangle();
		
		Rect1.setLength(10);
		Rect1.setWidth(5);
		
		System.out.println(Rect1.toString() + "\n");
		
		Rect1.printRectangle();
		
	}
}
