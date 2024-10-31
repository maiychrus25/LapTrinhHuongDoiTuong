package Bai13;

import java.util.Scanner;

public class TemporaryResident extends Person {
  private String temporaryAddress;
  private int stayDuration;

  public TemporaryResident() {
  }

  public TemporaryResident(String personId, String fullName, int age, String temporaryAddress, int stayDuration) {
    super(personId, fullName, age);
    this.temporaryAddress = temporaryAddress;
    this.stayDuration = stayDuration;
  }

  public int getStayDuration() {
    return this.stayDuration;
  }

  @Override
  public void inputInfo(Scanner sc) throws EmptyInputException {
    super.inputInfo(sc);

    System.out.print("Nhập địa chỉ tạm trú: ");
    this.temporaryAddress = sc.nextLine();

    if (this.temporaryAddress.trim().isEmpty()) {
      throw new EmptyInputException("Địa chỉ tạm trú không được để trống.");
    }

    System.out.print("Nhập thời gian tạm trú (tháng): ");
    this.stayDuration = Integer.parseInt(sc.nextLine());

    if (this.stayDuration <= 0) {
      throw new NumberFormatException("Thời gian tạm trú không hợp lệ.");
    }
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Địa chỉ tạm trú: " + this.temporaryAddress + "\n" +
        "Thời gian tạm trú: " + this.stayDuration + " tháng";
  }
}
