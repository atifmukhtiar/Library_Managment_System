package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddMemberController {

	
	
	@FXML
	private Label labelRegisterMember;
	
	@FXML
	private Button btnRegister;
	public void btnRegister(ActionEvent actionEvent) {
		labelRegisterMember.setText("Registered");
	}

}
