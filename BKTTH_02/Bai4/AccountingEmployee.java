package BKTTH_02.Bai4;

import java.util.Scanner;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 12:21:20 PM
**/

public class AccountingEmployee extends Employee {
	private int yearsOfExperience;
	private String specialization;
	
	public AccountingEmployee () {}
	
	public AccountingEmployee(String name, String position, int yearsOfExperience, String specialization) {
		super(name, position);
		this.yearsOfExperience = yearsOfExperience;
		this.specialization = specialization;
	}
	
	public void isValidateExperience() throws InvalidExperienceException {
		if (this.yearsOfExperience < 0) {
			throw new InvalidExperienceException("So nam kinh nghiem khong hop le.");
		}
	}
	
	@Override
	public void isValidateInput() throws EmptyInputException {
		super.isValidateInput();
		if (this.specialization.trim().isEmpty()) 
			throw new EmptyInputException("Cac truong khong duoc de trong.");
	}
	
	@Override
	public void inputEmployee(Scanner sc) {
		System.out.print("Nhap so nam kinh ngiem: ");
		this.yearsOfExperience = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap chuyen mon: ");
		this.specialization = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSo nam kinh nghiem: " + this.yearsOfExperience
				+ "\nChuyen mon: " + this.specialization;
	}
}
