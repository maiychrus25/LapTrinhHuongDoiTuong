//Author: MAIY 07!!
//Created: 29.09.2024
package BKTTH_01.Bai1;

public class Manager extends Customer {
    public Manager () {}
    
    public Manager(String name, int age, String address, String phoneNumber, String email) {
        super(name, age, address, phoneNumber, email);
    }
    
    @Override
    public boolean isValidAge() {
        return this.getAge() >= 25;
    }
}
