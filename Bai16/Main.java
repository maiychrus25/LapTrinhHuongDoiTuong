package Bai16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            GiaoDichThu giaoDichThu = new GiaoDichThu();
            giaoDichThu.input(sc);
            giaoDichThu.isValidateTransaction();
            
            System.out.println("\nThong tin giao dich thu:");
            System.out.println(giaoDichThu.toString());
        } 
        catch (InvalidTransactionException ex) {
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
