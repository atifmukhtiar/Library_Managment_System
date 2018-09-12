package business;

public class BookCopy {
	public int copyNumber;
	private Book book;
	
	public BookCopy(Book book,int copyNumber) {
		this.book=book;
		this.copyNumber=copyNumber;
	}
	

	public int getCopyNumber() {
		return copyNumber;
	}

	public void setCopyNumber(int copyNumber) {
		this.copyNumber = copyNumber;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Copy "+copyNumber+" of "+book.getTitle();
	}
	
	

}
