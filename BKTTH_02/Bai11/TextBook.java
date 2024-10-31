package Bai11;

import java.util.Scanner;

public class TextBook extends Book {
  private String subject;
  private String schoolLevel;

  public TextBook() {
  }

  public TextBook(String bookId, String bookName, double price, String subject, String schoolLevel) {
    super(bookId, bookName, price);
    this.subject = subject;
    this.schoolLevel = schoolLevel;
  }

  public String getSubject() {
    return this.subject;
  }

  @Override
  public void isValidBookInfo() throws EmptyInputException {
    super.isValidBookInfo();
    if (this.subject.trim().isEmpty())
      throw new EmptyInputException("Ten mon hoc khong hop le.");

    if (this.schoolLevel.trim().isEmpty())
      throw new EmptyInputException("Ten lop hoc khong hop le.");
  }

  @Override
  public void inputBook(Scanner sc) {
    super.inputBook(sc);
    System.out.print("Nhap ten mon hoc: ");
    this.subject = sc.nextLine();

    System.out.print("Nhap cap do hoc: ");
    this.schoolLevel = sc.nextLine();
  }

  @Override
  public String toString() {
    return super.toString() + "\nTen mon hoc: " + this.subject + "\nCap do: " +
        this.schoolLevel;
  }
}
