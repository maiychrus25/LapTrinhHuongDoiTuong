//Author: MAIY 07!!
package BKTTH_01.Bai8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			DiscountProduct dp = new DiscountProduct();
			dp.input(sc);
			
			dp.isValidPrice();
			dp.isValidQuantity();
			System.out.println(dp.toString());
		}
		catch (NumberFormatException ex) {
			System.out.println("Vui long nhap vao gia tri hop le cho gia va so luong.");
		} 
		catch (InvalidPriceException | InvalidQuantityException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
