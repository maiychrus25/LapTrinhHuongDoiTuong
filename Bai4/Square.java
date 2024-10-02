package Bai4;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	
	public Square(double length) {
		super(length, length);
	}
	
	// perimeter: 4 * a
	@Override
	public double calcPerimeter() {
		return this.length * 4;
	}
	
	// area: a * a
	@Override
	public double calcArea() {
		return this.length * this.length;
	}
	
	@Override
	public String toString() {
		return "Chu vi la: " + this.calcPerimeter() + "\nDien tich la: " + this.calcArea();
	}
}
