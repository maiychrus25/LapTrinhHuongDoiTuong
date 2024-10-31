package Bai11;

import java.util.Scanner;

public class Book {
  private String bookId;
  private String bookName;
  private double price;

  public Book() {
  }

  public Book(String bookId, String bookName, double price) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.price = price;
  }

  public void isValidPriceBook() throws InvalidPriceException {
    if (this.price < 0)
      throw new InvalidPriceException("Gia thanh san pham khong hop le.");
  }

  public void isValidBookInfo() throws EmptyInputException {
    if (this.bookId.trim().isEmpty())
      throw new EmptyInputException("Ma sach khong hop le.");

    if (this.bookName.trim().isEmpty())
      throw new EmptyInputException("Ten sach khong hop le");
  }

  public void inputBook(Scanner sc) {
    System.out.print("Nhap ma sach: ");
    this.bookId = sc.nextLine();

    System.out.print("Nhap ten sach: ");
    this.bookName = sc.nextLine();

    System.out.print("Nhap gia thanh san pham: ");
    this.price = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return "Ma sach: " + this.bookId + "\nTen sach: " + this.bookName
        + "\nGia thanh: " + this.price;
  }
}
