//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai5/Manager.java
package BKTTH_01.Bai5;
=======
//Created: 29.09.2024
package Bai5;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai5/Manager.java

public class Manager extends User {
	public Manager () {}
	
	public Manager (String managerName, int managerAge, String managerEmail) {
		super(managerName, managerAge, managerEmail);
	}
	
	@Override
	public void isValidAge() throws InvalidAgeException {
		if (this.userAge < 25) 
			throw new InvalidAgeException("Tuoi cua quan ly phai tu 25 tro len.");
	}
	
	@Override 
	public String toString() {
		return super.toString();
	}
}
