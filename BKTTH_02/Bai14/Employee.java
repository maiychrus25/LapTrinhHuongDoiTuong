package Bai14;

import java.util.Scanner;

public class Employee extends Person {
  private String employeeId;
  private double totalSalary;

  public Employee() {
  }

  public Employee(String fullName, int birthYear, String hometown, String employeeId, double totalSalary) {
    super(fullName, birthYear, hometown);
    this.employeeId = employeeId;
    this.totalSalary = totalSalary;
  }

  public int getBirthYear() {
    return this.getBirthYear();
  }

  public void isvalidateSalary() throws InvalidSalaryException {
    if (this.totalSalary < 0)
      throw new InvalidSalaryException("Tong luong khong hop le.");
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);
    System.out.print("Enter employee ID: ");
    this.employeeId = sc.nextLine();

    System.out.print("Enter total salary: ");
    this.totalSalary = sc.nextDouble();
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Employee ID: " + employeeId + "\n" +
        "Total Salary: " + totalSalary;
  }
}
