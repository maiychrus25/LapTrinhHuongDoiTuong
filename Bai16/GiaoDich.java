package Bai16;

import java.util.Calendar;
import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich;
    protected String ngayGiaoDich;
    protected double soTien;
    
    public GiaoDich () {}
    
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double soTien) {
    	this.maGiaoDich = maGiaoDich;
    	this.ngayGiaoDich = ngayGiaoDich;
    	this.soTien = soTien;
    }
    
    public void isValidateTransaction() throws InvalidTransactionException {
    	if (this.soTien < 0) 
    		throw new InvalidTransactionException("So tien khong hop le.");
    	
    	String[] parts = this.ngayGiaoDich.split("/");
    	if (parts.length != 3) 
    		throw new InvalidTransactionException("Dinh dang ngay giao dich khong hop le.");
    	
    	int transactionYear = Integer.parseInt(parts[0]);
    	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
       
        if (transactionYear < 0 || transactionYear < currentYear)
        	throw new InvalidTransactionException("Nam giao dich khong hop le.");
        	
        int transactionMonth = Integer.parseInt(parts[1]);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        
        if (transactionMonth < 0 || transactionMonth > currentMonth) 
        	throw new InvalidTransactionException("Thang giao dich khong hop le.");
        
        int transactionDay = Integer.parseInt(parts[2]);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        
        if (transactionDay > currentDay) 
            throw new InvalidTransactionException("Ngay giao dich khong hop le.");
    }

    public void input(Scanner sc)  {
        System.out.print("Nhap ma giao dich: ");
        this.maGiaoDich = sc.nextLine();

        System.out.print("Nhap ngay giao dich (dd/MM/yyyy): ");
        this.ngayGiaoDich = sc.nextLine();

        System.out.print("Nhap so tien: ");
        this.soTien = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Ma giao dich: " + this.maGiaoDich +
               "\nNgay giao dich: " + this.ngayGiaoDich +
               "\nSo tien: " + this.soTien;
    }
}
