//Author: MAIY 07!!
package BKTTH_01.Bai11;

import java.util.Scanner;

public class CarRentalRecipt {
    private int rentalHours;

    public CarRentalRecipt() {}
    
    public CarRentalRecipt(int retalHours) {
    	this.rentalHours = retalHours;
    }

    public void isValidateHoursRetal() throws InvalidRentalHoursException {
    	if (this.rentalHours < 0) throw new InvalidRentalHoursException("Vui long nhap so hop le");
    }
    
    public void input(Scanner sc) {
        System.out.print("Nhap so gio thue: ");
        this.rentalHours = Integer.parseInt(sc.nextLine());
    }

    private int calculateTotalAmount() {
    	return this.rentalHours * 100000;
    }

    @Override
    public String toString() {
        return "So gio thue: " + rentalHours + "\nTong tien phai tra: " + this.calculateTotalAmount() + " VND";
    }
}
