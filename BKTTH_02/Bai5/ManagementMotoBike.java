package BKTTH_02.Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementMotoBike {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (n < 10 || n > 100) {
      try {
        System.out.print("Enter the number of motorcycles (10 <= n <= 100): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }

    ArrayList<ElectricBicycle> bikeList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      try {
        ElectricBicycle bike = new ElectricBicycle();
        bike.inputInfo(sc);

        bike.isValidateInput();
        bike.isValidBatteryAndChargingTime();

        bike.validateYearOfManufacture();
        bikeList.add(bike);
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      } catch (EmptyInputException | InvalidYearException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidBatteryException ex) {
        System.out.println(ex.getMessage());
      } finally {
        if (i == n - 1) {
          sc.close();
        }
      }
    }

    System.out.println("Motorbikes manufactured from 2020 onwards:");
    boolean found = false;
    for (MotoBike bike : bikeList) {
      if (bike.getYearOfManufacture() >= 2020) {
        found = true;
        System.out.println(bike.toString());
      }
    }

    if (!found) {
      System.out.println("No motorcycles manufactured from 2020 onwards.");
    }

    sc.close();
  }
}
