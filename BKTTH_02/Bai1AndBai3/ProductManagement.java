package BKTTH_02.Bai1AndBai3;

import java.util.Arrays;
import java.util.Scanner;

public class ProductManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong: ");
		int n = Integer.parseInt(sc.nextLine());
		
		MobilePhone[] dienThoai = new MobilePhone[n];
		
		try {
			while (n < 2 || n > 50) {
				System.out.print("Nhap lai: ");
				n = Integer.parseInt(sc.nextLine());
			}
			dienThoai = new MobilePhone[n];
			
			for (int i = 0; i < n; ++i) {
				dienThoai[i] = new MobilePhone();
				dienThoai[i].nhapThongTin(sc);
				dienThoai[i].isValidatePriceAndQuantity();
			}
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		catch (InvalidPriceOrQuantityException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
		
		Arrays.sort(dienThoai, new SortByProductName());
		for (int i = 0; i < n; ++i) {
			System.out.println(dienThoai[i].toString());
		}
		
		for (int i = 0; i < n; ++i) {
			if (dienThoai[i].getGiaThanh() >= 10000000) {
				System.out.println(dienThoai[i].toString());
			}
		}
	}
}
