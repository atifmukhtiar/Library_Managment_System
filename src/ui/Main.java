package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private static Stage primaryStage;
	private static void setStage(Stage primaryStage) {
		Main.primaryStage = primaryStage;
	}
	
	public static Stage getStage() {
		return Main.primaryStage;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			setStage(primaryStage);
			//Parent root = FXMLLoader.load(getClass().getResource("/ui/main.fxml"));
			Parent root = FXMLLoader.load(getClass().getResource("/ui/member/AddMember.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
