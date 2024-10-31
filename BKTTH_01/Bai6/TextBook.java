//Author: MAIY 07!!
<<<<<<< HEAD:BKTTH_01/Bai6/TextBook.java
package BKTTH_01.Bai6;
=======
//Created: 29.09.2024
package Bai6;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai6/TextBook.java

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
