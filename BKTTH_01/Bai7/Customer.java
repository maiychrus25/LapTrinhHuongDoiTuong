//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai7/Customer.java
package BKTTH_01.Bai7;
=======
//Created: 29.09.2024
package Bai7;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai7/Customer.java

import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;

    public Customer() {}

    public Customer(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void isValidPhoneNumber() throws InvalidPhoneNumberException {
        String regex = "^[0-9]{10}$";
        if (!Pattern.matches(regex, this.phoneNumber)) 
            throw new InvalidPhoneNumberException("Vui lòng nhập số điện thoại hợp lệ.");
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên khách hàng: ");
        this.name = sc.nextLine();

        System.out.print("Nhập số điện thoại khách hàng: ");
        this.phoneNumber = sc.nextLine(); 

    	System.out.print("Nhập địa chỉ khách hàng: ");
        this.address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Tên khách hàng: " + this.name + "\nSố điện thoại: " + this.phoneNumber + "\nĐịa chỉ: " + this.address;
    }
}
