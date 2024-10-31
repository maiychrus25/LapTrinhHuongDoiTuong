package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<DepartmentVIP> listDepartment = new ArrayList<>();

    int n = 0;
    while (n < 2 || n > 40) {
      System.out.print("Nhap so can ho (2 <= n <= 40): ");
      n = Integer.parseInt(sc.nextLine());
    }

    for (int i = 0; i < n; i++) {
      try {
        DepartmentVIP department = new DepartmentVIP();
        department.inputInfo(sc);

        department.isValidArea();
        department.isValidAmentity();

        department.isValidRentalPrice();
        department.isValidDepartmentInfo();

        department.isValidFloor();
        listDepartment.add(department);
      } catch (EmptyInputException | InvalidAreaException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidRentalPriceException | InvalidNumberException ex) {
        System.out.println(ex.getMessage());
      } catch (NumberFormatException ex) {
        System.out.println("Nhap khong hop le. Vui long nhap so.");
      } finally {
        if (i == n - 1)
          sc.close();
      }
    }

    System.out.println("Cac can ho cao cap co dien tich tren 100m²:");
    for (DepartmentVIP department : listDepartment) {
      if (department.getArea() > 100) {
        System.out.println(department.toString());
      }
    }
  }
}
