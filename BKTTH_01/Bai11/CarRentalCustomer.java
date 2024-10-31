//Author: MAIY 07!!
package BKTTH_01.Bai11;

import java.util.Scanner;

public class CarRentalCustomer {
    private String name;
    private String carCode;

    private String carLicense;
    public CarRentalRecipt carRentalRecipt;

    public CarRentalCustomer () {
    	this.carRentalRecipt = new CarRentalRecipt();
    }

    public CarRentalCustomer(String name, String carCode, String carLicense) {
        this.name = name;
        this.carCode = carCode;
        this.carLicense = carLicense;
        this.carRentalRecipt = new CarRentalRecipt();
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ten khach hang: ");
        this.name = sc.nextLine();

        System.out.print("Nhap ma so xe: ");
        this.carCode = sc.nextLine();

        System.out.print("Nhap so giay phep lai xe: ");
        this.carLicense = sc.nextLine();

        carRentalRecipt.input(sc);
    }

    @Override
    public String toString() {
        return "Ten khach hang: " + this.name + 
               "\nMa so xe: " + this.carCode + 
               "\nSo giay phep lai xe: " + this.carLicense + 
               "\n" + this.carRentalRecipt.toString();
    }
}
