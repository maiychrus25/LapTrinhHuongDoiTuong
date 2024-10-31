//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai7/CustomerVIP.java
package BKTTH_01.Bai7;
=======
//Created: 29.09.2024
package Bai7;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai7/CustomerVIP.java

import java.util.regex.Pattern;

public class CustomerVIP extends Customer {
    public CustomerVIP() {}

    public CustomerVIP(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public void isValidPhoneNumber() throws InvalidPhoneNumberException {
        String regexLocal = "^[0-9]{10}$"; 
        String regexInternational = "^\\+84[0-9]{9}$"; 

        String phoneNumber = super.getPhoneNumber();
        if (!Pattern.matches(regexLocal, phoneNumber) && !Pattern.matches(regexInternational, phoneNumber))
        		throw new InvalidPhoneNumberException("Vui long nhap so dien thoai hop le.");
    }
}
