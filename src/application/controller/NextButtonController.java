package application.controller;

import application.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NextButtonController {
	private Main main;
	@FXML Button button;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML public void handleOKButton() {
		//close secondary window
		Stage stage = (Stage) button.getScene().getWindow();
	    stage.close();
	}
	

}
