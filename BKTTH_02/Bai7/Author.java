/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

package Bai7;

import java.util.Scanner;

public class Author {
  private String name;

  Author() {
  }

  Author(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void inputAuthor(Scanner sc) {
    System.out.print("Nhap ten tac gia: ");
    this.name = sc.nextLine();
  }

  @Override
  public String toString() {
    return "Ten tac gia: " + this.name;
  }
}
