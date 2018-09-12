package business;

public class BookCopyFactory {
	private static int count=0;
	private static BookCopy bookcopy;
	private static String recent="";
	
	private BookCopyFactory() {
		
	}
	
	public static BookCopy bookCopyFactory(Book book){
		if(recent!=book.getTitle()) {
			count=0;
		}
		else {
			count=book.numberOfCopies();
			}
		recent=book.getTitle();
		
		bookcopy=new BookCopy(book,++count);
		//bookcopy.setCopyNumber(++count);
		book.addBookCopy(bookcopy);
		
		return bookcopy;
	}
	
	


	

}
