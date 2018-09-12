package business;

public class BookCopy {
	private int copyNumber=0;
	private Book book;
	
	public BookCopy(Book book) {
		this.book=book;
		++this.copyNumber;
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
	
	

}
