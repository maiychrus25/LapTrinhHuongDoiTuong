package BKTTH_02.Bai2AndBai4;

import java.util.Scanner;

public class EmployeeFullTime extends Employee {
	private double bonus;
	private Double fine;
	
	public EmployeeFullTime () {}
	
	public EmployeeFullTime(String employeeName, double employeeSalary, double bonus, double fine) {
		super(employeeName, employeeSalary);
		this.bonus = bonus;
		this.fine = fine;
	}
	
	// function check isvalidate bonus and fine
	public void isValidateBonus() throws InvalidRewardException {
		if (this.bonus < 0) 
			throw new InvalidRewardException("Gia tri tien thuong khong hop le.");
	}
	
	public void isValidateFine() throws InvalidPenaltyException {
		if (this.fine < 0) 
			throw new InvalidPenaltyException("Gia tri thien phat khong hop le.");
	}
	
	@Override
	public void input(Scanner sc) {
		super.input(sc);
		System.out.print("Nhap so tien thuong: ");
		this.bonus = Double.parseDouble(sc.nextLine());
		
		System.out.print("Nhap vao so tien phat: ");
		this.fine = Double.parseDouble(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTien thuong: " + this.bonus + "\nTien phat: " + this.fine;
	}
}
