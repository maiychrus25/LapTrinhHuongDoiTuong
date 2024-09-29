//Author: MAIY 07!!
//Created: 29.09.2024
package Bai1;

import java.util.Scanner;

public class Main {
    
    public static void validateManager(Manager manager) throws AgeNotEligibleException, InvalidEmailException {
        if (!manager.isValidAge()) {
            throw new AgeNotEligibleException("Tuoi phai tu 25 tro len.");
        }
        if (!manager.isValidEmail()) {
            throw new InvalidEmailException("Email khong hop le.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();

            System.out.print("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap dia chi: ");
            String diaChi = sc.nextLine();

            System.out.print("Nhap so dien thoai: ");
            String soDienThoai = sc.nextLine();

            System.out.print("Nhap email: ");
            String email = sc.nextLine();

            Manager manager = new Manager(ten, tuoi, diaChi, soDienThoai, email);
            validateManager(manager);

            System.out.println("\nThong tin quan ly:");
            System.out.println(manager);

        } 
        catch (AgeNotEligibleException | InvalidEmailException ex) {
            System.out.println(ex.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Vui long nhap so hop le cho tuoi.");
        } 
        finally {
            sc.close();
        }
    }
}
