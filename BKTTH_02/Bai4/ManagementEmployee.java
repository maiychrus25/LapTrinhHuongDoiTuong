package BKTTH_02.Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
*    Author:  MAIY07!!
*    Created: Oct 31, 2024 12:21:00 PM
**/

public class ManagementEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		while (n < 5 || n > 100) {
			try {
				System.out.print("Nhap n (5 <= n <= 100): ");
				n = Integer.parseInt(sc.nextLine());
			} 
			catch (NumberFormatException ex) {
				System.out.print("Dau vao khong hop le: " + ex.getMessage());
			}
		}
		ArrayList <AccountingEmployee> listEmployee = new ArrayList <>();
		
		for (int i = 0; i < n; ++i) {
			try {
				AccountingEmployee em = new AccountingEmployee();
				em.inputEmployee(sc);
				
				listEmployee.add(em);
				em.isValidateInput();
				
				em.isValidateExperience();
				listEmployee.add(em);
			}
			catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
			catch (InvalidExperienceException | EmptyInputException ex) {
				System.out.println(ex.getMessage());
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			finally {
				if (i == n - 1) {
					sc.close();
				}
			}
		}
		
		boolean found = false;
		for (int i = 0; i < n; ++i) {
			if (listEmployee.get(i).getPosition().equals("Ke toan")) {
				found = true;
				System.out.println(listEmployee.get(i).toString());
			}
		}
		
		if (!found) System.out.println("Khong co nhan vien co chuc vu ke toan.");
	}
}
