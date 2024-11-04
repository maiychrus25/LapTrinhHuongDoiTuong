package BKTTH_02.Bai5;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

package BKTTH_02.Bai5;

import java.time.LocalDate;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:14:55 PM
**/

import java.util.Scanner;

public class MotoBike {
  private String licensePlate;
  private String brand;
  private int yearOfManufacture;

  public MotoBike() {
  }

  public MotoBike(String licensePlate, String brand, int yearOfManufacture) {
    this.licensePlate = licensePlate;
    this.brand = brand;
    this.yearOfManufacture = yearOfManufacture;
  }

  public void validateYearOfManufacture() throws InvalidYearException {
    LocalDate time = LocalDate.now();
    int year = time.getYear();

    if (this.yearOfManufacture > year)
      throw new InvalidYearException("Nam san xuat khong hop le.");
  }

  public void isValidateInput() throws EmptyInputException {
    if (this.licensePlate.trim().isEmpty() || this.brand.trim().isEmpty())
      throw new EmptyInputException("Cac truong khong duoc de trong.");
  }

  public int getYearOfManufacture() {
    return this.yearOfManufacture;
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap bien so xe: ");
    this.licensePlate = sc.nextLine();

    System.out.print("Nhap hang xe: ");
    this.brand = sc.nextLine();

    System.out.print("Nhap nam san xuat: ");
    this.yearOfManufacture = Integer.parseInt(sc.nextLine());
  }

  @Override
  public String toString() {
    return "Bien so xe: " + this.licensePlate + "\n" +
        "Hang: " + this.brand + "\n" +
        "Nam san xuat: " + this.yearOfManufacture;
  }
}
