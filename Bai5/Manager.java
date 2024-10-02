package Bai5;

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
