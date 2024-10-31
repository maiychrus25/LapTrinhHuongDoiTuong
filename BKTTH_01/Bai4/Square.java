//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai4/Square.java
package BKTTH_01.Bai4;
=======
//Created: 29.09.2024
package Bai4;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai4/Square.java

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
