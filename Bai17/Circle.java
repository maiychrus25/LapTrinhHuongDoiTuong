package Bai17;

import java.util.Scanner;

public class Circle {
    protected double radius;
    
    public Circle () {}
    
    public Circle(double radius) {
    	this.radius = radius;
    }
    
    public void isValidateRadius() throws InvalidRadiusException {
    	if (this.radius <= 0) 
    		throw new InvalidRadiusException("Ban kinh khong hop le.");
    }
    
    public void inputRadius(Scanner sc) {
        System.out.print("Nhap ban kinh: ");
        this.radius = Double.parseDouble(sc.nextLine());
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override 
    public String toString() {
    	return "Ban kinh la: " + this.radius + "\nDien tich la: " + this.calculateArea();
    }
}
