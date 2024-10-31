//Author: MAIY 07!!
package BKTTH_01.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LopCLC lopChuyenLop = new LopCLC();
        
        try {
            lopChuyenLop.nhapThongTin(sc);
            if (!lopChuyenLop.kiemTraSoLuongHocSinh()) {
                throw new Exception("So luong hoc sinh khong hop le. Phai tu 20 tro len.");
            }
            lopChuyenLop.hienThiThongTin();
        } 
        catch (NumberFormatException ex) {
            System.out.println("Vui long nhap so hop le cho so luong hoc sinh va so ban ghe.");
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
