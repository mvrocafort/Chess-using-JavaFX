package application.controller;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.*;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TesterController {
private Main main;
@FXML AnchorPane pane, mainPane;
@FXML private Circle circle1, circle2;

    @FXML private Label playerLabel;

@FXML private Button nextPlayerButton;

@FXML private ImageView board;
   
@FXML private ImageView white_pawn_1, white_pawn_2, white_pawn_3, white_pawn_4, 
    white_pawn_5, white_pawn_6, white_pawn_7, white_pawn_8;
  
@FXML private ImageView black_pawn_1, black_pawn_2, black_pawn_3, black_pawn_4,
    black_pawn_5, black_pawn_6, black_pawn_7, black_pawn_8;
  
@FXML private ImageView white_rook_1, white_rook_2, white_knight_1, white_knight_2,
    white_bishop_1, white_bishop_2, white_king, white_queen;
 
@FXML private ImageView black_rook_1, black_rook_2, black_knight_1, black_knight_2,
   	 black_bishop_1, black_bishop_2, black_king, black_queen;
  
@FXML private ImageView d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15,
  d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, 
   	 d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43,
   	 d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57,
   	 d58, d59, d60, d61, d62, d63;

@FXML private ImageView e1w, e2w, e3w, e4w, e5w, e6w, e7w, e8w, e9w, e10w, e11w, e12w, e13w, e14w, e15w, e16w,
e1b, e2b, e3b, e4b, e5b, e6b, e7b, e8b, e9b, e10b, e11b, e12b, e13b, e14b, e15b, e16b;

@FXML private boolean e1wCheck = false, e2wCheck = false, e3wCheck = false, e4wCheck = false, e5wCheck = false, e6wCheck = false, e7wCheck = false, e8wCheck = false, e9wCheck = false,
e10wCheck = false, e11wCheck = false, e12wCheck = false, e13wCheck = false, e14wCheck = false, e15wCheck = false, e16wCheck = false, e1bCheck = false, e2bCheck = false,
e3bCheck = false, e4bCheck = false, e5bCheck = false, e6bCheck = false, e7bCheck = false, e8bCheck = false, e9bCheck = false, e10bCheck = false, e11bCheck = false, e12bCheck = false,
e13bCheck = false, e14bCheck = false, e15bCheck = false, e16bCheck = false;
  
  @FXML  public ImageView locatedPiece, destination;
  
  @FXML public MouseEvent pEvent;
  @FXML public MouseEvent dEvent;
  
  boolean done = false;
  
  boolean start = false;
  
  double referenceX, referenceY;

  @FXML
  private Circle green;

  @FXML
  private Circle red;
  
  public MouseEvent eEvent;
  
public void setMain(Main main) {
this.main = main;
initializePieces();
//System.out.println(isInd40(white_pawn_1.getX(), white_pawn_1.getY()));

}
///CHESS LOGIC METHODS
public void initializePieces() { //method to initialize the position of the pieces
//white pawns
white_pawn_1.setX(d48.getLayoutX());
white_pawn_1.setY(d48.getLayoutY());
white_pawn_2.setX(d49.getLayoutX());
white_pawn_2.setY(d49.getLayoutY());
white_pawn_3.setX(d50.getLayoutX());
white_pawn_3.setY(d50.getLayoutY());
white_pawn_4.setX(d51.getLayoutX());
white_pawn_4.setY(d51.getLayoutY());
white_pawn_5.setX(d52.getLayoutX());
white_pawn_5.setY(d52.getLayoutY());
white_pawn_6.setX(d53.getLayoutX());
white_pawn_6.setY(d53.getLayoutY());
white_pawn_7.setX(d54.getLayoutX());
white_pawn_7.setY(d54.getLayoutY());
white_pawn_8.setX(d55.getLayoutX());
white_pawn_8.setY(d55.getLayoutY());
//black pawns
black_pawn_1.setX(d8.getLayoutX());
black_pawn_1.setY(d8.getLayoutY());
black_pawn_2.setX(d9.getLayoutX());
black_pawn_2.setY(d9.getLayoutY());
black_pawn_3.setX(d10.getLayoutX());
black_pawn_3.setY(d10.getLayoutY());
black_pawn_4.setX(d11.getLayoutX());
black_pawn_4.setY(d11.getLayoutY());
black_pawn_5.setX(d12.getLayoutX());
black_pawn_5.setY(d12.getLayoutY());
black_pawn_6.setX(d13.getLayoutX());
black_pawn_6.setY(d13.getLayoutY());
black_pawn_7.setX(d14.getLayoutX());
black_pawn_7.setY(d14.getLayoutY());
black_pawn_8.setX(d15.getLayoutX());
black_pawn_8.setY(d15.getLayoutY());
//other white pieces
white_rook_1.setX(d56.getLayoutX());
white_rook_1.setY(d56.getLayoutY());
white_rook_2.setX(d63.getLayoutX());
white_rook_2.setY(d63.getLayoutY());
white_knight_1.setX(d57.getLayoutX());
white_knight_1.setY(d57.getLayoutY());
white_knight_2.setX(d62.getLayoutX());
white_knight_2.setY(d62.getLayoutY());
white_bishop_1.setX(d58.getLayoutX());
white_bishop_1.setY(d58.getLayoutY());
white_bishop_2.setX(d61.getLayoutX());
white_bishop_2.setY(d61.getLayoutY());
white_king.setX(d60.getLayoutX());
white_king.setY(d60.getLayoutY());
white_queen.setX(d59.getLayoutX());
white_queen.setY(d59.getLayoutY());
//other black pieces
black_rook_1.setX(d0.getLayoutX());
black_rook_1.setY(d0.getLayoutY());
black_rook_2.setX(d7.getLayoutX());
black_rook_2.setY(d7.getLayoutY());
black_knight_1.setX(d1.getLayoutX());
black_knight_1.setY(d1.getLayoutY());
black_knight_2.setX(d6.getLayoutX());
black_knight_2.setY(d6.getLayoutY());
black_bishop_1.setX(d2.getLayoutX());
black_bishop_1.setY(d2.getLayoutY());
black_bishop_2.setX(d5.getLayoutX());
black_bishop_2.setY(d5.getLayoutY());
black_king.setX(d3.getLayoutX());
black_king.setY(d3.getLayoutY());
black_queen.setX(d4.getLayoutX());
black_queen.setY(d4.getLayoutY());
}
public ImageView locatePiece(MouseEvent event) {
this.pEvent = event;
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_1.getId()) {
locatedPiece = white_pawn_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_2.getId()) {
locatedPiece = white_pawn_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_3.getId()) {
locatedPiece = white_pawn_3;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_4.getId()) {
locatedPiece = white_pawn_4;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_5.getId()) {
locatedPiece = white_pawn_5;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_6.getId()) {
locatedPiece = white_pawn_6;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_7.getId()) {
locatedPiece = white_pawn_7;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_8.getId()) {
locatedPiece = white_pawn_8;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_1.getId()) {
locatedPiece = black_pawn_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_2.getId()) {
locatedPiece = black_pawn_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_3.getId()) {
locatedPiece = black_pawn_3;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_4.getId()) {
locatedPiece = black_pawn_4;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_5.getId()) {
locatedPiece = black_pawn_5;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_6.getId()) {
locatedPiece = black_pawn_6;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_7.getId()) {
locatedPiece = black_pawn_7;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_8.getId()) {
locatedPiece = black_pawn_8;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_rook_1.getId()) {
locatedPiece = white_rook_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_rook_2.getId()) {
locatedPiece = white_rook_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_knight_1.getId()) {
locatedPiece = white_knight_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_knight_2.getId()) {
locatedPiece = white_knight_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_bishop_1.getId()) {
locatedPiece = white_bishop_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_bishop_2.getId()) {
locatedPiece = white_bishop_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_king.getId()) {
locatedPiece = white_king;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_queen.getId()) {
locatedPiece = white_queen;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_1.getId()) {
locatedPiece = black_rook_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_2.getId()) {
locatedPiece = black_rook_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_1.getId()) {
locatedPiece = black_knight_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_2.getId()) {
locatedPiece = black_knight_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_1.getId()) {
locatedPiece = black_bishop_1;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_2.getId()) {
locatedPiece = black_bishop_2;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_king.getId()) {
locatedPiece = black_king;
} else if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_queen.getId()) {
locatedPiece = black_queen;
} 
return locatedPiece;
}
public ImageView locateDestination(MouseEvent event) {
this.dEvent = event;
if(this.dEvent.getPickResult().getIntersectedNode().getId() == d0.getId()) {
destination = d0;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d1.getId()) {
destination = d1;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d2.getId()) {
destination = d2;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d3.getId()) {
destination = d3;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d4.getId()) {
destination = d4;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d5.getId()) {
destination = d5;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d6.getId()) {
destination = d6;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d7.getId()) {
destination = d7;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d8.getId()) {
destination = d8;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d9.getId()) {
destination = d9;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d10.getId()) {
destination = d10;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d11.getId()) {
destination = d11;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d12.getId()) {
destination = d12;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d13.getId()) {
destination = d13;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d14.getId()) {
destination = d14;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d15.getId()) {
destination = d15;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d16.getId()) {
destination = d16;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d17.getId()) {
destination = d17;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d18.getId()) {
destination = d18;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d19.getId()) {
destination = d19;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d20.getId()) {
destination = d20;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d21.getId()) {
destination = d21;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d22.getId()) {
destination = d22;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d23.getId()) {
destination = d23;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d24.getId()) {
destination = d24;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d25.getId()) {
destination = d25;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d26.getId()) {
destination = d26;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d27.getId()) {
destination = d27;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d28.getId()) {
destination = d28;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d29.getId()) {
destination = d29;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d30.getId()) {
destination = d30;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d31.getId()) {
destination = d31;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d32.getId()) {
destination = d32;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d33.getId()) {
destination = d33;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d34.getId()) {
destination = d34;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d35.getId()) {
destination = d35;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d36.getId()) {
destination = d36;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d37.getId()) {
destination = d37;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d38.getId()) {
destination = d38;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d39.getId()) {
destination = d39;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d40.getId()) {
destination = d40;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d41.getId()) {
destination = d41;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d42.getId()) {
destination = d42;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d43.getId()) {
destination = d43;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d44.getId()) {
destination = d44;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d45.getId()) {
destination = d45;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d46.getId()) {
destination = d46;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d47.getId()) {
destination = d47;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d48.getId()) {
destination = d48;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d49.getId()) {
destination = d49;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d50.getId()) {
destination = d50;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d51.getId()) {
destination = d51;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d52.getId()) {
destination = d52;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d53.getId()) {
destination = d53;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d54.getId()) {
destination = d54;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d55.getId()) {
destination = d55;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d56.getId()) {
destination = d56;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d57.getId()) {
destination = d57;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d58.getId()) {
destination = d58;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d59.getId()) {
destination = d59;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d60.getId()) {
destination = d60;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d61.getId()) {
destination = d61;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d62.getId()) {
destination = d62;
} else if(this.dEvent.getPickResult().getIntersectedNode().getId() == d63.getId()) {
destination = d63;
} 
/*
* System.out.println("Destination is: "+destination);
System.out.println("X value is "+destination.getLayoutX());
System.out.println("Y value is "+destination.getLayoutY());
*/

return destination;
}

public ImageView checkLocation(double x, double y) {
	ImageView img = null;
	
	ArrayList<Double> XlocationArray = new ArrayList<Double>();
	ArrayList<Double> YlocationArray = new ArrayList<Double>();
	ArrayList<ImageView> locationArray = new ArrayList<ImageView>();
	
	XlocationArray.add(d0.getLayoutX()); XlocationArray.add(d1.getLayoutX()); XlocationArray.add(d2.getLayoutX()); XlocationArray.add(d3.getLayoutX());
	XlocationArray.add(d4.getLayoutX()); XlocationArray.add(d5.getLayoutX()); XlocationArray.add(d6.getLayoutX()); XlocationArray.add(d7.getLayoutX()); 
	XlocationArray.add(d8.getLayoutX()); XlocationArray.add(d9.getLayoutX()); XlocationArray.add(d10.getLayoutX()); XlocationArray.add(d11.getLayoutX());
	XlocationArray.add(d12.getLayoutX()); XlocationArray.add(d13.getLayoutX()); XlocationArray.add(d14.getLayoutX()); XlocationArray.add(d15.getLayoutX());
	XlocationArray.add(d16.getLayoutX()); XlocationArray.add(d17.getLayoutX()); XlocationArray.add(d18.getLayoutX()); XlocationArray.add(d19.getLayoutX()); 
	XlocationArray.add(d20.getLayoutX()); XlocationArray.add(d21.getLayoutX()); XlocationArray.add(d22.getLayoutX()); XlocationArray.add(d23.getLayoutX());
	XlocationArray.add(d24.getLayoutX()); XlocationArray.add(d25.getLayoutX()); XlocationArray.add(d26.getLayoutX()); XlocationArray.add(d27.getLayoutX());
	XlocationArray.add(d28.getLayoutX()); XlocationArray.add(d29.getLayoutX()); XlocationArray.add(d30.getLayoutX()); XlocationArray.add(d31.getLayoutX()); 
	XlocationArray.add(d32.getLayoutX()); XlocationArray.add(d33.getLayoutX()); XlocationArray.add(d34.getLayoutX()); XlocationArray.add(d35.getLayoutX());
	XlocationArray.add(d36.getLayoutX()); XlocationArray.add(d37.getLayoutX()); XlocationArray.add(d38.getLayoutX()); XlocationArray.add(d39.getLayoutX());
	XlocationArray.add(d40.getLayoutX()); XlocationArray.add(d41.getLayoutX()); XlocationArray.add(d42.getLayoutX()); XlocationArray.add(d43.getLayoutX()); 
	XlocationArray.add(d44.getLayoutX()); XlocationArray.add(d45.getLayoutX()); XlocationArray.add(d46.getLayoutX()); XlocationArray.add(d47.getLayoutX());
	XlocationArray.add(d48.getLayoutX()); XlocationArray.add(d49.getLayoutX()); XlocationArray.add(d50.getLayoutX()); XlocationArray.add(d51.getLayoutX());
	XlocationArray.add(d52.getLayoutX()); XlocationArray.add(d53.getLayoutX()); XlocationArray.add(d54.getLayoutX()); XlocationArray.add(d55.getLayoutX()); 
	XlocationArray.add(d56.getLayoutX()); XlocationArray.add(d57.getLayoutX()); XlocationArray.add(d58.getLayoutX()); XlocationArray.add(d59.getLayoutX());
	XlocationArray.add(d60.getLayoutX()); XlocationArray.add(d61.getLayoutX()); XlocationArray.add(d62.getLayoutX()); XlocationArray.add(d63.getLayoutX());
	
	YlocationArray.add(d0.getLayoutY()); YlocationArray.add(d1.getLayoutY()); YlocationArray.add(d2.getLayoutY()); YlocationArray.add(d3.getLayoutY());
	YlocationArray.add(d4.getLayoutY()); YlocationArray.add(d5.getLayoutY()); YlocationArray.add(d6.getLayoutY()); YlocationArray.add(d7.getLayoutY()); 
	YlocationArray.add(d8.getLayoutY()); YlocationArray.add(d9.getLayoutY()); YlocationArray.add(d10.getLayoutY()); YlocationArray.add(d11.getLayoutY());
	YlocationArray.add(d12.getLayoutY()); YlocationArray.add(d13.getLayoutY()); YlocationArray.add(d14.getLayoutY()); YlocationArray.add(d15.getLayoutY());
	YlocationArray.add(d16.getLayoutY()); YlocationArray.add(d17.getLayoutY()); YlocationArray.add(d18.getLayoutY()); YlocationArray.add(d19.getLayoutY()); 
	YlocationArray.add(d20.getLayoutY()); YlocationArray.add(d21.getLayoutY()); YlocationArray.add(d22.getLayoutY()); YlocationArray.add(d23.getLayoutY());
	YlocationArray.add(d24.getLayoutY()); YlocationArray.add(d25.getLayoutY()); YlocationArray.add(d26.getLayoutY()); YlocationArray.add(d27.getLayoutY());
	YlocationArray.add(d28.getLayoutY()); YlocationArray.add(d29.getLayoutY()); YlocationArray.add(d30.getLayoutY()); YlocationArray.add(d31.getLayoutY()); 
	YlocationArray.add(d32.getLayoutY()); YlocationArray.add(d33.getLayoutY()); YlocationArray.add(d34.getLayoutY()); YlocationArray.add(d35.getLayoutY());
	YlocationArray.add(d36.getLayoutY()); YlocationArray.add(d37.getLayoutY()); YlocationArray.add(d38.getLayoutY()); YlocationArray.add(d39.getLayoutY());
	YlocationArray.add(d40.getLayoutY()); YlocationArray.add(d41.getLayoutY()); YlocationArray.add(d42.getLayoutY()); YlocationArray.add(d43.getLayoutY()); 
	YlocationArray.add(d44.getLayoutY()); YlocationArray.add(d45.getLayoutY()); YlocationArray.add(d46.getLayoutY()); YlocationArray.add(d47.getLayoutY());
	YlocationArray.add(d48.getLayoutY()); YlocationArray.add(d49.getLayoutY()); YlocationArray.add(d50.getLayoutY()); YlocationArray.add(d51.getLayoutY());
	YlocationArray.add(d52.getLayoutY()); YlocationArray.add(d53.getLayoutY()); YlocationArray.add(d54.getLayoutY()); YlocationArray.add(d55.getLayoutY()); 
	YlocationArray.add(d56.getLayoutY()); YlocationArray.add(d57.getLayoutY()); YlocationArray.add(d58.getLayoutY()); YlocationArray.add(d59.getLayoutY());
	YlocationArray.add(d60.getLayoutY()); YlocationArray.add(d61.getLayoutY()); YlocationArray.add(d62.getLayoutY()); YlocationArray.add(d63.getLayoutY());
	
	locationArray.add(d0); locationArray.add(d1); locationArray.add(d2); locationArray.add(d3); locationArray.add(d4); locationArray.add(d5);
	locationArray.add(d6); locationArray.add(d7); locationArray.add(d8); locationArray.add(d9); locationArray.add(d10); locationArray.add(d11);
	locationArray.add(d12); locationArray.add(d13); locationArray.add(d14); locationArray.add(d15); locationArray.add(d16); locationArray.add(d17);
	locationArray.add(d18); locationArray.add(d19); locationArray.add(d20); locationArray.add(d21); locationArray.add(d22); locationArray.add(d23);
	locationArray.add(d24); locationArray.add(d25); locationArray.add(d26); locationArray.add(d27); locationArray.add(d28); locationArray.add(d29);
	locationArray.add(d30); locationArray.add(d31); locationArray.add(d32); locationArray.add(d33); locationArray.add(d34); locationArray.add(d35);
	locationArray.add(d36); locationArray.add(d37); locationArray.add(d38); locationArray.add(d39); locationArray.add(d40); locationArray.add(d41);
	locationArray.add(d42); locationArray.add(d43); locationArray.add(d44); locationArray.add(d45); locationArray.add(d46); locationArray.add(d47);
	locationArray.add(d48); locationArray.add(d49); locationArray.add(d50); locationArray.add(d51); locationArray.add(d52); locationArray.add(d53);
	locationArray.add(d54); locationArray.add(d55); locationArray.add(d56); locationArray.add(d57); locationArray.add(d58); locationArray.add(d59);
	locationArray.add(d60); locationArray.add(d61); locationArray.add(d62); locationArray.add(d63);
	
	for(int i = 0; i < XlocationArray.size(); i++) {
		for(int j = 0; j < YlocationArray.size(); j++) {
			for(int k = 0; k < locationArray.size(); k++) {
				if(x == XlocationArray.get(i) && y == YlocationArray.get(j)) {
				img = locationArray.get(k);
				System.out.println(locationArray.get(k));
				return img;
			}
			
			} 
		}
	}	return null;
}

public void switchPieces() {
	checkLocation(353, 253);
	ArrayList<ImageView> locationArray = new ArrayList<ImageView>();
	
	locationArray.add(d0); locationArray.add(d1); locationArray.add(d2); locationArray.add(d3); locationArray.add(d4); locationArray.add(d5);
	locationArray.add(d6); locationArray.add(d7); locationArray.add(d8); locationArray.add(d9); locationArray.add(d10); locationArray.add(d11);
	locationArray.add(d12); locationArray.add(d13); locationArray.add(d14); locationArray.add(d15); locationArray.add(d16); locationArray.add(d17);
	locationArray.add(d18); locationArray.add(d19); locationArray.add(d20); locationArray.add(d21); locationArray.add(d22); locationArray.add(d23);
	locationArray.add(d24); locationArray.add(d25); locationArray.add(d26); locationArray.add(d27); locationArray.add(d28); locationArray.add(d29);
	locationArray.add(d30); locationArray.add(d31); locationArray.add(d32); locationArray.add(d33); locationArray.add(d34); locationArray.add(d35);
	locationArray.add(d36); locationArray.add(d37); locationArray.add(d38); locationArray.add(d39); locationArray.add(d40); locationArray.add(d41);
	locationArray.add(d42); locationArray.add(d43); locationArray.add(d44); locationArray.add(d45); locationArray.add(d46); locationArray.add(d47);
	locationArray.add(d48); locationArray.add(d49); locationArray.add(d50); locationArray.add(d51); locationArray.add(d52); locationArray.add(d53);
	locationArray.add(d54); locationArray.add(d55); locationArray.add(d56); locationArray.add(d57); locationArray.add(d58); locationArray.add(d59);
	locationArray.add(d60); locationArray.add(d61); locationArray.add(d62); locationArray.add(d63);
	
	ArrayList<ImageView>switchArray = new ArrayList<ImageView>();
	switchArray.add(white_pawn_1);
	switchArray.add(white_pawn_2);
	switchArray.add(white_pawn_3);
	switchArray.add(white_pawn_4);
	switchArray.add(white_pawn_5);
	switchArray.add(white_pawn_6);
	switchArray.add(white_pawn_7);
	switchArray.add(white_pawn_8);
	switchArray.add(white_rook_1);
	switchArray.add(white_rook_2);
	switchArray.add(white_knight_1);
	switchArray.add(white_knight_2);
	switchArray.add(white_bishop_1);
	switchArray.add(white_bishop_2);
	switchArray.add(white_king);
	switchArray.add(white_queen);
	
	switchArray.add(black_pawn_1);
	switchArray.add(black_pawn_2);
	switchArray.add(black_pawn_3);
	switchArray.add(black_pawn_4);
	switchArray.add(black_pawn_5);
	switchArray.add(black_pawn_6);
	switchArray.add(black_pawn_7);
	switchArray.add(black_pawn_8);
	switchArray.add(black_rook_1);
	switchArray.add(black_rook_2);
	switchArray.add(black_knight_1);
	switchArray.add(black_knight_2);
	switchArray.add(black_bishop_1);
	switchArray.add(black_bishop_2);
	switchArray.add(black_king);
	switchArray.add(black_queen);

		//System.out.println(switchArray.get(i).getX());
		for(int i = 0; i < locationArray.size(); i++) {
			if(checkLocation(locationArray.get(i).getX(), locationArray.get(i).getY()) == d60) {
				System.out.println("GWAPO");
			}
		}
	
}

@FXML
public void selectPiece(MouseEvent event) {

MouseButton button = event.getButton();
    if(button==MouseButton.PRIMARY) {
    this.pEvent = event;
    //locatePiece(this.pEvent);
    } else  if(button==MouseButton.SECONDARY){//eat a piece
    		/**
    		 *     MouseEvent transferEvent = this.pEvent;
this.eEvent = event;
if(done == false) {
  if(!isEatValid(event)) {
  locatePiece(transferEvent).setX(locatePiece(this.eEvent).getX());
  locatePiece(transferEvent).setY(locatePiece(this.eEvent).getY());
 
  //transfer to eat pane
  //if(isBlack(event)) {
  //if(e1bCheck = false) {
  pane.getChildren().remove(locatePiece(this.eEvent));
    mainPane.getChildren().add(locatePiece(this.eEvent));
   
   // locatePiece(this.eEvent).setX(e1b.getLayoutX());
    //locatePiece(this.eEvent).setY(e1b.getLayoutY());
    locatePiece(this.eEvent).setX(0);
    locatePiece(this.eEvent).setY(0);
    e1b.setImage(null);
  //}
  //}
 
 
  } else
  System.out.println("I N V A L I D  E A T!");*/
   } else
  System.out.println("NEXT BUTTON");
    
}

public void selectDestination(MouseEvent event) {
      if(done == false) {
   	  if(isMoveValid(event)) {
   	  locatePiece(this.pEvent).setX(locateDestination(event).getLayoutX());
   	  locatePiece(this.pEvent).setY(locateDestination(event).getLayoutY());
   	  done = true;
   	  //this.dEvent.consume();
   	  //green.setVisible(false);
   	  } else
   	  System.out.println("I N V A L I D  M O V E!");
   	  //JOptionPane.showConfirmDialog(null, "I N V A L I D  M O V E!");
      } else
   	  System.out.println("NEXT BUTTON");
   	  //JOptionPane.showConfirmDialog(null, "Please click the N E X T  P L A Y E R  B U T T O N");
}

public boolean isMoveValid(MouseEvent event) {
double xReference = locatePiece(this.pEvent).getX();
double yReference = locatePiece(this.pEvent).getY();
double xLocation = locateDestination(event).getLayoutX();
double yLocation = locateDestination(event).getLayoutY();
double pawnDistanceCheck = Math.abs(yReference - yLocation);
double knightDistanceCheckX = Math.abs(xReference - xLocation);
double knightDistanceCheckY = Math.abs(yReference - yLocation);
double kingDistanceCheckX = Math.abs(xReference - xLocation);
double kingDistanceCheckY = Math.abs(yReference - yLocation);

if(isPawn(event)) {
if((pawnDistanceCheck == 50 || pawnDistanceCheck == 100) && xReference == xLocation) {
//INSERT GUI CUES HERE
//green.setLayoutX(locateDestination(event).getLayoutX()+22.5);
//green.setLayoutY(locateDestination(event).getLayoutY()+22.5);
//green.setVisible(true);
return true;
} else
//INSERT GUI CUES HERE
//red.setLayoutX(locateDestination(event).getLayoutX()+22.5);
//red.setLayoutY(locateDestination(event).getLayoutY()+22.5);
//red.setVisible(true);
return false;
} else if(isRook(event)) {
if(xReference == xLocation || yReference == yLocation) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isKnight(event)) {
if((knightDistanceCheckX == 50 && knightDistanceCheckY == 100) || (knightDistanceCheckX == 100 && knightDistanceCheckY == 50)) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isBishop(event)) {
if(xReference != xLocation && yReference != yLocation) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isKing(event)) {
if(kingDistanceCheckX == 50 || kingDistanceCheckY == 50) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else //if(isQueen(event))
if((xReference == xLocation || yReference == yLocation) || (xReference != xLocation && yReference != yLocation)) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
}

public boolean isEatValid(MouseEvent event) {
double xReference = locatePiece(this.pEvent).getX();
double yReference = locatePiece(this.pEvent).getY();
double xLocation = locatePiece(event).getX();
double yLocation = locatePiece(event).getY();
double pawnDistanceCheckX = Math.abs(xReference - xLocation);
double pawnDistanceCheckY = Math.abs(yReference - yLocation);
double knightDistanceCheckX = Math.abs(xReference - xLocation);
double knightDistanceCheckY = Math.abs(yReference - yLocation);
double kingDistanceCheckX = Math.abs(xReference - xLocation);
double kingDistanceCheckY = Math.abs(yReference - yLocation);

if(isPawn(event)) {
if((pawnDistanceCheckX == 50) && (pawnDistanceCheckY == 50)) {
return true;
} else
return false;
} else if(isRook(event)) {
if((xReference == xLocation && yReference != yLocation) || (xReference != xLocation && yReference == yLocation)) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isKnight(event)) {
if((knightDistanceCheckX == 50 && knightDistanceCheckY == 100) || (knightDistanceCheckX == 100 && knightDistanceCheckY == 50)) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isBishop(event)) {
if(xReference != xLocation && yReference != yLocation) {//(xReference != xLocation && yReference != yLocation)
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else if(isKing(event)) {
if(kingDistanceCheckX == 50 || kingDistanceCheckY == 50) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
} else //if(isQueen(event))
if((xReference == xLocation || yReference == yLocation) || (xReference != xLocation && yReference != yLocation)) {
//INSERT GUI CUES HERE
return true;
} else
//INSERT GUI CUES HERE
return false;
}

public boolean isVacant(ImageView img) {
if((img.getLayoutX() != white_pawn_1.getX() || img.getLayoutX() != white_pawn_2.getX() || img.getLayoutX() != white_pawn_3.getX() || img.getLayoutX() != white_pawn_4.getX()
|| img.getLayoutX() != white_pawn_5.getX() || img.getLayoutX() != white_pawn_6.getX() || img.getLayoutX() != white_pawn_7.getX() || img.getLayoutX() != white_pawn_8.getX()
|| img.getLayoutX() != black_pawn_1.getX() || img.getLayoutX() != black_pawn_2.getX() || img.getLayoutX() != black_pawn_3.getX() || img.getLayoutX() != black_pawn_4.getX()
|| img.getLayoutX() != black_pawn_5.getX() || img.getLayoutX() != black_pawn_6.getX() || img.getLayoutX() != black_pawn_7.getX() || img.getLayoutX() != black_pawn_8.getX()
|| img.getLayoutX() != white_rook_1.getX() || img.getLayoutX() != white_rook_2.getX() || img.getLayoutX() != white_knight_1.getX() || img.getLayoutX() != white_knight_2.getX()
|| img.getLayoutX() != white_bishop_1.getX() || img.getLayoutX() != white_bishop_2.getX() || img.getLayoutX() != white_king.getX() || img.getLayoutX() != white_queen.getX()
|| img.getLayoutX() != black_rook_1.getX() || img.getLayoutX() != black_rook_2.getX() || img.getLayoutX() != black_knight_1.getX() || img.getLayoutX() != black_knight_2.getX()
|| img.getLayoutX() != black_bishop_1.getX() || img.getLayoutX() != black_bishop_2.getX() || img.getLayoutX() != black_king.getX() || img.getLayoutX() != black_queen.getX())
&& (img.getLayoutY() != white_pawn_1.getY() || img.getLayoutY() != white_pawn_2.getY() || img.getLayoutY() != white_pawn_3.getY() || img.getLayoutY() != white_pawn_4.getY()
|| img.getLayoutY() != white_pawn_5.getY() || img.getLayoutY() != white_pawn_6.getY() || img.getLayoutY() != white_pawn_7.getY() || img.getLayoutY() != white_pawn_8.getY()
|| img.getLayoutY() != black_pawn_1.getY() || img.getLayoutY() != black_pawn_2.getY() || img.getLayoutY() != black_pawn_3.getY() || img.getLayoutY() != black_pawn_4.getY()
|| img.getLayoutY() != black_pawn_5.getY() || img.getLayoutY() != black_pawn_6.getY() || img.getLayoutY() != black_pawn_7.getY() || img.getLayoutY() != black_pawn_8.getY()
|| img.getLayoutY() != white_rook_1.getY() || img.getLayoutY() != white_rook_2.getY() || img.getLayoutY() != white_knight_1.getY() || img.getLayoutY() != white_knight_2.getY()
|| img.getLayoutY() != white_bishop_1.getY() || img.getLayoutY() != white_bishop_2.getY() || img.getLayoutY() != white_king.getY() || img.getLayoutY() != white_queen.getY()
|| img.getLayoutY() != black_rook_1.getY() || img.getLayoutY() != black_rook_2.getY() || img.getLayoutY() != black_knight_1.getY() || img.getLayoutY() != black_knight_2.getY()
|| img.getLayoutY() != black_bishop_1.getY() || img.getLayoutY() != black_bishop_2.getY() || img.getLayoutY() != black_king.getY() || img.getLayoutY() != black_queen.getY())) {
return true;
} else
return false;
}

public boolean isOccupied(ImageView img) {
if((img.getLayoutX() == white_pawn_1.getX() || img.getLayoutX() == white_pawn_2.getX() || img.getLayoutX() == white_pawn_3.getX() || img.getLayoutX() == white_pawn_4.getX()
|| img.getLayoutX() == white_pawn_5.getX() || img.getLayoutX() == white_pawn_6.getX() || img.getLayoutX() == white_pawn_7.getX() || img.getLayoutX() == white_pawn_8.getX()
|| img.getLayoutX() == black_pawn_1.getX() || img.getLayoutX() == black_pawn_2.getX() || img.getLayoutX() == black_pawn_3.getX() || img.getLayoutX() == black_pawn_4.getX()
|| img.getLayoutX() == black_pawn_5.getX() || img.getLayoutX() == black_pawn_6.getX() || img.getLayoutX() == black_pawn_7.getX() || img.getLayoutX() == black_pawn_8.getX()
|| img.getLayoutX() == white_rook_1.getX() || img.getLayoutX() == white_rook_2.getX() || img.getLayoutX() == white_knight_1.getX() || img.getLayoutX() == white_knight_2.getX()
|| img.getLayoutX() == white_bishop_1.getX() || img.getLayoutX() == white_bishop_2.getX() || img.getLayoutX() == white_king.getX() || img.getLayoutX() == white_queen.getX()
|| img.getLayoutX() == black_rook_1.getX() || img.getLayoutX() == black_rook_2.getX() || img.getLayoutX() == black_knight_1.getX() || img.getLayoutX() == black_knight_2.getX()
|| img.getLayoutX() == black_bishop_1.getX() || img.getLayoutX() == black_bishop_2.getX() || img.getLayoutX() == black_king.getX() || img.getLayoutX() == black_queen.getX())
&& (img.getLayoutY() == white_pawn_1.getY() || img.getLayoutY() == white_pawn_2.getY() || img.getLayoutY() == white_pawn_3.getY() || img.getLayoutY() == white_pawn_4.getY()
|| img.getLayoutY() == white_pawn_5.getY() || img.getLayoutY() == white_pawn_6.getY() || img.getLayoutY() == white_pawn_7.getY() || img.getLayoutY() == white_pawn_8.getY()
|| img.getLayoutY() == black_pawn_1.getY() || img.getLayoutY() == black_pawn_2.getY() || img.getLayoutY() == black_pawn_3.getY() || img.getLayoutY() == black_pawn_4.getY()
|| img.getLayoutY() == black_pawn_5.getY() || img.getLayoutY() == black_pawn_6.getY() || img.getLayoutY() == black_pawn_7.getY() || img.getLayoutY() == black_pawn_8.getY()
|| img.getLayoutY() == white_rook_1.getY() || img.getLayoutY() == white_rook_2.getY() || img.getLayoutY() == white_knight_1.getY() || img.getLayoutY() == white_knight_2.getY()
|| img.getLayoutY() == white_bishop_1.getY() || img.getLayoutY() == white_bishop_2.getY() || img.getLayoutY() == white_king.getY() || img.getLayoutY() == white_queen.getY()
|| img.getLayoutY() == black_rook_1.getY() || img.getLayoutY() == black_rook_2.getY() || img.getLayoutY() == black_knight_1.getY() || img.getLayoutY() == black_knight_2.getY()
|| img.getLayoutY() == black_bishop_1.getY() || img.getLayoutY() == black_bishop_2.getY() || img.getLayoutY() == black_king.getY() || img.getLayoutY() == black_queen.getY())) {
return true;
} else
return false;
}

public boolean isBlack(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_3.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_4.getId() 
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_5.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_6.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_7.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_8.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_king.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_king.getId()) {
System.out.println("BLACK");
return true;
} else
System.out.println("WHITE");
return false;
}

public boolean isPawn(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_3.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_4.getId() 
|| this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_5.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_6.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_7.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_pawn_8.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_3.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_4.getId() 
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_5.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_6.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_7.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_pawn_8.getId()) {
return true;
} else
return false;
}

public boolean isRook(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_rook_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_rook_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_rook_2.getId()) {
return true;
} else
return false;
}

public boolean isKnight(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_knight_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_knight_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_knight_2.getId()) {
return true;
} else
return false;
}

public boolean isBishop(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_bishop_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == white_bishop_2.getId()
|| this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_1.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_bishop_2.getId()) {
return true;
} else
return false;
}

public boolean isKing(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_king.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_king.getId()) {
return true;
} else
return false;
}

public boolean isQueen(MouseEvent event) {
if(this.pEvent.getPickResult().getIntersectedNode().getId() == white_queen.getId() || this.pEvent.getPickResult().getIntersectedNode().getId() == black_queen.getId()) {
return true;
} else
return false;
}

@FXML
void onMouseExited(MouseEvent event) {
/**
* if(green.isVisible()) {
red.setVisible(false);
} else if(red.isVisible())
green.setVisible(false);*/
}

@FXML
void checkDestination(MouseEvent event) {
//this.dEvent = event;
//System.out.println(locateDestination(event));
}

///GUI METHODS
public boolean isWhite() { //for GUI switching of colors only
//if circle is white, then the player is white
if(circle1.getStyle().equals("-fx-fill: white") && circle2.getStyle().equals("-fx-fill: white")) {
return true;
} else
return false;
}
public boolean isBlack() { //for GUI switching of colors only
//if circle is black, then the player is black
if(circle1.getStyle().equals("-fx-fill: black") && circle2.getStyle().equals("-fx-fill: black")) {
return true;
} else
return false;
}

public void handleNextPlayerButton() {
//switch the colors of the button and the label to denote the turn of the next player
if (isBlack()) {
nextPlayerButton.setStyle("-fx-background-color: black");
playerLabel.setText("White's Turn");
playerLabel.setStyle("-fx-text-fill: white");
circle1.setStyle("-fx-fill: white");
circle2.setStyle("-fx-fill: white");
switchPieces();
} else {
nextPlayerButton.setStyle("-fx-background-color: white");
playerLabel.setText("Black's Turn");
playerLabel.setStyle("-fx-text-fill: black");
circle1.setStyle("-fx-fill: black");
circle2.setStyle("-fx-fill: black");
switchPieces();
}
done=false;
}
public void handleNewGameButton() {
main.openGame();
}
public void handleHomeButton() {
main.openMain();
}
/**
* public boolean isPlayerWhite() { //method for identifying if piece is white
if(white_pawn_1.equals(white_pawn_1)||white_pawn_2.equals(white_pawn_2)||white_pawn_3.equals(white_pawn_3)
||white_pawn_4.equals(white_pawn_4)||white_pawn_5.equals(white_pawn_5)||white_pawn_6.equals(white_pawn_6)
||white_pawn_7.equals(white_pawn_7)||white_pawn_8.equals(white_pawn_8)||white_rook_1.equals(white_rook_1)
||white_rook_2.equals(white_rook_2)||white_knight_1.equals(white_knight_1)||white_knight_2.equals(white_knight_2)
||white_bishop_1.equals(white_bishop_1)||white_bishop_2.equals(white_bishop_2)||white_king.equals(white_king)
||white_queen.equals(white_queen)) {
return true;
} else
return false;
}
public boolean isPlayerBlack() { //method for identifying if piece is black
if(black_pawn_1.equals(black_pawn_1)||black_pawn_2.equals(black_pawn_2)||black_pawn_3.equals(black_pawn_3)
||black_pawn_4.equals(black_pawn_4)||black_pawn_5.equals(black_pawn_5)||black_pawn_6.equals(black_pawn_6)
||black_pawn_7.equals(black_pawn_7)||black_pawn_8.equals(black_pawn_8)||black_rook_1.equals(black_rook_1)
||black_rook_2.equals(black_rook_2)||black_knight_1.equals(black_knight_1)||black_knight_2.equals(black_knight_2)
||black_bishop_1.equals(black_bishop_1)||black_bishop_2.equals(black_bishop_2)||black_king.equals(black_king)
||black_queen.equals(black_queen)) {
return true;
} else
return false;
}*/
}
