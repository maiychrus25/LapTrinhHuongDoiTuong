package Bai10;

import java.util.Scanner;

public class Department {
  private String apartmentId;
  private double area;
  private double rentalPrice;

  public Department() {
  }

  public Department(String apartmentId, double area, double rentalPrice) {
    this.apartmentId = apartmentId;
    this.area = area;
    this.rentalPrice = rentalPrice;
  }

  public double getArea() {
    return this.area;
  }

  public void isValidDepartmentInfo() throws EmptyInputException {
    if (this.apartmentId.trim().isEmpty()) {
      throw new EmptyInputException("Ma can ho khong duoc de trong.");
    }
  }

  public void isValidArea() throws InvalidAreaException {
    if (this.area <= 0) {
      throw new InvalidAreaException("Dien tich phai lon hon 0.");
    }
  }

  public void isValidRentalPrice() throws InvalidRentalPriceException {
    if (this.rentalPrice <= 0) {
      throw new InvalidRentalPriceException("Gia thue phai lon hon 0.");
    }
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap ma can ho: ");
    this.apartmentId = sc.nextLine();

    System.out.print("Nhap dien tich: ");
    this.area = Double.parseDouble(sc.nextLine());

    System.out.print("Nhap gia thue: ");
    this.rentalPrice = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return "Ma can ho: " + this.apartmentId + "\nDien tich: "
        + this.area + "\nGia thue: " + this.rentalPrice;
  }
}