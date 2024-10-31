package BKTTH_02.Bai2AndBai4;

import java.util.Scanner;

public class Employee {
	private String employeeID;
	private String employeeName;
	
	private double employeeSalary;
	private String position;
	
	private static int cnt = 1;
	
	public Employee () {}
	
	// Constructor bai 2
	public Employee(String employeeName, Double employeeSalary) {
		this.employeeID = "NV" + String.format("%03d", cnt++);
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	// Constructor Bai 4
	public Employee(String employeeName, String position) {
		this.employeeID = "NV" + String.format("%03d", cnt++);
		this.employeeName = employeeName;
		this.position = position;
	}	
	
	// function check is valid salary
	public void isValidateSalary() throws InvalidSalaryException {
		if  (this.employeeSalary < 0) 
			throw new InvalidSalaryException("Gia tri luong khong hop le.");
	}
	
	public double getSalary() {
		return this.employeeSalary;
	}
	
	public void input(Scanner sc) {
		System.out.print("Nhap ten nhan vien: ");
		this.employeeName = sc.nextLine();
		
		System.out.print("Nhap luong co ban: ");
		this.employeeSalary = Double.parseDouble(sc.nextLine()); 
	}
	
	@Override
	public String toString() {
		// toString bai 2
//		return "ID Nhan vien: " + this.employeeID + "\nTen nhan vien: " + this.employeeName + "\nLuong co ban: " + this.employeeSalary;
	
		// toString bai 4
		return "ID nhan vien: " + this.employeeID + "\nTen nhan vien: " + this.employeeName + "\nVi tri: " + this.position;
	}
}
