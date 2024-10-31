package Bai13;

import java.util.Scanner;

public class Person {
  private String personId;
  private String fullName;
  private int age;

  public Person() {
  }

  public Person(String personId, String fullName, int age) {
    this.personId = personId;
    this.fullName = fullName;
    this.age = age;
  }

  public void inputInfo(Scanner sc) throws EmptyInputException {
    System.out.print("Nhap ma nhan khau: ");
    this.personId = sc.nextLine();

    if (this.personId.trim().isEmpty()) {
      throw new EmptyInputException("Ma nhan khau khong duoc de trong.");
    }

    System.out.print("Nhap ho ten: ");
    this.fullName = sc.nextLine();

    if (this.fullName.trim().isEmpty()) {
      throw new EmptyInputException("Ho ten khong duoc de trong.");
    }

    System.out.print("Nhap tuoi: ");
    this.age = Integer.parseInt(sc.nextLine());

    if (this.age < 0) {
      throw new NumberFormatException("Tuoi khong hop le.");
    }
  }

  @Override
  public String toString() {
    return "Mã nhân khẩu: " + this.personId + "\n" +
        "Họ tên: " + this.fullName + "\n" +
        "Tuổi: " + this.age;
  }
}
