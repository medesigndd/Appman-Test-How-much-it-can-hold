package Ass14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class RandomNumber extends Application {
	public void start(Stage primaryStage) {
		///declare variables and constants
		final int DISTANCE = 3;
		final int DIMENSIONS = 25;
		int randNum;
		String printNum;
		
		//set up the GridPane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(DISTANCE));
		pane.setHgap(DISTANCE);
		pane.setVgap(DISTANCE);
		
		for(int i = 0; i < 10; i++) { //outer loop for the rows
			for(int j = 0; j < 10; j++) { //outer loop for the columns
				//generate a random number from 0 to 1
				randNum = (int)(Math.random() * 2);
				if(randNum == 0) { //if the random number is 0
					//format it to string
					printNum = "0";
				}
				else { //if its 1
					//format it to a string
					printNum = "1";
				}
				
				//create TextField
				TextField tf = new TextField();
				tf.setMaxWidth(DIMENSIONS);
				tf.setMinWidth(DIMENSIONS);
				tf.setMaxHeight(DIMENSIONS);
				tf.setMinHeight(DIMENSIONS);
				tf.setText(printNum);
				pane.add(tf, j, i);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Matrix");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch();
	}
}
