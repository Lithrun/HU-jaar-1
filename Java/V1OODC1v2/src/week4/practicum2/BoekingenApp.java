package week4.practicum2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
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

public class BoekingenApp extends Application implements EventHandler<ActionEvent> {

	@Override
	public void start(Stage primaryStage) {
		
		FlowPane root = new FlowPane();
		root.setVgap(10);
		//root.setHgap(3);
		
		Label label_text = new Label("Text");
		label_text.setText("Voer uw gegevens in!");
		label_text.setPrefWidth(350);
		
		Label label_naam = new Label("Naam");
		label_naam.setText("Naam");
		label_naam.setPrefWidth(100);
		
		Label label_adres = new Label("Adres");
		label_adres.setText("adres:");
		label_adres.setPrefWidth(100);
		
		Label label_aankomstdatum = new Label("Aankomstdatum");
		label_aankomstdatum.setText("aankomstdatum");
		label_aankomstdatum.setPrefWidth(100);
		
		Label label_vertrekdatum = new Label("Vertrekdatum");
		label_vertrekdatum.setText("Vertrekdatum");
		label_vertrekdatum.setPrefWidth(100);
	
		Label label_kamertype = new Label("Kamertype");
		label_kamertype.setText("kamertype:");
		label_kamertype.setPrefWidth(100);

		
		TextField TF_naam = new TextField ();
		TF_naam.setPromptText("Vul uw naam in");
		TF_naam.setPrefWidth(250);
		
		TextField TF_adres = new TextField ();
		TF_adres.setPromptText("Vul uw adres in");
		TF_adres.setPrefWidth(250);
		
		
		// DATEPICKER
		
		DatePicker DP_aankomstdatum = new DatePicker();
		DP_aankomstdatum.setPrefWidth(250);
		
		DatePicker DP_vertrekdatum = new DatePicker();
		DP_vertrekdatum.setPrefWidth(250);

		
		// COMBO BOX
		ObservableList<String> options = 
		//ObservableList<KamerType> options = 
			    FXCollections.observableArrayList(
			        "Klein",
			        "Middle",
			        "Groot"
			    );
		ComboBox comboBox = new ComboBox(options);
		comboBox.setPrefWidth(250);
		
		// BUTTONS
		
		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.setPrefWidth(340);
		
		root.getChildren().addAll(label_text,label_naam,TF_naam,label_adres,TF_adres,label_aankomstdatum,DP_aankomstdatum,label_vertrekdatum,DP_vertrekdatum,label_kamertype,comboBox,hbox);
		
		Button btn_boek = new Button();
		btn_boek.setText("boek");
		btn_boek.setOnAction(this);
		hbox.getChildren().add(btn_boek);
		
		btn_boek.setOnAction((ActionEvent e) -> {
			System.out.println("Boek");
		});
		
		Button btn_reset = new Button();
		btn_reset.setText("reset");
		btn_reset.setOnAction(this);
		hbox.getChildren().add(btn_reset);
		
		btn_reset.setOnAction((ActionEvent e) -> {
			System.out.println("Reset");
		});
		
		//root.getChildren().add(btn);
		//Scene scene = new Scene(root, 350, 175);
		Scene scene = new Scene(root, 350, 250);
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