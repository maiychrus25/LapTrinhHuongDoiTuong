/**
*    Author:  MAIY07!!
*    Created: Oct 28, 2024 10:12:24 PM
**/
package Bai9;

import java.util.Scanner;

public class WaterCustomer {
    private String householdName; 
    private String houseNumber;   
    private String meterId;        
    public WaterBill waterBill;
    
    public WaterCustomer() {
    	this.waterBill = new WaterBill();
    }
    
    public WaterCustomer(String householdName, String houseNumber, String meterId, WaterBill waterBill) {
    	this.householdName = householdName;
    	this.houseNumber = houseNumber;
    	this.meterId = meterId;
    	this.waterBill = waterBill;
    }
    
    public void input(Scanner sc) {
        System.out.print("Nhap ho ten chu ho: ");
        this.householdName = sc.nextLine();

        System.out.print("Nhap so nha: ");
        this.houseNumber = sc.nextLine();

        System.out.print("Nhap ma so dong ho nuoc: ");
        this.meterId = sc.nextLine();
        
        this.waterBill.input(sc);
    }

    @Override
    public String toString() {
    	return "\nTen chu ho: " + this.householdName + "\nMa so nha: " + this.houseNumber
    			+ "\nMa so dong ho: " + this.meterId + "\n" + waterBill.toString();
    }
}
