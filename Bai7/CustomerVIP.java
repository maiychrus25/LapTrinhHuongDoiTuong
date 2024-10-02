package Bai7;

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
