/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

package Bai7;

import java.util.Scanner;

public class Book {
  private String bookId;
  private String bookName;
  private Author author;

  public Book() {
  }

  public Book(String bookId, String bookName, Author author) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.author = author;
  }

  public void isValidBookInfo() throws EmptyInputException {
    if (this.bookId.trim().isEmpty())
      throw new EmptyInputException("Ma sach khong hop le.");

    if (this.bookName.trim().isEmpty())
      throw new EmptyInputException("Ten sach khong hop le");

    if (this.author.getName().trim().isEmpty())
      throw new EmptyInputException("Ten tac gia khong hop le.");
  }

  public void inputBook(Scanner sc) {
    System.out.print("Nhap ma sach: ");
    this.bookId = sc.nextLine();

    System.out.print("Nhap ten sach: ");
    this.bookName = sc.nextLine();

    author.inputAuthor(sc);
  }

  @Override
  public String toString() {
    return "Ma sach: " + this.bookId + "\nTen sach: " + this.bookName
        + "\n" + author.toString();
  }
}
