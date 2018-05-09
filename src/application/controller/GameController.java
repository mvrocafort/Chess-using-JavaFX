package application.controller;

import java.util.ArrayList;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class GameController {
	public Main main;
	@FXML AnchorPane pane, mainPane;
	@FXML public Circle circle1, circle2;

    @FXML public Label playerLabel;

    @FXML public Button nextPlayerButton;

    @FXML public ImageView board;
   
    @FXML public ImageView white_pawn_1, white_pawn_2, white_pawn_3, white_pawn_4, 
    							white_pawn_5, white_pawn_6, white_pawn_7, white_pawn_8;
  
    @FXML public ImageView black_pawn_1, black_pawn_2, black_pawn_3, black_pawn_4,
    							black_pawn_5, black_pawn_6, black_pawn_7, black_pawn_8;
  
    @FXML public ImageView white_rook_1, white_rook_2, white_knight_1, white_knight_2,
    							white_bishop_1, white_bishop_2, white_king, white_queen;
 
    @FXML public ImageView black_rook_1, black_rook_2, black_knight_1, black_knight_2,
   							black_bishop_1, black_bishop_2, black_king, black_queen;
  
    @FXML public ImageView d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15,
    							d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, 
    							d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43,
    							d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57,
    							d58, d59, d60, d61, d62, d63;

    @FXML public ImageView e1w, e2w, e3w, e4w, e5w, e6w, e7w, e8w, e9w, e10w, e11w, e12w, e13w, e14w, e15w, e16w,
    							e1b, e2b, e3b, e4b, e5b, e6b, e7b, e8b, e9b, e10b, e11b, e12b, e13b, e14b, e15b, e16b;

    @FXML public boolean e1wCheck = false, e2wCheck = false, e3wCheck = false, e4wCheck = false, e5wCheck = false, e6wCheck = false, e7wCheck = false, e8wCheck = false, e9wCheck = false,
    		e10wCheck = false, e11wCheck = false, e12wCheck = false, e13wCheck = false, e14wCheck = false, e15wCheck = false, e16wCheck = false, e1bCheck = false, e2bCheck = false,
    		e3bCheck = false, e4bCheck = false, e5bCheck = false, e6bCheck = false, e7bCheck = false, e8bCheck = false, e9bCheck = false, e10bCheck = false, e11bCheck = false, e12bCheck = false,
    		e13bCheck = false, e14bCheck = false, e15bCheck = false, e16bCheck = false;
  
  @FXML  public ImageView locatedPiece, destination;
  
  @FXML public MouseEvent pEvent;
  @FXML public MouseEvent dEvent;
  
  boolean done = false;
  
  boolean start = false;
  
  boolean kingWasMoved = false;
  
  boolean rookWasMoved = false;
  
  boolean blackHasMoved = false;
  
  boolean whiteHasMoved = false;
  
  double referenceX, referenceY;

  @FXML
  public Circle green;

  @FXML
  public Circle red;
  
  public MouseEvent eEvent;
  
  MouseEvent transferEvent;
  
public void setMain(Main main) {
	this.main = main;
	initializePieces();
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
	
	ArrayList <ImageView>locatedPieceArray = new ArrayList<ImageView>();
	
	locatedPieceArray.add(white_pawn_1);
	locatedPieceArray.add(white_pawn_2);
	locatedPieceArray.add(white_pawn_3);
	locatedPieceArray.add(white_pawn_4);
	locatedPieceArray.add(white_pawn_5);
	locatedPieceArray.add(white_pawn_6);
	locatedPieceArray.add(white_pawn_7);
	locatedPieceArray.add(white_pawn_8);
	locatedPieceArray.add(white_rook_1);
	locatedPieceArray.add(white_rook_2);
	locatedPieceArray.add(white_knight_1);
	locatedPieceArray.add(white_knight_2);
	locatedPieceArray.add(white_bishop_1);
	locatedPieceArray.add(white_bishop_2);
	locatedPieceArray.add(white_king);
	locatedPieceArray.add(white_queen);
	locatedPieceArray.add(black_pawn_1);
	locatedPieceArray.add(black_pawn_2);
	locatedPieceArray.add(black_pawn_3);
	locatedPieceArray.add(black_pawn_4);
	locatedPieceArray.add(black_pawn_5);
	locatedPieceArray.add(black_pawn_6);
	locatedPieceArray.add(black_pawn_7);
	locatedPieceArray.add(black_pawn_8);
	locatedPieceArray.add(black_rook_1);
	locatedPieceArray.add(black_rook_2);
	locatedPieceArray.add(black_knight_1);
	locatedPieceArray.add(black_knight_2);
	locatedPieceArray.add(black_bishop_1);
	locatedPieceArray.add(black_bishop_2);
	locatedPieceArray.add(black_king);
	locatedPieceArray.add(black_queen);
	
	for(int i = 0; i < locatedPieceArray.size(); i++) {
		if(this.pEvent.getPickResult().getIntersectedNode().getId() == locatedPieceArray.get(i).getId()) {
			locatedPiece = locatedPieceArray.get(i);
		}
	}
	return locatedPiece;
}

public ImageView locateDestination(MouseEvent event) {
	this.dEvent = event;
		
	ArrayList <ImageView>locatedDestinationArray = new ArrayList<ImageView>();
	
	locatedDestinationArray.add(d0);
	locatedDestinationArray.add(d1);
	locatedDestinationArray.add(d2);
	locatedDestinationArray.add(d3);
	locatedDestinationArray.add(d4);
	locatedDestinationArray.add(d5);
	locatedDestinationArray.add(d6);
	locatedDestinationArray.add(d7);
	locatedDestinationArray.add(d8);
	locatedDestinationArray.add(d9);
	locatedDestinationArray.add(d10);
	locatedDestinationArray.add(d11);
	locatedDestinationArray.add(d12);
	locatedDestinationArray.add(d13);
	locatedDestinationArray.add(d14);
	locatedDestinationArray.add(d15);
	locatedDestinationArray.add(d16);
	locatedDestinationArray.add(d17);
	locatedDestinationArray.add(d18);
	locatedDestinationArray.add(d19);
	locatedDestinationArray.add(d20);
	locatedDestinationArray.add(d21);
	locatedDestinationArray.add(d22);
	locatedDestinationArray.add(d23);
	locatedDestinationArray.add(d24);
	locatedDestinationArray.add(d25);
	locatedDestinationArray.add(d26);
	locatedDestinationArray.add(d27);
	locatedDestinationArray.add(d28);
	locatedDestinationArray.add(d29);
	locatedDestinationArray.add(d30);
	locatedDestinationArray.add(d31);
	locatedDestinationArray.add(d32);
	locatedDestinationArray.add(d33);
	locatedDestinationArray.add(d34);
	locatedDestinationArray.add(d35);
	locatedDestinationArray.add(d36);
	locatedDestinationArray.add(d37);
	locatedDestinationArray.add(d38);
	locatedDestinationArray.add(d39);
	locatedDestinationArray.add(d40);
	locatedDestinationArray.add(d41);
	locatedDestinationArray.add(d42);
	locatedDestinationArray.add(d43);
	locatedDestinationArray.add(d44);
	locatedDestinationArray.add(d45);
	locatedDestinationArray.add(d46);
	locatedDestinationArray.add(d47);
	locatedDestinationArray.add(d48);
	locatedDestinationArray.add(d49);
	locatedDestinationArray.add(d50);
	locatedDestinationArray.add(d51);
	locatedDestinationArray.add(d52);
	locatedDestinationArray.add(d53);
	locatedDestinationArray.add(d54);
	locatedDestinationArray.add(d55);
	locatedDestinationArray.add(d56);
	locatedDestinationArray.add(d57);
	locatedDestinationArray.add(d58);
	locatedDestinationArray.add(d59);
	locatedDestinationArray.add(d60);
	locatedDestinationArray.add(d61);
	locatedDestinationArray.add(d62);
	locatedDestinationArray.add(d63);
	
	for(int i = 0; i < locatedDestinationArray.size(); i++) {
		if(this.dEvent.getPickResult().getIntersectedNode().getId() == locatedDestinationArray.get(i).getId()) {
			destination = locatedDestinationArray.get(i);
		}
	}
	return destination;
}

public void checkForPromotion() {
		ArrayList<ImageView>pawnArray = new ArrayList<ImageView>();
		
		pawnArray.add(white_pawn_1);
		pawnArray.add(white_pawn_2);
		pawnArray.add(white_pawn_3);
		pawnArray.add(white_pawn_4);
		pawnArray.add(white_pawn_5);
		pawnArray.add(white_pawn_6);
		pawnArray.add(white_pawn_7);
		pawnArray.add(white_pawn_8);

		pawnArray.add(black_pawn_1);
		pawnArray.add(black_pawn_2);
		pawnArray.add(black_pawn_3);
		pawnArray.add(black_pawn_4);
		pawnArray.add(black_pawn_5);
		pawnArray.add(black_pawn_6);
		pawnArray.add(black_pawn_7);
		pawnArray.add(black_pawn_8);
		
		for(int i = 0; i < pawnArray.size(); i++) {
			if(d0(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				main.openPromotion();
			} else if(d1(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d2(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d3(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d4(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d5(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d6(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d7(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d56(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d57(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d58(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d59(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d60(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d61(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d62(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			} else if(d63(pawnArray.get(i).getX(), pawnArray.get(i).getY())) {
				
			}
		}
}

public void switchPieces() {
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
	
	for(int i = 0; i < switchArray.size(); i++) {
		if(d0(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d63.getLayoutX());
			switchArray.get(i).setY(d63.getLayoutY());
		} else if(d1(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d62.getLayoutX());
			switchArray.get(i).setY(d62.getLayoutY());
		} else if(d2(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d61.getLayoutX());
			switchArray.get(i).setY(d61.getLayoutY());
		}
		else if(d3(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d60.getLayoutX());
			switchArray.get(i).setY(d60.getLayoutY());
		}
		else if(d4(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d59.getLayoutX());
			switchArray.get(i).setY(d59.getLayoutY());
		}
		else if(d5(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d58.getLayoutX());
			switchArray.get(i).setY(d58.getLayoutY());
		}
		else if(d6(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d57.getLayoutX());
			switchArray.get(i).setY(d57.getLayoutY());
		}
		else if(d7(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d56.getLayoutX());
			switchArray.get(i).setY(d56.getLayoutY());
		}
		else if(d8(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d55.getLayoutX());
			switchArray.get(i).setY(d55.getLayoutY());
		}
		else if(d9(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d54.getLayoutX());
			switchArray.get(i).setY(d54.getLayoutY());
		}
		else if(d10(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d53.getLayoutX());
			switchArray.get(i).setY(d53.getLayoutY());
		} else if(d11(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d52.getLayoutX());
			switchArray.get(i).setY(d52.getLayoutY());
		} else if(d12(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d51.getLayoutX());
			switchArray.get(i).setY(d51.getLayoutY());
		}
		else if(d13(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d50.getLayoutX());
			switchArray.get(i).setY(d50.getLayoutY());
		}
		else if(d14(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d49.getLayoutX());
			switchArray.get(i).setY(d49.getLayoutY());
		}
		else if(d15(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d48.getLayoutX());
			switchArray.get(i).setY(d48.getLayoutY());
		}
		else if(d16(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d47.getLayoutX());
			switchArray.get(i).setY(d47.getLayoutY());
		}
		else if(d17(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d46.getLayoutX());
			switchArray.get(i).setY(d46.getLayoutY());
		}
		else if(d18(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d45.getLayoutX());
			switchArray.get(i).setY(d45.getLayoutY());
		}
		else if(d19(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d44.getLayoutX());
			switchArray.get(i).setY(d44.getLayoutY());
		}
		else if(d20(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d43.getLayoutX());
			switchArray.get(i).setY(d43.getLayoutY());
		} else if(d21(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d42.getLayoutX());
			switchArray.get(i).setY(d42.getLayoutY());
		} else if(d22(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d41.getLayoutX());
			switchArray.get(i).setY(d41.getLayoutY());
		}
		else if(d23(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d40.getLayoutX());
			switchArray.get(i).setY(d40.getLayoutY());
		}
		else if(d24(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d39.getLayoutX());
			switchArray.get(i).setY(d39.getLayoutY());
		}
		else if(d25(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d38.getLayoutX());
			switchArray.get(i).setY(d38.getLayoutY());
		}
		else if(d26(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d37.getLayoutX());
			switchArray.get(i).setY(d37.getLayoutY());
		}
		else if(d27(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d36.getLayoutX());
			switchArray.get(i).setY(d36.getLayoutY());
		}
		else if(d28(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d35.getLayoutX());
			switchArray.get(i).setY(d35.getLayoutY());
		}
		else if(d29(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d34.getLayoutX());
			switchArray.get(i).setY(d34.getLayoutY());
		}
		else if(d30(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d33.getLayoutX());
			switchArray.get(i).setY(d33.getLayoutY());
		} else if(d31(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d32.getLayoutX());
			switchArray.get(i).setY(d32.getLayoutY());
		} else if(d32(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d31.getLayoutX());
			switchArray.get(i).setY(d31.getLayoutY());
		}
		else if(d33(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d30.getLayoutX());
			switchArray.get(i).setY(d30.getLayoutY());
		}
		else if(d34(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d29.getLayoutX());
			switchArray.get(i).setY(d29.getLayoutY());
		}
		else if(d35(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d28.getLayoutX());
			switchArray.get(i).setY(d28.getLayoutY());
		}
		else if(d36(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d27.getLayoutX());
			switchArray.get(i).setY(d27.getLayoutY());
		}
		else if(d37(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d26.getLayoutX());
			switchArray.get(i).setY(d26.getLayoutY());
		}
		else if(d38(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d25.getLayoutX());
			switchArray.get(i).setY(d25.getLayoutY());
		}
		else if(d39(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d24.getLayoutX());
			switchArray.get(i).setY(d24.getLayoutY());
		}
		else if(d40(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d23.getLayoutX());
			switchArray.get(i).setY(d23.getLayoutY());
		} else if(d41(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d22.getLayoutX());
			switchArray.get(i).setY(d22.getLayoutY());
		} else if(d42(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d21.getLayoutX());
			switchArray.get(i).setY(d21.getLayoutY());
		}
		else if(d43(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d20.getLayoutX());
			switchArray.get(i).setY(d20.getLayoutY());
		}
		else if(d44(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d19.getLayoutX());
			switchArray.get(i).setY(d19.getLayoutY());
		}
		else if(d45(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d18.getLayoutX());
			switchArray.get(i).setY(d18.getLayoutY());
		}
		else if(d46(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d17.getLayoutX());
			switchArray.get(i).setY(d17.getLayoutY());
		}
		else if(d47(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d16.getLayoutX());
			switchArray.get(i).setY(d16.getLayoutY());
		}
		else if(d48(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d15.getLayoutX());
			switchArray.get(i).setY(d15.getLayoutY());
		}
		else if(d49(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d14.getLayoutX());
			switchArray.get(i).setY(d14.getLayoutY());
		}
		else if(d50(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d13.getLayoutX());
			switchArray.get(i).setY(d13.getLayoutY());
		} else if(d51(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d12.getLayoutX());
			switchArray.get(i).setY(d12.getLayoutY());
		} else if(d52(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d11.getLayoutX());
			switchArray.get(i).setY(d11.getLayoutY());
		}
		else if(d53(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d10.getLayoutX());
			switchArray.get(i).setY(d10.getLayoutY());
		}
		else if(d54(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d9.getLayoutX());
			switchArray.get(i).setY(d9.getLayoutY());
		}
		else if(d55(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d8.getLayoutX());
			switchArray.get(i).setY(d8.getLayoutY());
		}
		else if(d56(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d7.getLayoutX());
			switchArray.get(i).setY(d7.getLayoutY());
		}
		else if(d57(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d6.getLayoutX());
			switchArray.get(i).setY(d6.getLayoutY());
		}
		else if(d58(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d5.getLayoutX());
			switchArray.get(i).setY(d5.getLayoutY());
		}
		else if(d59(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d4.getLayoutX());
			switchArray.get(i).setY(d4.getLayoutY());
		}
		else if(d60(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d3.getLayoutX());
			switchArray.get(i).setY(d3.getLayoutY());
		} else if(d61(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d2.getLayoutX());
			switchArray.get(i).setY(d2.getLayoutY());
		} else if(d62(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d1.getLayoutX());
			switchArray.get(i).setY(d1.getLayoutY());
		}
		else if(d63(switchArray.get(i).getX(), switchArray.get(i).getY())) {
			switchArray.get(i).setX(d0.getLayoutX());
			switchArray.get(i).setY(d0.getLayoutY());
		}
	}
}

@FXML public void selectPiece(MouseEvent event) {
	MouseButton button = event.getButton();
    		if(button==MouseButton.PRIMARY) { //left click, select piece
    			this.pEvent = event;

    		} else  if(button==MouseButton.SECONDARY){ //right click, eat piece
    			transferEvent = this.pEvent;
    			this.eEvent = event;
        			if(done == false) {
        				if(isEatValid(event)) {
        					//eat the piece
        					locatePiece(transferEvent).setX(locatePiece(this.eEvent).getX());
        					locatePiece(transferEvent).setY(locatePiece(this.eEvent).getY());
        					checkForPromotion();
        					checkForCastling();
 
        					//transfer the eaten piece to eat pane
        					pane.getChildren().remove(locatePiece(this.eEvent));
        					mainPane.getChildren().add(locatePiece(this.eEvent));
	  
        					if(isBlack() == true) {
        						if(e1b.getImage() != null) {
        							locatePiece(this.eEvent).setX(e1b.getLayoutX());
            						locatePiece(this.eEvent).setY(e1b.getLayoutY());
            						e1b.setImage(null);
        						} else if(e2b.getImage() != null){
        							locatePiece(this.eEvent).setX(e2b.getLayoutX());
            						locatePiece(this.eEvent).setY(e2b.getLayoutY());
            						e2b.setImage(null);
        						} else if(e3b.getImage() != null){
        							locatePiece(this.eEvent).setX(e3b.getLayoutX());
            						locatePiece(this.eEvent).setY(e3b.getLayoutY());
            						e3b.setImage(null);
        						} else if(e4b.getImage() != null){
        							locatePiece(this.eEvent).setX(e4b.getLayoutX());
            						locatePiece(this.eEvent).setY(e4b.getLayoutY());
            						e4b.setImage(null);
        						} else if(e5b.getImage() != null){
        							locatePiece(this.eEvent).setX(e5b.getLayoutX());
            						locatePiece(this.eEvent).setY(e5b.getLayoutY());
            						e5b.setImage(null);
        						} else if(e6b.getImage() != null){
        							locatePiece(this.eEvent).setX(e6b.getLayoutX());
            						locatePiece(this.eEvent).setY(e6b.getLayoutY());
            						e6b.setImage(null);
        						} else if(e7b.getImage() != null){
        							locatePiece(this.eEvent).setX(e7b.getLayoutX());
            						locatePiece(this.eEvent).setY(e7b.getLayoutY());
            						e7b.setImage(null);
        						} else if(e8b.getImage() != null){
        							locatePiece(this.eEvent).setX(e8b.getLayoutX());
            						locatePiece(this.eEvent).setY(e8b.getLayoutY());
            						e8b.setImage(null);
        						} else if(e9b.getImage() != null){
        							locatePiece(this.eEvent).setX(e9b.getLayoutX());
            						locatePiece(this.eEvent).setY(e9b.getLayoutY());
            						e9b.setImage(null);
        						} else if(e10b.getImage() != null){
        							locatePiece(this.eEvent).setX(e10b.getLayoutX());
            						locatePiece(this.eEvent).setY(e10b.getLayoutY());
            						e10b.setImage(null);
        						} else if(e11b.getImage() != null){
        							locatePiece(this.eEvent).setX(e11b.getLayoutX());
            						locatePiece(this.eEvent).setY(e11b.getLayoutY());
            						e11b.setImage(null);
        						} else if(e12b.getImage() != null){
        							locatePiece(this.eEvent).setX(e12b.getLayoutX());
            						locatePiece(this.eEvent).setY(e12b.getLayoutY());
            						e12b.setImage(null);
        						} else if(e2b.getImage() != null){
        							locatePiece(this.eEvent).setX(e13b.getLayoutX());
            						locatePiece(this.eEvent).setY(e13b.getLayoutY());
            						e13b.setImage(null);
        						} else if(e14b.getImage() != null){
        							locatePiece(this.eEvent).setX(e14b.getLayoutX());
            						locatePiece(this.eEvent).setY(e14b.getLayoutY());
            						e14b.setImage(null);
        						} else if(e15b.getImage() != null){
        							locatePiece(this.eEvent).setX(e15b.getLayoutX());
            						locatePiece(this.eEvent).setY(e15b.getLayoutY());
            						e15b.setImage(null);
        						} else if(e16b.getImage() != null){
        							locatePiece(this.eEvent).setX(e16b.getLayoutX());
            						locatePiece(this.eEvent).setY(e16b.getLayoutY());
            						e16b.setImage(null);
        						} 
        					} else if(isBlack() == false) {
        						if(e1w.getImage() != null) {
        							locatePiece(this.eEvent).setX(e1w.getLayoutX());
            						locatePiece(this.eEvent).setY(e1w.getLayoutY());
            						e1w.setImage(null);
        						} else if(e2w.getImage() != null){
        							locatePiece(this.eEvent).setX(e2w.getLayoutX());
            						locatePiece(this.eEvent).setY(e2w.getLayoutY());
            						e2w.setImage(null);
        						} else if(e3w.getImage() != null){
        							locatePiece(this.eEvent).setX(e3w.getLayoutX());
            						locatePiece(this.eEvent).setY(e3w.getLayoutY());
            						e3w.setImage(null);
        						} else if(e4w.getImage() != null){
        							locatePiece(this.eEvent).setX(e4w.getLayoutX());
            						locatePiece(this.eEvent).setY(e4w.getLayoutY());
            						e4w.setImage(null);
        						} else if(e5w.getImage() != null){
        							locatePiece(this.eEvent).setX(e5w.getLayoutX());
            						locatePiece(this.eEvent).setY(e5w.getLayoutY());
            						e5w.setImage(null);
        						} else if(e6w.getImage() != null){
        							locatePiece(this.eEvent).setX(e6w.getLayoutX());
            						locatePiece(this.eEvent).setY(e6w.getLayoutY());
            						e6w.setImage(null);
        						} else if(e7w.getImage() != null){
        							locatePiece(this.eEvent).setX(e7w.getLayoutX());
            						locatePiece(this.eEvent).setY(e7w.getLayoutY());
            						e7w.setImage(null);
        						} else if(e8w.getImage() != null){
        							locatePiece(this.eEvent).setX(e8w.getLayoutX());
            						locatePiece(this.eEvent).setY(e8w.getLayoutY());
            						e8w.setImage(null);
        						} else if(e9w.getImage() != null){
        							locatePiece(this.eEvent).setX(e9w.getLayoutX());
            						locatePiece(this.eEvent).setY(e9w.getLayoutY());
            						e9w.setImage(null);
        						} else if(e10w.getImage() != null){
        							locatePiece(this.eEvent).setX(e10w.getLayoutX());
            						locatePiece(this.eEvent).setY(e10w.getLayoutY());
            						e10w.setImage(null);
        						} else if(e11w.getImage() != null){
        							locatePiece(this.eEvent).setX(e11w.getLayoutX());
            						locatePiece(this.eEvent).setY(e11w.getLayoutY());
            						e11w.setImage(null);
        						} else if(e12w.getImage() != null){
        							locatePiece(this.eEvent).setX(e12w.getLayoutX());
            						locatePiece(this.eEvent).setY(e12w.getLayoutY());
            						e12w.setImage(null);
        						} else if(e2w.getImage() != null){
        							locatePiece(this.eEvent).setX(e13w.getLayoutX());
            						locatePiece(this.eEvent).setY(e13w.getLayoutY());
            						e13w.setImage(null);
        						} else if(e14w.getImage() != null){
        							locatePiece(this.eEvent).setX(e14w.getLayoutX());
            						locatePiece(this.eEvent).setY(e14w.getLayoutY());
            						e14w.setImage(null);
        						} else if(e15w.getImage() != null){
        							locatePiece(this.eEvent).setX(e15w.getLayoutX());
            						locatePiece(this.eEvent).setY(e15w.getLayoutY());
            						e15w.setImage(null);
        						} else if(e16w.getImage() != null){
        							locatePiece(this.eEvent).setX(e16w.getLayoutX());
            						locatePiece(this.eEvent).setY(e16w.getLayoutY());
            						e16w.setImage(null);
        						} 
        					}
	  
        					//check king
        					if(locatePiece(this.eEvent) == white_king) {
        						main.openBlackWins();
        					} else if(locatePiece(this.eEvent) == black_king) {
        						main.openWhiteWins();
        					}	
        					
        				} else
        					showInvalidMoveMessage();
        			} else
        				showNextButtonMessage();
    		}

}

public void selectDestination(MouseEvent event) {
     if(done == false) {
    	 	if(isMoveValid(event)) {
    	 		locatePiece(this.pEvent).setX(locateDestination(event).getLayoutX());
    	 		locatePiece(this.pEvent).setY(locateDestination(event).getLayoutY());
    	 		done = true;
    	 		checkForPromotion();
    	 		checkForCastling();
   	 } else
   		showInvalidMoveMessage();
   	 //JOptionPane.showConfirmDialog(null, "I N V A L I D  M O V E!");
      } else
    	  	showNextButtonMessage();
   	 //JOptionPane.showConfirmDialog(null, "Please click the N E X T  P L A Y E R  B U T T O N");
}

public void checkForCastling() {
	System.out.println("transferEvent: "+transferEvent);
	System.out.println("eEvent: "+this.eEvent);
	if(kingWasMoved == false && rookWasMoved == false) {
   		if(validKing() == true && validRook() == true) {
      		 System.out.println("Valid for CASTLING");
   			
      	 }
   	 }
}

public boolean validKing() {
	if(white_king.getX() == d60.getLayoutX() && white_king.getY() == d60.getLayoutY() 
			|| white_king.getX() == d3.getLayoutX() && white_king.getY() == d3.getLayoutY()
			|| black_king.getX() == d3.getLayoutX() && black_king.getY() == d3.getLayoutY()
			|| black_king.getX() == d60.getLayoutX() && black_king.getY() == d60.getLayoutY()) {
		return true;
	} else
		return false;
}

public boolean validRook() {
	if((white_rook_1.getX() == d56.getLayoutX() && white_rook_1.getY() == d56.getLayoutY()
			&& white_rook_2.getX() == d63.getLayoutX() && white_rook_2.getY() == d63.getLayoutY())
			|| (black_rook_1.getX() == d56.getLayoutX() && black_rook_1.getY() == d56.getLayoutY()
					&& black_rook_2.getX() == d63.getLayoutX() && black_rook_2.getY() == d63.getLayoutY())) {
		return true;
	} else 
		return false;
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
			return true;
		} else
			return false;
	} else if(isRook(event)) {
		if(xReference == xLocation || yReference == yLocation) {
			rookWasMoved = true;
			return true;
		} else
			return false;
	} else if(isKnight(event)) {
		if((knightDistanceCheckX == 50 && knightDistanceCheckY == 100) || (knightDistanceCheckX == 100 && knightDistanceCheckY == 50)) {
			return true;
		} else
			return false;
	} else if(isBishop(event)) {
		if(xReference != xLocation && yReference != yLocation) {
			return true;
		} else
			return false;
	} else if(isKing(event)) {
		if(kingDistanceCheckX == 50 || kingDistanceCheckY == 50) {
			kingWasMoved = true;
			return true;
		} else
			return false;
	} else //if(isQueen(event))
		if((xReference == xLocation || yReference == yLocation) || (xReference != xLocation && yReference != yLocation)) {
			return true;
		} else
			return false;
}

public boolean isEatValid(MouseEvent event) {
	
	this.eEvent = event;
	
	double xReference = locatePiece(transferEvent).getX();
	double yReference = locatePiece(transferEvent).getY();
	double xLocation = locatePiece(this.eEvent).getX();
	double yLocation = locatePiece(this.eEvent).getY();
	
	double pawnDistanceCheckX = Math.abs(xReference - xLocation);
	double pawnDistanceCheckY = Math.abs(yReference - yLocation);
	
	double knightDistanceCheckX = Math.abs(xReference - xLocation);
	double knightDistanceCheckY = Math.abs(yReference - yLocation);
	
	double kingDistanceCheckX = Math.abs(xReference - xLocation);
	double kingDistanceCheckY = Math.abs(yReference - yLocation);

	//System.out.println("Reference X: "+locatePiece(this.eEvent).getX());
	//System.out.println("Reference Y: "+locatePiece(this.eEvent).getY());
	
	//System.out.println("Location X: "+locatePiece(transferEvent).getX());
	//System.out.println("Location Y: "+locatePiece(transferEvent).getY());
	
	if(isPawn(event)) {
	if((pawnDistanceCheckX == 50 && pawnDistanceCheckY == 50) && xReference != xLocation) {
	 
	//green.setLayoutX(locateDestination(event).getLayoutX()+22.5);
	//green.setLayoutY(locateDestination(event).getLayoutY()+22.5);
	//green.setVisible(true);
	return true;
	} else
	 
	//red.setLayoutX(locateDestination(event).getLayoutX()+22.5);
	//red.setLayoutY(locateDestination(event).getLayoutY()+22.5);
	//red.setVisible(true);
	return false;
	} else if(isRook(event)) {
	if(xReference == xLocation || yReference == yLocation) {
		rookWasMoved = true;
		return true;
	} else
	 
	return false;
	} else if(isKnight(event)) {
		//System.out.println("kingDistanceCheckX: "+kingDistanceCheckX);
		//System.out.println("kingDistanceCheckY: "+kingDistanceCheckY);
	if((knightDistanceCheckX == 50 && knightDistanceCheckY == 100) || (knightDistanceCheckX == 100 && knightDistanceCheckY == 50)) {
		return true;
	} else
		return false;
	} else if(isBishop(event)) {
	if(xReference != xLocation && yReference != yLocation) {
	 
	return true;
	} else
	 
	return false;
	} else if(isKing(event)) {
	if(kingDistanceCheckX == 50 || kingDistanceCheckY == 50) {
		kingWasMoved = true;
	 
	return true;
	} else
	 
	return false;
	} else //if(isQueen(event))
	if((xReference == xLocation || yReference == yLocation) || (xReference != xLocation && yReference != yLocation)) {
	 
	return true;
	} else
	 
	return false;
}

public boolean d0(double x, double y) {
	if(x == d0.getLayoutX() && y == d0.getLayoutY()) {
		return true;
	} else
		return false;
	}

public boolean d1(double x, double y) {
	if(x == d1.getLayoutX() && y == d1.getLayoutY()) {
		return true;
	} else
		return false;
	}

public boolean d2(double x, double y) {
if(x == d2.getLayoutX() && y == d2.getLayoutY()) {
return true;
} else
return false;
}

public boolean d3(double x, double y) {
if(x == d3.getLayoutX() && y == d3.getLayoutY()) {
return true;
} else
return false;
}

public boolean d4(double x, double y) {
if(x == d4.getLayoutX() && y == d4.getLayoutY()) {
return true;
} else
return false;
}

public boolean d5(double x, double y) {
if(x == d5.getLayoutX() && y == d5.getLayoutY()) {
return true;
} else
return false;
}

public boolean d6(double x, double y) {
if(x == d6.getLayoutX() && y == d6.getLayoutY()) {
return true;
} else
return false;
}

public boolean d7(double x, double y) {
if(x == d7.getLayoutX() && y == d7.getLayoutY()) {
return true;
} else
return false;
}

public boolean d8(double x, double y) {
if(x == d8.getLayoutX() && y == d8.getLayoutY()) {
return true;
} else
return false;
}

public boolean d9(double x, double y) {
if(x == d9.getLayoutX() && y == d9.getLayoutY()) {
return true;
} else
return false;
}

public boolean d10(double x, double y) {
if(x == d10.getLayoutX() && y == d10.getLayoutY()) {
return true;
} else
return false;
}

public boolean d11(double x, double y) {
if(x == d11.getLayoutX() && y == d11.getLayoutY()) {
return true;
} else
return false;
}

public boolean d12(double x, double y) {
if(x == d12.getLayoutX() && y == d12.getLayoutY()) {
return true;
} else
return false;
}

public boolean d13(double x, double y) {
if(x == d13.getLayoutX() && y == d13.getLayoutY()) {
return true;
} else
return false;
}

public boolean d14(double x, double y) {
if(x == d14.getLayoutX() && y == d14.getLayoutY()) {
return true;
} else
return false;
}

public boolean d15(double x, double y) {
if(x == d15.getLayoutX() && y == d15.getLayoutY()) {
return true;
} else
return false;
}

public boolean d16(double x, double y) {
if(x == d16.getLayoutX() && y == d16.getLayoutY()) {
return true;
} else
return false;
}

public boolean d17(double x, double y) {
if(x == d17.getLayoutX() && y == d17.getLayoutY()) {
return true;
} else
return false;
}

public boolean d18(double x, double y) {
if(x == d18.getLayoutX() && y == d18.getLayoutY()) {
return true;
} else
return false;
}

public boolean d19(double x, double y) {
if(x == d19.getLayoutX() && y == d19.getLayoutY()) {
return true;
} else
return false;
}

public boolean d20(double x, double y) {
if(x == d20.getLayoutX() && y == d20.getLayoutY()) {
return true;
} else
return false;
}
public boolean d21(double x, double y) {
if(x == d21.getLayoutX() && y == d21.getLayoutY()) {
return true;
} else
return false;
}
public boolean d22(double x, double y) {
if(x == d22.getLayoutX() && y == d22.getLayoutY()) {
return true;
} else
return false;
}
public boolean d23(double x, double y) {
if(x == d23.getLayoutX() && y == d23.getLayoutY()) {
return true;
} else
return false;
}
public boolean d24(double x, double y) {
if(x == d24.getLayoutX() && y == d24.getLayoutY()) {
return true;
} else
return false;
}
public boolean d25(double x, double y) {
if(x == d25.getLayoutX() && y == d25.getLayoutY()) {
return true;
} else
return false;
}
public boolean d26(double x, double y) {
if(x == d26.getLayoutX() && y == d26.getLayoutY()) {
return true;
} else
return false;
}
public boolean d27(double x, double y) {
if(x == d27.getLayoutX() && y == d27.getLayoutY()) {
return true;
} else
return false;
}
public boolean d28(double x, double y) {
if(x == d28.getLayoutX() && y == d28.getLayoutY()) {
return true;
} else
return false;
}
public boolean d29(double x, double y) {
if(x == d29.getLayoutX() && y == d29.getLayoutY()) {
return true;
} else
return false;
}
public boolean d30(double x, double y) {
if(x == d30.getLayoutX() && y == d30.getLayoutY()) {
return true;
} else
return false;
}
public boolean d31(double x, double y) {
if(x == d31.getLayoutX() && y == d31.getLayoutY()) {
return true;
} else
return false;
}
public boolean d32(double x, double y) {
if(x == d32.getLayoutX() && y == d32.getLayoutY()) {
return true;
} else
return false;
}
public boolean d33(double x, double y) {
if(x == d33.getLayoutX() && y == d33.getLayoutY()) {
return true;
} else
return false;
}
public boolean d34(double x, double y) {
if(x == d34.getLayoutX() && y == d34.getLayoutY()) {
return true;
} else
return false;
}
public boolean d35(double x, double y) {
if(x == d35.getLayoutX() && y == d35.getLayoutY()) {
return true;
} else
return false;
}
public boolean d36(double x, double y) {
if(x == d36.getLayoutX() && y == d36.getLayoutY()) {
return true;
} else
return false;
}
public boolean d37(double x, double y) {
if(x == d37.getLayoutX() && y == d37.getLayoutY()) {
return true;
} else
return false;
}
public boolean d38(double x, double y) {
if(x == d38.getLayoutX() && y == d38.getLayoutY()) {
return true;
} else
return false;
}
public boolean d39(double x, double y) {
if(x == d39.getLayoutX() && y == d39.getLayoutY()) {
return true;
} else
return false;
}
public boolean d40(double x, double y) {
if(x == d40.getLayoutX() && y == d40.getLayoutY()) {
return true;
} else
return false;
}
public boolean d41(double x, double y) {
if(x == d41.getLayoutX() && y == d41.getLayoutY()) {
return true;
} else
return false;
}
public boolean d42(double x, double y) {
if(x == d42.getLayoutX() && y == d42.getLayoutY()) {
return true;
} else
return false;
}
public boolean d43(double x, double y) {
if(x == d43.getLayoutX() && y == d43.getLayoutY()) {
return true;
} else
return false;
}
public boolean d44(double x, double y) {
if(x == d44.getLayoutX() && y == d44.getLayoutY()) {
return true;
} else
return false;
}
public boolean d45(double x, double y) {
if(x == d45.getLayoutX() && y == d45.getLayoutY()) {
return true;
} else
return false;
}

public boolean d46(double x, double y) {
if(x == d46.getLayoutX() && y == d46.getLayoutY()) {
return true;
} else
return false;
}

public boolean d47(double x, double y) {
if(x == d47.getLayoutX() && y == d47.getLayoutY()) {
return true;
} else
return false;
}

public boolean d48(double x, double y) {
if(x == d48.getLayoutX() && y == d48.getLayoutY()) {
return true;
} else
return false;
}

public boolean d49(double x, double y) {
if(x == d49.getLayoutX() && y == d49.getLayoutY()) {
return true;
} else
return false;
}

public boolean d50(double x, double y) {
if(x == d50.getLayoutX() && y == d50.getLayoutY()) {
return true;
} else
return false;
}
public boolean d51(double x, double y) {
if(x == d51.getLayoutX() && y == d51.getLayoutY()) {
return true;
} else
return false;
}
public boolean d52(double x, double y) {
if(x == d52.getLayoutX() && y == d52.getLayoutY()) {
return true;
} else
return false;
}
public boolean d53(double x, double y) {
if(x == d53.getLayoutX() && y == d53.getLayoutY()) {
return true;
} else
return false;
}
public boolean d54(double x, double y) {
if(x == d54.getLayoutX() && y == d54.getLayoutY()) {
return true;
} else
return false;
}
public boolean d55(double x, double y) {
if(x == d55.getLayoutX() && y == d55.getLayoutY()) {
return true;
} else
return false;
}
public boolean d56(double x, double y) {
if(x == d56.getLayoutX() && y == d56.getLayoutY()) {
return true;
} else
return false;
}
public boolean d57(double x, double y) {
if(x == d57.getLayoutX() && y == d57.getLayoutY()) {
return true;
} else
return false;
}
public boolean d58(double x, double y) {
if(x == d58.getLayoutX() && y == d58.getLayoutY()) {
return true;
} else
return false;
}
public boolean d59(double x, double y) {
if(x == d59.getLayoutX() && y == d59.getLayoutY()) {
return true;
} else
return false;
}
public boolean d60(double x, double y) {
if(x == d60.getLayoutX() && y == d60.getLayoutY()) {
return true;
} else
return false;
}
public boolean d61(double x, double y) {
if(x == d61.getLayoutX() && y == d61.getLayoutY()) {
return true;
} else
return false;
}
public boolean d62(double x, double y) {
if(x == d62.getLayoutX() && y == d62.getLayoutY()) {
return true;
} else
return false;
}
public boolean d63(double x, double y) {
if(x == d63.getLayoutX() && y == d63.getLayoutY()) {
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
return true;
} else
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
public void promoteZone(MouseEvent event) {
	
}

///GUI METHODS
public void showInvalidMoveMessage() {
	main.openInvalidMove();
}

public void showNextButtonMessage() {
	main.openNextButton();
}

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
}
