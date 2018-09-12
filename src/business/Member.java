package business;

import java.io.Serializable;

public class Member extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int memberId;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	
	

}
