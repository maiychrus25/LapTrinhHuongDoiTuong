//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai6/Book.java
package BKTTH_01.Bai6;
=======
//Created: 29.09.2024
package Bai6;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai6/Book.java

import java.util.Calendar;
import java.util.Scanner;

public class Book {
	private String name;
	private String author;
	private int publicationYear;
	
	public Book () {}
	
	public Book(String name, String author, int publicationYear) {
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public boolean isValidPublicYear() {
		int currentYear =  Calendar.getInstance().get(Calendar.YEAR);
		return this.publicationYear <= currentYear;
	}
	
	public void input(Scanner sc) {
		System.out.print("Nhap ten sach: ");
		this.name = sc.nextLine();
		
		System.out.print("Nhap ten tac gia: ");
		this.author = sc.nextLine();
		
		try {
			System.out.print("Nhap nam xuat ban: ");
			this.publicationYear = Integer.parseInt(sc.nextLine());
		} 
		catch (NumberFormatException ex) {
			System.out.println("Vui long nhap nam xuat ban hop le.");
		}
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAuthor: " + this.author + "\nPublication Year: " + this.publicationYear;
	}
}
