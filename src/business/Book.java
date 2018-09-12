package business;

public class Book {
	private String title;
	private long isbn;
	private Author author;
	private int maxCheckoutDays;
	private boolean isPopular;
	private boolean isAvailable;
	
	
	
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
