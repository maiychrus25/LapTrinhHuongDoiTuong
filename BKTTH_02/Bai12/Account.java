package Bai12;

import java.util.Scanner;

public class Account {
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  public Account() {
  }

  public Account(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  public double getBallance() {
    return this.balance;
  }

  public void isvalidateAccountInfo() throws EmptyInputException {
    if (this.accountNumber.trim().isEmpty())
      throw new EmptyInputException("So tai khoan khong duoc de trong.");

    if (this.accountHolderName.trim().isEmpty())
      throw new EmptyInputException("Ten chu tai khoan khong duoc de trong.");
  }

  public void isvalidateBallance() throws InvalidBalanceException {
    if (this.balance < 0)
      throw new InvalidBalanceException("So du khong hop le.");
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap so tai khoan: ");
    this.accountNumber = sc.nextLine();

    System.out.print("Nhap ten chu tai khoan: ");
    this.accountHolderName = sc.nextLine();

    System.out.print("Nhap so du tai khoan: ");
    this.balance = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return "So tai khoan: " + this.accountNumber + "\nTen chu tai khoan: "
        + this.accountHolderName + "\nSo du: " + this.balance;
  }
}