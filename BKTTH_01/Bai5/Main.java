//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai5/Main.java
package BKTTH_01.Bai5;
=======
//Created: 29.09.2024
package Bai5;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai5/Main.java

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
