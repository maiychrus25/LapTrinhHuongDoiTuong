package Bai12;

import java.util.Scanner;

public class SavingAccount extends Account {
  private int term;
  private double interestRate;

  public SavingAccount() {
  }

  public SavingAccount(String accountName, String accountHolderName,
      double ballance, int term, double interestRate) {
    super(accountName, accountHolderName, ballance);
    this.term = term;
    this.interestRate = interestRate;
  }

  public void isvalidateTerm() throws InvalidTermException {
    if (this.term <= 0)
      throw new InvalidTermException("Ky han gui khong hop le.");
  }

  public void isvalidateRate() throws InvalidRateException {
    if (this.interestRate <= 0)
      throw new InvalidRateException("Lai suat khong hop le.");
  }

  @Override
  public void inputInfo(Scanner sc) {
    System.out.print("Nhap va ky han gui (thang): ");
    this.term = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap lai xuat gui: ");
    this.interestRate = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + "\nKy han gui: " + this.term
        + "\nLai xuat gui: " + this.interestRate;
  }
}
