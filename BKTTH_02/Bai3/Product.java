package BKTTH_02.Bai3;

import java.util.Scanner;

public class Product {
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	public Product () {}
	
	public Product(String productName, double productPrice, int productQuantity) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	public double getPrice() {
		return this.productPrice;
	}
	
	// function check valid price and quantity
	public void isValidatePrice() throws InvalidPriceException {
		if (this.productPrice < 0) 
			throw new InvalidPriceException("Gia san pham khong hop le.");
	}
	
	public void isValidateQuantity() throws InvalidQuantityException {
		if (this.productQuantity < 0)
			throw new InvalidQuantityException("So luong khong hop le.");
	}
	
	public void inputProduct(Scanner sc) {
		System.out.print("Nhap ten san pham: ");
		this.productName = sc.nextLine();
		
		System.out.print("Nhap gia san pham: ");
		this.productPrice = Double.parseDouble(sc.nextLine());
		
		System.out.print("Nhap so luong san pham: ");
		this.productQuantity = Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return "Ten san pham: " + this.productName + "\nGia san pham: " + this.productPrice
			   + "So luong san pham: " + this.productQuantity;
	}
}
