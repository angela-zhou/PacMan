package finalProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Angela Zhou
 * Date: June 2018
 * Course: ICS3U
 * Teacher: Mrs. Spindler
 * MazeController.java
 */
public class PacMan extends Application {

	// screen constants
	public static final double SCREEN_WIDTH = 800;
	public static final double SCREEN_HEIGHT = 600;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane root = (Pane)FXMLLoader.load(getClass().getResource("Maze.fxml"));
		
		Scene scene = new Scene (root, SCREEN_WIDTH, SCREEN_HEIGHT);
		
		root.requestFocus();
		
		primaryStage.setTitle("Pac-Man");
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main (String [] args) {
		launch(args);
	}

}
