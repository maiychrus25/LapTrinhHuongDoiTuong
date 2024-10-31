package BKTTH_02.Bai2AndBai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<EmployeeFullTime> employees = new ArrayList<>();
        int n;

        System.out.print("Nhap so luong nhan vien (2-100): ");
        n = Integer.parseInt(sc.nextLine());

        if (n < 2 || n > 100) {
            System.out.println("So luong nhan vien khong hop le!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            EmployeeFullTime emp = new EmployeeFullTime();
            emp.input(sc);
            
            try {
                emp.isValidateSalary();
                emp.isValidateBonus();
                emp.isValidateFine();
                employees.add(emp);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--; 
            }
        }

        Collections.sort(employees, new SortBySalary());
        System.out.println("\nDanh sach nhan vien:");
        
        for (EmployeeFullTime emp : employees) {
            System.out.println(emp);
        }
        
        sc.close();
    }
}
