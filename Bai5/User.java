package Bai5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
	private String userName;
	protected int userAge;
	private String userEmail;
	
	public User() {}
	
	public User(String userName, int userAge, String userEmail) {
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
	}
	
	public void isValidAge() throws InvalidAgeException {
		if (this.userAge < 18) 
			throw new InvalidAgeException("Tuoi nguoi dung phai tu 18 tro len.");
	}
	
	public void isValidEmail() throws InvalidEmailException {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        	if (!Pattern.matches(regex, this.userEmail)) 
        	throw new InvalidEmailException("Email khong hop le.");
	}
	
	public void input(Scanner sc) {
		try {
			System.out.print("Nhap ten nguoi dung: ");
			this.userName = sc.nextLine();
			
			System.out.print("Nhap tuoi nguoi dung: ");
			this.userAge = Integer.parseInt(sc.nextLine());
			
			System.out.print("Nhap email nguoi dung: ");
			this.userEmail = sc.nextLine();
		}
		catch (NumberFormatException ex) {
			System.out.println("Vui long nhap mot so hop le cho tuoi.");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public String toString() {
		return "User Name: " + this.userName + "\nUser Age: " + this.userAge + "\nUser Email: " + this.userEmail;
	}
}
