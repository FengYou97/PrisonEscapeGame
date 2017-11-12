package lab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab8Driver extends Application{
//	private AsylumMap map = new AsylumMap();
	@Override
	public void start(Stage primaryStage) {
		try {
			MapPane root = new MapPane();
			
			Scene scene = new Scene(root,200,200);
			scene.getStylesheets().add("lab8/application.css");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			root.start(primaryStage);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		// test git status
	}
}
