package Bai4;

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