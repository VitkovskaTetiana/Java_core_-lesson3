package java_core;

public class Circle {
	private double radius;
	private double diameter;

	public Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	public double getSquare() {
		return Math.pow(this.diameter / 2, 2) * Math.PI;
	}
	public double getLength( ) {
		return this.radius * 2 * Math.PI;
	}
}