package Bai10;

import java.util.Scanner;

public class DepartmentVIP extends Department {
  private int floorCount;
  private String amenities;

  public DepartmentVIP() {
  }

  public DepartmentVIP(String apartmentId, double area,
      double rentalPrice, int floorCount, String amenities) {
    super(apartmentId, area, rentalPrice);
    this.floorCount = floorCount;
    this.amenities = amenities;
  }

  public void isValidFloor() throws InvalidNumberException {
    if (this.floorCount < 0)
      throw new InvalidNumberException("So tang khong hop le.");
  }

  public void isValidAmentity() throws EmptyInputException {
    if (this.amenities.trim().isEmpty()) {
      throw new EmptyInputException("Tien ich bo sung khong duoc de trong.");
    }
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);

    System.out.print("Nhap so tang: ");
    this.floorCount = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap tien ich bo sung: ");
    this.amenities = sc.nextLine();
  }

  @Override
  public String toString() {
    return super.toString() + "\nSo tang: " + this.floorCount + "\nTien ich bo sung: " + this.amenities;
  }
}