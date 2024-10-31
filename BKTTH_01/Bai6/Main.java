//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai6/Main.java
package BKTTH_01.Bai6;
=======
//Created: 29.09.2024
package Bai6;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai6/Main.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			TextBook tb = new TextBook();
			tb.input(sc);
			
			if (!tb.isValidPublicYear()) {
				throw new InvalidPublicationYearException("Sach giao khoa chi duoc xuat ban trong thoi gian 5 nam gan day.");
			}
				
			System.out.println(tb.toString());
		} 
		catch (InputMismatchException ex) {
			System.out.println("Vui long nhap nam xuat ban hop le");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		sc.close();
	}
}
