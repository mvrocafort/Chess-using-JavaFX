package application.controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BlackWinsController {
	private Main main;
	@FXML Button button;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	
    @FXML
    private Circle circle1;

    @FXML
    private Label playerLabel;

    @FXML
    private Circle circle2;

    @FXML
    private Label playerLabel1;

    @FXML
    void handlePlayAgainButton() {
    		main.openHowToPlay();
    		Stage stage = (Stage) button.getScene().getWindow();
    	    stage.close();
    }

    @FXML
    void handleQuitButton() {
    		System.exit(0);
    }

}
