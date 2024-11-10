/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

package Bai7;

import java.util.Scanner;

public class TextBook extends Book {
  private String subject;
  private String className;

  public TextBook() {
  }

  public TextBook(String bookId, String bookName, Author author, String subject, String className) {
    super(bookId, bookName, author);
    this.subject = subject;
    this.className = className;
  }

  public String getSubject() {
    return this.subject;
  }

  @Override
  public void isValidBookInfo() throws EmptyInputException {
    super.isValidBookInfo();
    if (this.subject.trim().isEmpty())
      throw new EmptyInputException("Ten mon hoc khong hop le.");

    if (this.className.trim().isEmpty())
      throw new EmptyInputException("Ten lop hoc khong hop le.");
  }

  @Override
  public void inputBook(Scanner sc) {
    super.inputBook(sc);
    System.out.print("Nhap ten mon hoc: ");
    this.subject = sc.nextLine();

    System.out.print("Nhap ten lop hoc: ");
    this.className = sc.nextLine();
  }

  @Override
  public String toString() {
    return super.toString() + "\nTen mon hoc: " + this.subject + "\nTen lop hoc: " +
        this.className;
  }
}
