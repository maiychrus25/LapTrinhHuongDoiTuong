// package BKTTH_02.Bai6;

import java.util.Scanner;

public class HighSchoolStudent extends Student {
  private double physicsScore;
  private double chemistryScore;

  private final int LEN = 4;

  public HighSchoolStudent() {
  }

  public HighSchoolStudent(String name, double mathScore, double literatureScore, double physicsScore,
      double chemistryScore) {
    super(name, mathScore, literatureScore);
    this.physicsScore = physicsScore;
    this.chemistryScore = chemistryScore;
  }

  @Override
  public void isValidateScore() throws InvalidScoreException {
    super.isValidateScore();
    if (this.physicsScore < 0 || this.physicsScore > 10)
      throw new InvalidScoreException("Diem ly khong hop le.");

    if (this.chemistryScore < 0 || this.chemistryScore > 10)
      throw new InvalidScoreException("Diem hoa khong hop le.");
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);
    System.out.print("Nhap diem ly: ");
    this.physicsScore = Double.parseDouble(sc.nextLine());

    System.out.print("Nhap diem hoa: ");
    this.chemistryScore = Double.parseDouble(sc.nextLine());
  }

  public double calcAverageScoree() {
    double totalScore = super.getMathScore() + super.getLiteratureScore() + this.physicsScore + this.chemistryScore;
    return totalScore / LEN;
  }

  @Override
  public String toString() {
    return super.toString() + "\nDiem ly: " + this.physicsScore + "\nDiem hoa: " + this.chemistryScore
        + "\nDiem trung binh: " + String.format("%,2f", this.calcAverageScoree());
  }
}
