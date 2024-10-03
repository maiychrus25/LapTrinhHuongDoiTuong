package Bai12;

import java.util.Scanner;

public class PhoneBill {
    private int callMinutes;
    private int messageCount;

    public PhoneBill() {}

    public void input(Scanner sc) {        
    	System.out.print("Nhap so phut goi: ");
    	this.callMinutes = Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Nhap so luong tin nhan: ");
    	this.messageCount = Integer.parseInt(sc.nextLine());
    }

    public void isValidateNumber() throws InvalidPhoneUsageException {
    	if (this.callMinutes < 0) 
    		throw new InvalidPhoneUsageException("So phut goi khong duoc nho hon 0.");
    	
    	if (this.messageCount < 0) 
    		throw new InvalidPhoneUsageException("So luong tin nhan khong duoc nho hon 0.");
    }
    
    private long calculateTotalAmount() {
    	return (callMinutes * 1500) + (messageCount * 500);
    }

    @Override
    public String toString() {
        return "Call Minutes: " + callMinutes + 
               "\nMessage Count: " + messageCount + 
               "\nTotal Amount: " + this.calculateTotalAmount() + " VND";
    }
}
