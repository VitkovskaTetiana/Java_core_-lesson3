package java_core;

public class Main {
	public static void main(String[] arg) {
		Rectangle myRectangle = new Rectangle(10, 15);
		System.out.println("Square of rectangle is " + myRectangle.getSquare());
		System.out.println("Perimeter of rectangle is " + myRectangle.getPerimeter());
		System.out.println("------------------");
		
		Rectangle myRectangle2 = new Rectangle();
		System.out.println("Square of rectangle #2 is " + myRectangle2.getSquare());
		System.out.println("Perimeter of rectangle #2 is " + myRectangle2.getPerimeter());
		System.out.println("------------------");
		
		Circle myCircle = new Circle(1.5, 3);
		System.out.println("Circle square is " + myCircle.getSquare());
		System.out.println("Circle length is " + myCircle.getLength() );		
	}
}
