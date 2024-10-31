package Bai13;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (n < 2 || n > 50) {
      try {
        System.out.print("Nhap so luong nhan khau (2 <= n <= 50): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println("Vui long nhap mot so hop le.");
      }
    }

    ArrayList<TemporaryResident> personList = new ArrayList<>();

    for (int i = 0; i < n; ++i) {
      try {
        TemporaryResident tempRes = new TemporaryResident();
        tempRes.inputInfo(sc);
        personList.add(tempRes);
      } catch (NumberFormatException | EmptyInputException ex) {
        System.out.println(ex.getMessage());
        i--; // Giam chi so de yeu cau nhap lai
      }
    }

    System.out.println("Danh sach nhan khau tam tru co thoi gian tam tru tren 6 thang:");
    for (TemporaryResident tempRes : personList) {
      if (tempRes.getStayDuration() > 6) {
        System.out.println(tempRes.toString());
      }
    }

    sc.close();
  }
}