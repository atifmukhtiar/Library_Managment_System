package business;

import java.util.*;

public class Book {
	private String title;
	private long isbn;
	private Author author;
	private int maxCheckoutDays;
	private boolean isPopular;
	private boolean isAvailable;
	private LinkedList<BookCopy> bookCopiesCollection;

	
	public Book() {
		
	}
	public Book(String title, long isbn, int maxCheckoutDays, boolean isPopular) {
		this.title = title;
		this.isbn = isbn;
		this.maxCheckoutDays = maxCheckoutDays;
		this.isPopular = isPopular;
		this.isAvailable = true;

		bookCopiesCollection = new LinkedList<>();
		BookCopyFactory.bookCopyFactory(this);

	}
	
	public int numberOfCopies() {
		return bookCopiesCollection.size();
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addBookCopy(BookCopy bookcopy) {
		this.bookCopiesCollection.add(bookcopy);

	}

	public BookCopy getBookCopy() {
		if (!this.isCopyAvailable()) {
			System.out.println("There are no more copies");
			return null;
		}
		return bookCopiesCollection.removeFirst();
	}

	public boolean isCopyAvailable() {
		return !bookCopiesCollection.isEmpty();
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getMaxCheckoutDays() {
		return maxCheckoutDays;
	}

	public void setMaxCheckoutDays(int maxCheckoutDays) {
		this.maxCheckoutDays = maxCheckoutDays;
	}

	public boolean isPopular() {
		return isPopular;
	}

	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
