package Bai14;

import java.util.Scanner;

public class Person {
  private String fullName;
  private int birthYear;
  private String hometown;

  public Person() {
  }

  public Person(String fullName, int birthYear, String hometowm) {
    this.fullName = fullName;
    this.birthYear = birthYear;
    this.hometown = hometowm;
  }

  public void isvalidateBirthYear() throws InvalidBrithYearException {
    String year = String.valueOf(this.birthYear);
    if (year.trim().length() < 4) {
      throw new InvalidBrithYearException("Nam sinh khong hop le.");
    }
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Enter full name: ");
    this.fullName = sc.nextLine();

    System.out.print("Enter birth year: ");
    this.birthYear = Integer.parseInt(sc.nextLine());

    System.out.print("Enter hometown: ");
    this.hometown = sc.nextLine();
  }

  @Override
  public String toString() {
    return "Full Name: " + fullName + "\n" +
        "Birth Year: " + birthYear + "\n" +
        "Hometown: " + hometown;
  }
}
