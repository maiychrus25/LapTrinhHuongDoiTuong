package Bai18;

import java.util.Scanner;

public class KhachGuiXe {
    private String ownerName;
    private String vehicleId;
    private int hours;

    public KhachGuiXe () {}
    
    public KhachGuiXe(String owerName, String vehicleId, int hours) {
    	this.ownerName = owerName;
    	this.vehicleId = vehicleId;
    	this.hours = hours;
    }
    
    public void isValidHours() throws InvalidInputException {
    	if (this.hours < 0) 
    		throw new InvalidInputException("Vui long nhap so gio hop le.");
    }
    
    public void input(Scanner sc) {
        System.out.print("Nhap ten chu xe: ");
        this.ownerName = sc.nextLine();

        System.out.print("Nhap ma so xe: ");
        this.vehicleId = sc.nextLine();

        System.out.print("Nhap so gio gui xe: ");
        this.hours = Integer.parseInt(sc.nextLine());
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Ten chu xe: " + ownerName + 
               "\nMa so xe: " + vehicleId + 
               "\nSo gio gui xe: " + hours;
    }
}
