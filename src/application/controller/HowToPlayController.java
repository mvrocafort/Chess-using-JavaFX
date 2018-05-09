package application.controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HowToPlayController {
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handleStartButton() {
		main.openGame();
	}
}
