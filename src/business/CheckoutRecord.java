package business;
import java.util.*;

public class CheckoutRecord {
	Member member;
	List<CheckoutEntry> checkoutentries;
	List<Fine> fines;
	
	public CheckoutRecord(Member member) {
		this.member=member;
		}

	public Member getMember() {
		return member;
	}

	public List<CheckoutEntry> getCheckoutentries() {
		return checkoutentries;
	}

	public void addCheckoutentries(CheckoutEntry checkoutentries) {
		this.checkoutentries.add(checkoutentries);
	}
	
	public List<Fine> getFines(){
		return fines;
	}
	
	public void setFines(Fine fine) {
		fines.add(fine);
	}
	
	
	

}
