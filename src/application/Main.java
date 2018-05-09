package application;

import java.io.IOException;

import application.controller.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Main extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		openMain();
		//openTester();
	}
	
	public void openMain() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			MainController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Chess");
			primaryStage.getIcons().add(new Image("file:icon.png"));
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openGame() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/GameView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			GameController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("New Game");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openHowToPlay() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/HowToPlayView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			HowToPlayController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("How To Play");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openLeaderboard() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/LeaderboardView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			LeaderboardController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Leaderboard");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openTester() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/TesterView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			TesterController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Tester");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openInvalidMove() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/InvalidMoveView.fxml"));
			AnchorPane pane= (AnchorPane) loader.load();

			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			
			InvalidMoveController invalidMoveController = loader.getController();
			invalidMoveController.setMain(this);

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(primaryStage);
			stage.setScene(scene);
			primaryStage.setTitle("Error");
			stage.setResizable(false);
			stage.show();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void openNextButton() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/NextButtonView.fxml"));
			AnchorPane pane= (AnchorPane) loader.load();

			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			
			NextButtonController nextButtonController = loader.getController();
			nextButtonController.setMain(this);

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(primaryStage);
			stage.setScene(scene);
			primaryStage.setTitle("Error");
			stage.setResizable(false);
			stage.show();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void openWhiteWins() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/WhiteWinsView.fxml"));
			AnchorPane pane= (AnchorPane) loader.load();

			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			
			WhiteWinsController whiteWinsController = loader.getController();
			whiteWinsController.setMain(this);

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(primaryStage);
			stage.setScene(scene);
			primaryStage.setTitle("Congratulations");
			stage.setResizable(false);
			stage.show();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void openBlackWins() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/BlackWinsView.fxml"));
			AnchorPane pane= (AnchorPane) loader.load();

			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			
			BlackWinsController blackWinsController = loader.getController();
			blackWinsController.setMain(this);

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(primaryStage);
			stage.setScene(scene);
			primaryStage.setTitle("Congratulations");
			stage.setResizable(false);
			stage.show();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void openPromotion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/PromotionView.fxml"));
			AnchorPane pane= (AnchorPane) loader.load();

			Scene scene = new Scene(pane);
			Stage stage = new Stage();
			
			PromotionController promotionController = loader.getController();
			promotionController.setMain(this);

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(primaryStage);
			stage.setScene(scene);
			primaryStage.setTitle("Promotion");
			stage.setResizable(false);
			stage.show();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
