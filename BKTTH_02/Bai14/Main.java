package Bai14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      System.out.println("Entering information for employee " + (i + 1) + ":");
      try {
        Employee employee = new Employee();

        employee.inputInfo(sc);
        employee.isvalidateSalary();

        employee.isvalidateBirthYear();
        employees.add(employee);
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidSalaryException | InvalidBrithYearException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }

    System.out.println("\nEmployees born before 1980:");
    for (Employee employee : employees) {
      if (employee.getBirthYear() < 1980) {
        System.out.println(employee);
      }
    }
  }
}
