package BKTTH_02.Bai4;

import java.util.Scanner;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 12:21:00 PM
**/

public class Employee {
	private String id;
	private String name;
	
	private String position;
	private static int cnt = 0;
	
	public Employee () {}
	
	public Employee(String name, String position) {
		this.id = "NV" + String.format("%03d", ++cnt);
		this.name = name;
		this.position = position;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void isValidateInput() throws EmptyInputException {
		if (this.name.trim().isEmpty() || this.position.trim().isEmpty()) 
			throw new EmptyInputException("Cac truong khong duoc de trong.");
	}
	
	public void inputEmployee(Scanner sc) {
		System.out.print("Nhap ten nhan vien: ");
		this.name = sc.nextLine();
		
		System.out.print("Nhap chuc vu: ");
		this.position = sc.nextLine();
	}
	
	@Override 
	public String toString() {
		return "Ma Nhan vien: " + this.id + "\nTen Nhan vien: " + 
				this.name + "\nChuc vu: " + this.position;
	}
}
