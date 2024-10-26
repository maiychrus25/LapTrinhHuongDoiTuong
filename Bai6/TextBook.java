//Author: MAIY 07!!
//Created: 29.09.2024
package Bai6;

import java.util.Calendar;

public class TextBook extends Book {
	public TextBook () {}
	
	public TextBook(String name, String author, int publicationYear) {
		super(name, author, publicationYear);
	}
	
	@Override
	public boolean isValidPublicYear() {
		int publicationYear = super.getPublicationYear();
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return (publicationYear <= currentYear && publicationYear >= currentYear - 5);
	}
}
