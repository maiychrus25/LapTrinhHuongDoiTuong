//Author: MAIY 07!!
package BKTTH_01.Bai18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        	BienLaiGuiXe receipt = new BienLaiGuiXe();
            for (int i = 1; i <= 2; i++) {
                System.out.println("Customer " + i + ":");
                
                receipt.khachGuiXe = new KhachGuiXe();
                receipt.khachGuiXe.input(sc);
                
                receipt.khachGuiXe.isValidHours();
                System.out.println(receipt.toString());
            }
        } 
        catch (InvalidInputException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
