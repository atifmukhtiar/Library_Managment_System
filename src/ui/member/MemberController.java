package ui.member;

import java.util.List;

import business.Address;
import business.Member;
import business.User;
import dataaccess.DataStorage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MemberController {
	
	@FXML
	private TextField txtFieldFName;
	@FXML
	private TextField txtFieldLName;
	@FXML
	private TextField txtFieldPNum;
	@FXML
	private TextField txtFieldStreet;
	@FXML
	private TextField txtFieldCity;
	@FXML
	private TextField txtFieldState;
	@FXML
	private TextField txtFieldZip;
	

	Member member = new Member();
	Address address = new Address();
	
	
	DataStorage memSerialization = new DataStorage();
	
	
	@FXML
	private Button btnSubmit;
	public void btnSubmit(ActionEvent actionEvent) {
		member.setFirstName(txtFieldFName.getText());
		member.setLastName(txtFieldLName.getText());
		member.setPhoneNumber(txtFieldPNum.getText());
		
		address.setStreet(txtFieldStreet.getText());
		address.setCity(txtFieldCity.getText());
		address.setState(txtFieldState.getText());
		address.setZip(txtFieldZip.getText());
		
		member.setAddress(address);
		
		
		memSerialization.saveObject("member.txt",member);
		Member member =(Member) memSerialization.getObject("member.txt");
		member.toStringMember();
		
	
	}
	
	public void junk() {
		/*User user =new User();
		user.setId("AL-01");
		user.setFirstName(txtFieldFName.getText());
		user.setLastName(txtFieldLName.getText());
		user.setPhoneNumber(txtFieldPNum.getText());
		user.setAddress(address);
		memSerialization.saveObject("user.txt",user);
		User userFile =(User) memSerialization.getObject("user.txt");
		userFile.toStringMember();*/
		/*List<Object> listMember= memSerialization.getObjectList("member.txt");
		
		for(int n=0;n<listMember.size();n++) {
			Member m = (Member) listMember.get(n);	
			m.toStringMember();
		}*/
	}
}
