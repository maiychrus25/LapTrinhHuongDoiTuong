package BKTTH_02.Bai5;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 1:27:08 PM
**/

import java.util.Scanner;

public class ElectricBicycle extends MotoBike {
  private int batteryCapacity;
  private int chargingTime;

  public ElectricBicycle() {
  }

  public ElectricBicycle(String licensePlate, String brand, int yearOfManufacture, int batteryCapacity,
      int chargingTime) {
    super(licensePlate, brand, yearOfManufacture);
    this.batteryCapacity = batteryCapacity;
    this.chargingTime = chargingTime;
  }

  public void isValidBatteryAndChargingTime() throws InvalidBatteryException {
    if (this.batteryCapacity < 0)
      throw new InvalidBatteryException("Dung luong pin phai la so nguyen >= 0.");

    if (this.chargingTime < 0)
      throw new InvalidBatteryException("Thoi gian sac phai la so nguyen >= 0.");
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);

    System.out.print("Nhap dung luong pin: ");
    this.batteryCapacity = Integer.parseInt(sc.nextLine());

    System.out.print("Nhap thoi gian sac: ");
    this.chargingTime = Integer.parseInt(sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + "\nDung luong pin: " + this.batteryCapacity
        + "\nThoi gian sac: " + this.chargingTime;
  }
}
