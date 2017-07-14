package week4.les8.oefening1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application implements EventHandler<ActionEvent> {

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Label");
		Button btn = new Button("Button");
		Button btn2 = new Button("Button2");
		//btn.setText("Say 'Hello World'");
		btn.setOnAction(this);
		btn2.setOnAction(this);
		VBox root = new VBox();
		root.getChildren().add(btn);
		root.getChildren().add(btn2);
		root.getChildren().add(label);
		root.setPrefWidth(10);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	            System.out.println("Button 1");
	            btn2.toFront();
	            root.getChildren().add(new Label("Button 1"));
	        }
	    });
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

	        @Override
	        public void handle(ActionEvent event) {
	            System.out.println("Button 2");
	            btn.toFront();
	            root.getChildren().add(new Button("Button NEW"));
	        }
	    });
		
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}