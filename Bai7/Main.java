//Author: MAIY 07!!
//Created: 29.09.2024
package Bai7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			CustomerVIP customer = new CustomerVIP();
			customer.input(sc);
			
			customer.isValidPhoneNumber();
			System.out.println(customer.toString());
		}
		catch (InvalidPhoneNumberException ex){
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
