package business;

import java.io.Serializable;

public class User extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void toStringMember() {
		Address address = this.getAddress();
		System.out.println(id+" "+this.getFirstName()+" "+  this.getLastName()+" "+this.getPhoneNumber()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+ address.getZip());
	}
	
	
	
}
