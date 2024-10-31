package Bai9;

import java.util.Scanner;

public class Person {
  private String name;
  private int birthYear;
  private String address;

  public Person() {
  }

  public Person(String name, int birthYear, String address) {
    this.name = name;
    this.birthYear = birthYear;
    this.address = address;
  }

  public void isValidStudentInfo() throws EmptyInputException {
    if (this.name.trim().isEmpty())
      throw new EmptyInputException("Ten khong hop le.");

    if (this.address.trim().isEmpty())
      throw new EmptyInputException("Dia chi khong hop le.");
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap ten nguoi: ");
    this.name = sc.nextLine();

    System.out.print("Nhap nam sinh: ");
    this.birthYear = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap dia chi: ");
    this.address = sc.nextLine();
  }

  @Override
  public String toString() {
    return "Ten: " + this.name + "\nNam sinh: " + this.birthYear
        + "\nDia chi: " + this.address;
  }
}
