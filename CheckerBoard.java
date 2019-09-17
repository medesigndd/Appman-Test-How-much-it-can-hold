package Ass14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class CheckerBoard extends Application {
	public void start(Stage primaryStage) {
		//declare variables for position and dimensions
		double positionX = 0;
		double positionY = 0;
		final double DIMENSIONS = 50;
		
		//create pane
		Pane pane = new Pane();
		
		for(int i = 0; i < 8; i++) {//outer loop for each row
			for(int j = 0; j < 8; j++) {//inner loop for each column
				//create the rectangle
				Rectangle r = new Rectangle(positionX, positionY, DIMENSIONS, DIMENSIONS);
				if(i % 2 == 0) {//if row number is an odd even number
					if(j % 2 == 0) {//if the column number is even
						r.setFill(Color.WHITE);
					}
					else {//if the column number is odd
						r.setFill(Color.BLACK);
					}
				}
				else {//if the row number is even
					if(j % 2 == 0) {//if the column number is even
						r.setFill(Color.BLACK);
					}
					else {//if the row number is odd
						r.setFill(Color.WHITE);
					}
				}
				//add
				pane.getChildren().add(r);
				//increase the position of x by 30
				positionX += DIMENSIONS;
			}
			//increase the position of y by 30
			positionY += DIMENSIONS;
			//set the position of x to 0
			positionX = 0;
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Checker Board");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
 }
