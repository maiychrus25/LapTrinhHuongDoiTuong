package BKTTH_02.Bai3;

import java.util.Scanner;

public class MobilePhone extends Product {
	private String manufacturer;
	private int warrantyPeriod;
	
	public MobilePhone () {}
	
	public MobilePhone(String productName, double productPrice, int productQuantity, String manufacturer, int warrantyPeriod) {
		super(productName, productPrice, productQuantity);
		this.manufacturer = manufacturer;
		this.warrantyPeriod = warrantyPeriod;
	}
	
	// check is valid warranty period
	public void isValidateWarrantyPeriod() throws InvalidWarrantyPeriodException {
		if (this.warrantyPeriod < 0) 
			throw new InvalidWarrantyPeriodException("Thoi gian bao hanh khong hop le.");
	}
	
	@Override
	public void inputProduct(Scanner sc) {
		super.inputProduct(sc);
		System.out.print("Nhap hang san xuat: ");
		this.manufacturer = sc.nextLine();
		
		System.out.print("Nhap thoi gian bao hanh: ");
		this.warrantyPeriod = Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNha san xuat: " + this.manufacturer +
				"\nThoi gian bao hanh: " + this.warrantyPeriod;
	}
}
