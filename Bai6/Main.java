package Bai6;

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
