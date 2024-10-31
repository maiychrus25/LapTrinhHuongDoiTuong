//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai7/Main.java
package BKTTH_01.Bai7;
=======
//Created: 29.09.2024
package Bai7;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai7/Main.java

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
