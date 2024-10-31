//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai4/Main.java
package BKTTH_01.Bai4;
=======
//Created: 29.09.2024
package Bai4;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai4/Main.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void  validatePositiveNumber(double num) throws NegativeLengthException {
		if (num <= 0) 
			throw new NegativeLengthException("Vui long nhap chieu dai lon hon 0.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			double length = sc.nextDouble();
			validatePositiveNumber(length);
			
			Square square = new Square(length);
			System.out.println(square.toString());
		}
		catch (NegativeLengthException ex) {
			 System.out.println(ex.getMessage());
		}
		catch (InputMismatchException ex) {
			System.out.println("Vui long nhap vao mot so hop le.");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		sc.close();
	}
}
