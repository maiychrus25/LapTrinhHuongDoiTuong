package Bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            SpecializedClassroom specializedClass = new SpecializedClassroom();
            specializedClass.input(sc);
            
            specializedClass.validateStudentCount();
            System.out.println(specializedClass.toString());
        } 
        catch (NumberFormatException ex) {
            System.out.println("Please enter a valid number for student count.");
        } 
        catch (InvalidStudentCountException ex) {
            System.out.println(ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
