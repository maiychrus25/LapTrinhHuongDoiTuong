package Bai12;

import java.util.Scanner;

public class MobilePhoneCustomer {
    private String fullName;
    private String phoneNumber;
    
    private String contractCode;
    public PhoneBill phoneBill;

    public MobilePhoneCustomer() {
        this.phoneBill = new PhoneBill();
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        this.fullName = sc.nextLine();

        System.out.print("Nhap so dien thoai: ");
        this.phoneNumber = sc.nextLine();

        System.out.print("Nhap ma hop dong: ");
        this.contractCode = sc.nextLine();

        phoneBill.input(sc);
    }

    @Override
    public String toString() {
        return "Ho ten: " + this.fullName +
               "\nSo dien thoai: " + this.phoneNumber +
               "\nMa hop dong: " + this.contractCode +
               "\n" + phoneBill.toString();
    }
}
