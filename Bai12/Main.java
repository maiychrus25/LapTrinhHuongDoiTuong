package Bai12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			MobilePhoneCustomer[] mp = new MobilePhoneCustomer[2];
			for (int i = 0; i < 2; ++i) {
				mp[i] = new MobilePhoneCustomer();
				mp[i].input(sc);
				mp[i].phoneBill.isValidateNumber();
			}
			
			for (int i = 0; i < 2; ++i) 
				System.out.println(mp[i].toString());
			
		}
		catch (NumberFormatException ex) {
			System.out.println("Nhap so hop le.");
		}
		catch (InvalidPhoneUsageException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
