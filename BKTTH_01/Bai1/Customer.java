//Author: MAIY 07!!
//Created: 29.09.2024
package BKTTH_01.Bai1;

import java.util.regex.Pattern;

public class Customer {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    public Customer() {}
    
    public Customer(String name, int age, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public int getAge() {
        return this.age;
    }
    
    // method check age and email is valid
    public boolean isValidAge() {
        return this.age >= 18;
    }
    
    public boolean isValidEmail() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, this.email);
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address
                + "\nPhoneNumber: " + this.phoneNumber + "\nEmail: " + this.email;
    }
}
