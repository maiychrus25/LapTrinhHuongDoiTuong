package BKTTH_02.Bai6;

import java.util.Scanner;

/**
 * Author: MAIY07!!
 * Created: Oct 31, 2024 2:00:00 PM
 **/

public class Student {
  private String studentId;
  private String studentName;

  private double mathScore;
  private double literatureScore;
  private static int cnt = 0;

  public Student() {
  }

  public Student(String studentName, double mathScore, double literatureScore) {
    this.studentId = "HS" + String.format("%03d", ++cnt);
    this.studentName = studentName;

    this.mathScore = mathScore;
    this.literatureScore = literatureScore;
  }

  public double getMathScore() {
    return this.mathScore;
  }

  public double getLiteratureScore() {
    return this.literatureScore;
  }

  // method check is name valid
  public void isValidName() throws EmptyInputException {
    if (this.studentName.trim().isEmpty()) 
      throw new EmptyInputException("Ten khong duoc de trong.");
  }

  // method check score is valid
  public void isValidateScore() throws InvalidScoreException {
    if (this.mathScore < 0 || this.mathScore > 10)
      throw new InvalidScoreException("Diem toan khong hop le.");

    if (this.literatureScore < 0 || this.literatureScore > 10)
      throw new InvalidScoreException("Diem van khong hop le.");
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap ten sinh vien: ");
    this.studentName = sc.nextLine();

    System.out.print("Nhap diem toan: ");
    this.mathScore = Double.parseDouble(sc.nextLine());

    System.out.print("Nhap diem van: ");
    this.literatureScore = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return "Ma sinh vien: " + this.studentId + "\n" +
        "Ten sinh vien: " + this.studentName + "\n" +
        "Diem toan: " + this.mathScore + "\n" +
        "Dime van: " + this.literatureScore;
  }
}
