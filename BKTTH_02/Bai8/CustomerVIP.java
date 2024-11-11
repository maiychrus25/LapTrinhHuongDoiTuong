/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

package Bai8;

import java.util.Scanner;

public class CustomerVIP extends Customer {
  private int vipRank;
  private double discount;

  public CustomerVIP() {
  }

  public CustomerVIP(String customerName, String customerAddress, int vipRank, double discount) {
    super(customerName, customerAddress);
    this.vipRank = vipRank;
    this.discount = discount;
  }

  public int getVipRank() {
    return this.vipRank;
  }

  public void isValidateRank() throws InvalidRankException {
    if (this.vipRank < 0)
      throw new InvalidRankException("Thu hang VIP khong hop le.");
  }

  public void isValidDiscount() throws InvalidDiscountException {
    if (this.discount < 0 || this.discount > 100)
      throw new InvalidDiscountException("Chiet khau khong hop le.");
  }

  @Override
  public void inputInfor(Scanner sc) {
    super.inputInfor(sc);
    System.out.print("Nhap thu hang VIP: ");
    this.vipRank = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap chiet khau: ");
    this.discount = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + "\nHan VIP: " + this.vipRank + "\nChiet khau: " + this.discount;
  }
}
