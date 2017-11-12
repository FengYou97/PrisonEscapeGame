package lab8;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MapPane extends BorderPane {

	int column;
	int row;
	
	private AsylumMap map = new AsylumMap();
	private BorderPane border = new BorderPane();
	private GridPane grid = new GridPane();
	private Scene scene = new Scene(border);
	private Guard guard = new Guard(1, 1);
		
	public Label[][] labelGridArray = new Label[20][20];		

	public void start(Stage primary) {
		
		int stepCount = 0;
		
		scene.getStylesheets().add("lab8/application.css");
		border.getStyleClass().add("border");
		grid.getStyleClass().add("grid");
		
		Label title = new Label("Scaryville State Home for the Criminally Insane");
		title.getStyleClass().add("text");
		
		Button button = new Button("Make New Game");
		VBox vBox = new VBox();
		HBox HBoxButton = new HBox();
		VBox VBoxButton = new VBox();
		HBox titleBox = new HBox();
		
		map.makeGrid();
		showMap();

		button.setOnMouseClicked(e -> {
			map.makeGrid();
			showMap();
		});
		
		scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
		    if (event.getCode().equals(KeyCode.F10)) {
		        try {
		        		map.makeGrid();
					showMap();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		});
		
		scene.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.UP) {
				map.makeGrid();
				showMap();
			}
		});

		titleBox.getStyleClass().add("title");
		titleBox.getChildren().add(title);
		
		HBoxButton.getStyleClass().add("button");
		HBoxButton.getChildren().add(button);
		VBoxButton.getChildren().add(HBoxButton);
		vBox.getChildren().add(grid);
		
		border.setTop((titleBox));
		border.setCenter(vBox);
		border.setBottom(VBoxButton);
		
		primary.setScene(scene);
		primary.show();

	}

	public void showMap() {
		for (column = 0; column < 20; column++) {
			for (row = 0; row < 20; row++) {
				Label block = new Label();
				if (map.asylumLayout[column][row].getValue() == 'W') {
					block.getStyleClass().add("wall");
					
				} else if (map.asylumLayout[column][row].getValue() == 'E') {
					block.setText("E");
					block.getStyleClass().add("end");
					
				} else if (map.asylumLayout[column][row].getValue() == 'S') {
					block.setText("S");
					block.getStyleClass().add("start");

				} else {
					block.getStyleClass().add("plainBox");
				}

				labelGridArray[column][row] = block;
				grid.add(block, column, row);
			}
		}
	}

//	@Override
//	public void handle(final KeyEvent keyEvent) {
//		if (keyEvent.getCode() == KeyCode.F10) {
//			map.makeGrid();
//			showMap();
//		}
//	}

}
