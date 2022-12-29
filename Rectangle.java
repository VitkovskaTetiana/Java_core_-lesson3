package java_core;

public class Rectangle {
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public Rectangle() {
		this.height = 30;
		this.width = 40;
	}
	
	public int getSquare() {
		return this.height * this.width;
	}
	public int getPerimeter() {
		return 2 * (this.height + this.width);
	}
}
