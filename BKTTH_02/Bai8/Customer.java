package Bai8;

import java.util.Scanner;

public class Customer {
  private String customerId;
  private String customerName;

  private String customerAddress;
  private static int cnt = 0;

  public Customer() {
  };

  public Customer(String customerName, String customerAdrees) {
    this.customerId = "KH" + String.format("%03d", ++cnt);
    this.customerName = customerName;
    this.customerAddress = customerAdrees;
  }

  public void isValidateCustomerinfor() throws EmptyInputException {
    if (this.customerName.trim().isEmpty())
      throw new EmptyInputException("Ten khong hop le.");

    if (this.customerAddress.trim().isEmpty())
      throw new EmptyInputException("Dia chi khach hang khong hop le.");
  }

  public void inputInfor(Scanner sc) {
    System.out.print("Nhap ten khach hang: ");
    this.customerName = sc.nextLine();

    System.out.print("Nhap dia chi khach hang: ");
    this.customerAddress = sc.nextLine();
  }

  @Override
  public String toString() {
    return "\nMa khach hang: " + this.customerId + "\nTen khach hang: " + this.customerName + "\nDia chi khach hang: "
        + this.customerAddress;
  }
}
