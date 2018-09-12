package business;
import java.util.*;

public class CheckoutRecord {
	Member member;
	LinkedList<CheckoutEntry> checkoutentries;
	LinkedList<Fine> fines;
	
	public CheckoutRecord(Member member) {
		this.member=member;
		checkoutentries=new LinkedList<>();
		}

	public Member getMember() {
		return member;
	}

	public LinkedList<CheckoutEntry> getCheckoutentries() {
		return checkoutentries;
	}

	public void addCheckoutentries(CheckoutEntry checkoutentries) {
		this.checkoutentries.add(checkoutentries);
	}
	
	public LinkedList<Fine> getFines(){
		return fines;
	}
	
	public void setFines(Fine fine) {
		fines.add(fine);
	}
	
	
	

}
