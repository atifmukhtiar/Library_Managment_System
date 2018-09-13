package business;

import java.time.*;

public class CheckoutEntry {
	private BookCopy bookcopy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	public CheckoutEntry(BookCopy bookcopy) {
		checkoutDate=LocalDate.now();
		dueDate=checkoutDate.plusDays(bookcopy.getBook().getMaxCheckoutDays());
		this.bookcopy=bookcopy;
	}
	
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		String checkoutword=bookcopy.getBook().getTitle()+" copyNumber="+bookcopy.getCopyNumber()+", Picked on "+checkoutDate+",To be returned on "+dueDate+"\n";
		
		return checkoutword;
	}
	
	

}
