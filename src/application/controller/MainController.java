package application.controller;

import application.Main;

public class MainController {
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handleNewGameButton() {
		main.openHowToPlay();
	}
	
	public void handleExitButton() {
		System.exit(0);
		
	}
}
