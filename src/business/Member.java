package business;

public class Member extends Person {
	private int memberId;
	
	public Member(int memberId,String firstName, String lastName, String phoneNumber, String street, String city,
			String state, int zip) {
		super(firstName, lastName, phoneNumber, street, city, state, zip);
		this.memberId=memberId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	

	
	

}
