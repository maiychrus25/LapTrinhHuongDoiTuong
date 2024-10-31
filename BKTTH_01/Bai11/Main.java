//Author: MAIY 07!!
package BKTTH_01.Bai11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			CarRentalCustomer[]  carRC = new CarRentalCustomer[2];
			for (int i = 0; i < 2; ++i) {
				carRC[i] = new CarRentalCustomer();
				carRC[i].input(sc);
				
				carRC[i].carRentalRecipt.isValidateHoursRetal();
			}
			
			for (int i = 0; i < 2; ++i) {
				System.out.println(carRC[i].toString());
			}
		}
		catch (NumberFormatException ex) {
			System.out.println("Vui long nhap gia tri hop le cho so gio thue.");
		}
		catch (InvalidRentalHoursException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
