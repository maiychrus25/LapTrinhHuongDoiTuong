//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai4/Rectangle.java
package BKTTH_01.Bai4;
=======
//Created: 29.09.2024
package Bai4;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai4/Rectangle.java

import java.util.Scanner;

public class Rectangle {
	protected double length;
	protected double width;
	
	public Rectangle() {}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void input(Scanner sc) {
		System.out.println("Nhap chieu dai hinh chu nhat: ");
		this.length = sc.nextDouble();
		
		System.out.println("Nhap chieu rong cua hinh chu nhat: ");
		this.width = sc.nextDouble();
	}
	
	// function calculator perimeter
	public double calcPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	// function calculator area
	public double calcArea() {
		return this.length * this.width;
	}
	
	@Override
	public String toString() {
		return "Chieu dai la: " + this.length + "\nChieu rong la: " + this.width;
	}
}
