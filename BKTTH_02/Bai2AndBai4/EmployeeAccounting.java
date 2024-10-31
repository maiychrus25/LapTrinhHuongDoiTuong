package BKTTH_02.Bai2AndBai4;

import java.util.Scanner;

public class EmployeeAccounting extends Employee {
	private int experience;
	private String level;
	
	public EmployeeAccounting () {}

	public EmployeeAccounting(String employeeName, String position, int experience, String level) {
		super(employeeName, position);
		this.experience = experience;
		this.level = level;
	}
	
	@Override
	public void input(Scanner sc) {
		super.input(sc);
		System.out.print("Nhap so nam kinh nghiem: ");
		this.experience = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap trinh do chuyen mon: ");
		this.level = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSo nam kinh nghiem: " + this.experience + "\nTrinh do chuyen mon: " + this.level;
	}
}
