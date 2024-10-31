package BKTTH_02.Bai3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		while (true) {
            try {
                System.out.print("Nhap so luong san pham (2-50): ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 2 || n > 50) {
                    System.out.println("So luong khong hop le.");
                }
                else break;
            } 
            catch (NumberFormatException ex) {
                System.out.println(ex.getMessage() + " Vui long nhap lai.");
            }
        }
		
		boolean found = false;
		ArrayList <MobilePhone> mp = new ArrayList <>();
		
		for (int i = 0; i < n; ++i) {
			try {
				MobilePhone mobile = new MobilePhone();
				mobile.inputProduct(sc);
				
				mobile.isValidatePrice();
				mobile.isValidateQuantity();
				mobile.isValidateWarrantyPeriod();
				
				mp.add(mobile);
				if (mobile.getPrice() >= 10000) found = true;
			} 
			catch (NumberFormatException | InputMismatchException ex) {
				System.out.println(ex.getMessage());
			}
			catch (InvalidPriceException | InvalidQuantityException ex) {
				System.out.println(ex.getMessage());
			}
			catch (InvalidWarrantyPeriodException ex) {
				System.out.println(ex.getMessage());
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		if (!found) System.out.println("Khong co san pham gia cao hon 10 trieu.");
		else {
			System.out.println("Danh sach san pham co gia cao hon 10 trieu: ");
			for (int i = 0; i < mp.size(); ++i) {
				if (mp.get(i).getPrice() >= 10000) {
					System.out.println(mp.get(i).toString());
				}
			}
		}
	}
}
