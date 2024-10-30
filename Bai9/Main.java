/**
*    Author:  MAIY07!!
*    Created: Oct 28, 2024 10:12:24 PM
**/
package Bai9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			WaterCustomer wc = new WaterCustomer();
			wc.input(sc);
			
			wc.waterBill.isValidateIndex();
			wc.waterBill.isValidateDiffIndex();
			System.out.println(wc.toString());
		}
		catch (NumberFormatException ex) {
			System.out.println("Vui long nhap dung du lieu cho chi so dien.");
		}
		catch (NegativeIndexException ex) {
			System.out.println(ex.getMessage());
		}
		catch (NewIndexLessThanOldIndexException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
