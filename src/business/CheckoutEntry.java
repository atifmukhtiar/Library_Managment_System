package business;

import java.time.LocalDateTime;

public class CheckoutEntry {
	private LocalDateTime checkoutDate;
	private LocalDateTime dueDate;
	
	
	public LocalDateTime getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDateTime checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	

}
