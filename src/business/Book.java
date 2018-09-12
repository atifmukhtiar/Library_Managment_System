package business;
import java.util.*;

public class Book {
	private String title;
	private long isbn;
	private int maxCheckoutDays;
	private boolean isPopular;
	private boolean isAvailable;
	private List<BookCopy> bookCopiesCollection;
	
	
	public Book(String title, long isbn, int maxCheckoutDays, boolean isPopular, boolean isAvailable) {
		this.title = title;
		this.isbn = isbn;
		this.maxCheckoutDays = maxCheckoutDays;
		this.isPopular = isPopular;
		this.isAvailable = isAvailable;
		
		bookCopiesCollection=new ArrayList<>();
		
		bookCopiesCollection.add(BookCopyFactory.bookCopyFactory(this));

	}
	
	public void addBookCopy(BookCopy bookcopy) {
		this.bookCopiesCollection.add(bookcopy);
				
	}
	
	
	
	
	
	

}
