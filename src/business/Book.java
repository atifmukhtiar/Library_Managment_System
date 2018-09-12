package business;
import java.util.*;

public class Book {
	private String title;
	private long isbn;
	private long maxCheckoutDays;
	private boolean isPopular;
	private boolean isAvailable;
	private LinkedList<BookCopy> bookCopiesCollection;
	
	
	public Book(String title, long isbn, int maxCheckoutDays, boolean isPopular) {
		this.title = title;
		this.isbn = isbn;
		this.maxCheckoutDays = maxCheckoutDays;
		this.isPopular = isPopular;
		this.isAvailable = true;
		
		bookCopiesCollection=new LinkedList<>();
		BookCopyFactory.bookCopyFactory(this);

	}
	
	public long getMaxCheckoutDays() {
		return maxCheckoutDays;
	}
	
	public void addBookCopy(BookCopy bookcopy) {
		this.bookCopiesCollection.add(bookcopy);
				
	}
	
	public BookCopy getBookCopy() {
		if(!this.isCopyAvailable()) {
			System.out.println("There are no more copies");
			return null;
		}
		return bookCopiesCollection.removeFirst();
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public List<BookCopy> getCopies(){
		return this.bookCopiesCollection;
	}
	
	public int numberOfCopies() {
		return this.bookCopiesCollection.size();
	}
	
	public boolean isCopyAvailable() {
		return !bookCopiesCollection.isEmpty();
	}
	
	@Override
	public String toString() {
		return this.title;
	}
	
	
	
	
	
	

}
