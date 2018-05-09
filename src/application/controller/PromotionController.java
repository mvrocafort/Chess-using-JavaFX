package application.controller;

import java.io.File;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PromotionController {
	private Main main;
	GameController get = new GameController();
	
	@FXML Button button;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML public void promoteToRook() {
		System.out.println("Hey");
		Image image = new Image(new File("white_rook.png").toURI().toString());
		get.white_rook_1.setImage(null);
		
		Stage stage = (Stage) button.getScene().getWindow();
	    stage.close();
	}
	
	@FXML public void promoteToKnight() {
		
	}

	@FXML public void promoteToBishop() {
	
	}

	@FXML public void promoteToQueen() {
	
	}
	

}
