package application.controller;

import application.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LeaderboardController {
	private Main main;
	
	@FXML private TableView<String> table;
	@FXML private ObservableList<String> tableData;
	
	@FXML private TableColumn<String, String> columnName;
	@FXML private TableColumn<String, String> columnScore;

	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handleBackButton() {
		main.openMain();
	}
	

}
