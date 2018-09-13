package business;

import java.io.Serializable;

public class Member extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int memberId;
	
	public Member() {
		super();
	}

public Member(int memberId,String firstName, String lastName, String phoneNumber, String street, String city,
			String state, String zip) {
		super(firstName, lastName, phoneNumber, street, city, state, zip);
		this.memberId=memberId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	

	public void toStringMember() {
		Address address = this.getAddress();
		System.out.println(memberId+" "+super.getFirstName()+" "+  this.getLastName()+" "+this.getPhoneNumber()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+ address.getZip());
	}
	

}
