package week4.practicum2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Backup extends Application implements EventHandler<ActionEvent> {

	@Override
	public void start(Stage primaryStage) {
		
		//Creating a GridPane container
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		
		//grid.setVgap(3);
		//grid.setHgap(3);
		
		FlowPane root = new FlowPane();
		root.getChildren().add(grid);
		
		Label label_text = new Label("Text");
		label_text.setText("Voer uw gegevens in!");
		GridPane.setConstraints(label_text, 0, 0);
		
		Label label_naam = new Label("Naam");
		label_naam.setText("Naam");
		GridPane.setConstraints(label_naam, 0, 1);
		
		Label label_adres = new Label("Adres");
		label_adres.setText("adres:");
		GridPane.setConstraints(label_adres, 0, 2);
		
		Label label_aankomstdatum = new Label("Aankomstdatum");
		label_aankomstdatum.setText("aankomstdatum");
		GridPane.setConstraints(label_aankomstdatum, 0, 3);
		
		Label label_vertrekdatum = new Label("Vertrekdatum");
		label_vertrekdatum.setText("Vertrekdatum");
		GridPane.setConstraints(label_vertrekdatum, 0, 4);
	
		Label label_kamertype = new Label("Kamertype");
		label_kamertype.setText("kamertype:");
		GridPane.setConstraints(label_kamertype, 0, 5);
		
		// Voeg labels toe
		grid.getChildren().addAll(label_text,label_naam,label_adres,label_aankomstdatum,label_vertrekdatum,label_kamertype);
		
		TextField TF_naam = new TextField ();
		TF_naam.setPromptText("Vul uw naam in");
		GridPane.setConstraints(TF_naam, 1, 1);
		
		TextField TF_adres = new TextField ();
		TF_adres.setPromptText("Vul uw adres in");
		GridPane.setConstraints(TF_adres, 1, 2);
		
		// Voeg textfield toe
		grid.getChildren().addAll(TF_naam, TF_adres);
		
		// DATEPICKER
		
		DatePicker DP_aankomstdatum = new DatePicker();
		GridPane.setConstraints(DP_aankomstdatum, 1, 3);
		
		DatePicker DP_vertrekdatum = new DatePicker();
		GridPane.setConstraints(DP_vertrekdatum, 1, 4);
		
		grid.getChildren().addAll(DP_aankomstdatum,DP_vertrekdatum);
		
		// COMBO BOX
		ObservableList<String> options = 
		//ObservableList<KamerType> options = 
			    FXCollections.observableArrayList(
			        "Klein",
			        "Middle",
			        "Groot"
			    );
		ComboBox comboBox = new ComboBox(options);
		
		// Voeg combobox toe
		GridPane.setConstraints(comboBox, 1, 5);
		grid.getChildren().addAll(comboBox);
	
		
		// BUTTONS
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.CENTER_RIGHT);
		GridPane.setConstraints(hbox, 1, 6);
		grid.getChildren().add(hbox);
		
		Button btn_boek = new Button();
		btn_boek.setText("boek");
		btn_boek.setOnAction(this);
		GridPane.setConstraints(btn_boek, 3, 6);
		hbox.getChildren().add(btn_boek);
		
		btn_boek.setOnAction((ActionEvent e) -> {
			System.out.println("Boek");
		});
		
		Button btn_reset = new Button();
		btn_reset.setText("reset");
		btn_reset.setOnAction(this);
		GridPane.setConstraints(btn_reset, 2, 6);
		hbox.getChildren().add(btn_reset);
		
		btn_reset.setOnAction((ActionEvent e) -> {
			System.out.println("Reset");
		});
		
		//root.getChildren().add(btn);
		Scene scene = new Scene(root, 350, 175);
		primaryStage.setTitle("Boekings App");
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