//Author: MAIY 07!!
package BKTTH_01.Bai15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            SinhVienDuAn sinhVienDuAn = new SinhVienDuAn();
            sinhVienDuAn.input(sc);
            sinhVienDuAn.isValidateGpa();
            
            System.out.println("\nThong tin sinh vien du an:");
            System.out.println(sinhVienDuAn.toString());
        } 
        catch (InvalidGradeException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
