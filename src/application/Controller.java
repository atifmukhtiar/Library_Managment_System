package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

	@FXML
	private Label titleLabel;
	@FXML
	private Button submit;
	
	
	public void submit(ActionEvent actionEvent){
		titleLabel.setText("Login Button Pressed");
	}
}
