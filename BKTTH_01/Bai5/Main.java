//Author: MAIY 07!!
package BKTTH_01.Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        
        try {
            manager.input(sc); 
            manager.isValidAge();
            
            manager.isValidEmail();
            System.out.println(manager);
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        finally {
            sc.close(); 
        }
    }
}
