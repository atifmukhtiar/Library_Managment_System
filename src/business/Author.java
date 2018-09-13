package business;

public class Author extends Person{
	private int authorId;
	private String credentials;
	private String shortBio;
	
	public Author() {
	}
	
	public Author(String firstName, String lastName, String phoneNumber, String street, String city, String state,
			String zip, int authorId, String credentials, String shortBio) {
		super(firstName, lastName, phoneNumber, street, city, state, zip);
		this.authorId = authorId;
		this.credentials = credentials;
		this.shortBio = shortBio;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getShortBio() {
		return shortBio;
	}
	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}
	
	
	
}
