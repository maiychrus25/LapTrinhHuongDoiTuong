package Bai15;

import java.util.Scanner;

public class FoodItem {
  private String foodCode;
  private String foodName;
  private double price;

  public FoodItem() {
  }

  public FoodItem(String foodCode, String foodName, double price) {
    this.foodCode = foodCode;
    this.foodName = foodName;
    this.price = price;
  }

  public void isvalidatePrice() throws InvalidPriceException {
    if (this.price < 0)
      throw new InvalidPriceException("Gia san pham khong hop le.");
  }

  public void inputInfo(Scanner sc) {
    System.out.print("Nhap ma san pham: ");
    this.foodCode = sc.nextLine();

    System.out.print("Nhap va ten san pham: ");
    this.foodName = sc.nextLine();

    System.out.print("Nhap gia san pham: ");
    this.price = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return "Food Code: " + foodCode + "\n" +
        "Food Name: " + foodName + "\n" +
        "Price: " + price;
  }
}