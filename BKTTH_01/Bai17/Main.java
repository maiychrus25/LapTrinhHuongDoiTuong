//Author: MAIY 07!!
package BKTTH_01.Bai17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Sphere sphere = new Sphere();
            sphere.inputRadius(sc);

            sphere.isValidateRadius();
            System.out.println(sphere.toString());
        } 
        catch (InvalidRadiusException ex) {
            System.out.println(ex); 
        } 
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
