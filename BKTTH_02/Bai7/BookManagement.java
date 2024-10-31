package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (n < 2 || n > 50) {
      try {
        System.out.print("Nhap so luong sach (2 <= n <= 50): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }

    ArrayList<TextBook> listBook = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      try {
        TextBook textBook = new TextBook();
        textBook.inputBook(sc);

        textBook.isValidBookInfo();
        listBook.add(textBook);
      } catch (EmptyInputException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      } finally {
        if (i == n - 1) {
          sc.close();
        }
      }
    }

    boolean found = false;
    for (TextBook x : listBook) {
      if (x.getSubject().equals("Toan")) {
        found = true;
        System.out.println(x.toString());
      }
    }

    if (!found)
      System.out.println("Khong co sach giao khoa mon toan.");
  }
}
