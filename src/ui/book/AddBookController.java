package ui.book;

import business.Address;
import business.Author;
import business.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddBookController {

	@FXML
	private TextField txtFieldISBN;
	@FXML
	private TextField txtFieldTitle;
	@FXML
	private TextField txtFieldCheckoutLength ;
	@FXML
	private TextField txtFieldNumCopies;
	@FXML
	private TextField txtFieldAuthorFName;
	@FXML
	private TextField txtFieldAuthorLName;
	@FXML
	private TextField txtFieldAuthorPNum;
	@FXML
	private TextField txtFieldAuthorSBio;
	@FXML
	private TextField txtFieldAuthorStreet;
	@FXML
	private TextField txtFieldAuthorCity;
	@FXML
	private TextField txtFieldAuthorState;
	@FXML
	private TextField txtFieldAuthorZip;
	
	Book bookObj=new Book();
	Author author;
	Address address;
	
	@FXML
	private Button btnSubmit;
	public void btnSubmit(ActionEvent actionEvent) {
	bookObj.setIsbn(Long.parseLong(txtFieldISBN.getText()));
	bookObj.setTitle(txtFieldTitle.getText());
	bookObj.setMaxCheckoutDays(Integer.parseInt(txtFieldCheckoutLength.getText()));
	
	author = new Author();
	author.setFirstName(txtFieldAuthorFName.getText());
	author.setLastName(txtFieldAuthorFName.getText());
	author.setPhoneNumber(txtFieldAuthorFName.getText());
	author.setShortBio(txtFieldAuthorSBio.getText());
	
	address = new Address();
	address.setStreet(txtFieldAuthorStreet.getText());
	address.setCity(txtFieldAuthorCity.getText());
	address.setState(txtFieldAuthorState.getText());
	address.setZip(txtFieldAuthorZip.getText());
	author.setAddress(address);
	
	bookObj.setAuthor(author);
	
	
	
	}// end of btnSubmit
	
}
