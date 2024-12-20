<<<<<<< HEAD:BKTTH_01/Bai9/WaterBill.java
//Author: MAIY 07!!
package BKTTH_01.Bai9;
=======
/**
*    Author:  MAIY07!!
*    Created: Oct 28, 2024 10:12:24 PM
**/
package Bai9;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai9/WaterBill.java

import java.util.Scanner;

public class WaterBill {
    private int oldIndex;           
    private int newIndex;           

    public WaterBill() {}
    
    public WaterBill(int oldIndex, int newIndex) {
    	this.oldIndex = oldIndex;
    	this.newIndex = newIndex;
    }
    
    // function handle oldIndex and newIndex is invalid
    public void isValidateIndex() throws NegativeIndexException {
    	if (this.oldIndex < 0 || this.newIndex < 0) throw new NegativeIndexException("So dien khong duoc nho hon 0.");
    }
    
    public void isValidateDiffIndex() throws NewIndexLessThanOldIndexException {
    	if (this.newIndex < this.oldIndex) throw new NewIndexLessThanOldIndexException("So moi khong duoc nho hon so cu");
    }
    
    public double calcTotalAmount() {
    	return (this.newIndex - this.oldIndex) * 25000;
    }
    
    public void input(Scanner sc) {
        System.out.print("Nhap chi so cu: ");
        this.oldIndex = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap chi so moi: ");
        this.newIndex = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
    	return "Chi so cu: " + this.oldIndex + "\nChi so moi: " + this.newIndex + "\nTong tien dien: " + String.format("%.2f", this.calcTotalAmount());
    }
}
