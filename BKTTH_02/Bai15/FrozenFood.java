package Bai15;

import java.util.Scanner;

public class FrozenFood extends FoodItem {
  private int expirationDate;
  private double storageTemperature;

  public FrozenFood() {
    super();
  }

  public FrozenFood(String foodCode, String foodName, double price, int expirationDate, double storageTemperature) {
    super(foodCode, foodName, price);
    this.expirationDate = expirationDate;
    this.storageTemperature = storageTemperature;
  }

  public void isvalidateInfo() throws InvalidNumberException {
    if (this.expirationDate < 0)
      throw new InvalidNumberException("Thoi gian su dung khong hop le.");

    if (this.storageTemperature < 0)
      throw new InvalidNumberException("Nhiet do bao quan khong hop le.");
  }

  public int getExpirationDate() {
    return this.expirationDate;
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);

    System.out.print("Nhap vao han su dung: ");
    this.expirationDate = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap vao nhiet do bao quan: ");
    this.storageTemperature = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Expiration Date: " + expirationDate + " days\n" +
        "Storage Temperature: " + storageTemperature + " °C";
  }
}
