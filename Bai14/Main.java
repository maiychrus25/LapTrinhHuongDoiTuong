package Bai14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            CuocHenKhachHang cuocHen = new CuocHenKhachHang();
            cuocHen.input(sc);
            cuocHen.isValidThoiGian();
            
            System.out.println("\nThong tin cuoc hen:");
            System.out.println(cuocHen.toString());
        } 
        catch (InvalidTimeException ex) {
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
