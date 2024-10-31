<<<<<<< HEAD:BKTTH_01/Bai8/Product.java
//Author: MAIY 07!!
package BKTTH_01.Bai8;
=======

/**
*    Author:  MAIY07!!
*    Created: Oct 28, 2024 10:12:24 PM
**/
package Bai8;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai8/Product.java

import java.util.Scanner;

public class Product {
	private String name;
	protected int price;
	protected int quantity;
	
	public Product () {}
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public long calcTotalPrice() {
		return 1L * this.price * this.quantity;
	}
	
	public void input(Scanner sc) {
		System.out.print("Nhap ten san pham: ");
		this.name = sc.nextLine();
		
		System.out.print("Nhap gia san pham: ");
		this.price = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap so luong san pham: ");
		this.quantity = Integer.parseInt(sc.nextLine());
	}
	
	// function check price and quantity is valid
	public void isValidPrice() throws InvalidPriceException {
		if (this.price < 0) throw new InvalidPriceException("Gia khong duoc nho hon 0.");
	}
	
	public void isValidQuantity() throws InvalidQuantityException {
		if (this.quantity < 0) throw new InvalidQuantityException("So luong khong duoc nho hon 0.");
	}
	
	@Override
	public String toString() {
		return "Ten san pham: " + this.name + "\nGia san pham: " + this.price
				+ "\nSo luong san pham: " + this.quantity + "\nTong gia tri: " + this.calcTotalPrice();
	}
}
