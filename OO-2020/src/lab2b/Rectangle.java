package lab2b;

public class Rectangle {
	
	/*
	 * 
	 */
	
	private int length;
	private int width;
	/*
	 * 
	 */
	
	public Rectangle() {
		
	}
		
	
	/*
	 * 
	 */
	
	
	public int getLength() {
		
		if(this.length <= 1) {
			return 1;
		}
		
		else {
			return length;
		}
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		if(this.width <= 0) {
			return 1;
		}
		
		else {
			return width;
		}
	}

	public void setWidth(int width) {
		
		this.width = width;	
	}
	
	/*
	 * 
	 */
	
	@Override
	public String toString() {
		return "Length = " + getLength() + ", Width = " + getWidth() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter(); 
	}
	
	//Methods
	public int getArea() {				
		return this.length * this.width;
	}
	public int getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}
	
	public String printRectangle() {							//Prints out length in *
		for(int i = 0; i < this.length; i++) {					//The width for loop then places one * and another for loop within
			System.out.print("*");;								//counts the length - 2 to fill it in with spaces
		}														//another ending for loop then prints another row of *
		
		for(int i = 2; i < this.width; i++) {
			System.out.print("\n*");;	
			for(int c = 0; c < (this.length - 2) ; c++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i < this.length; i++) {
			System.out.print("*");;
		}
		
		return null;
	}
	
	
	
	
	
	
	
}
