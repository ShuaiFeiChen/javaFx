package com.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		AnchorPane ap = new AnchorPane();
		
		Button btn = new Button("Hello");
		
		ap.getChildren().add(btn);
		
		ap.setTopAnchor(btn, 10.0);
		ap.setLeftAnchor(btn, 10.0);
		ap.setRightAnchor(btn, 10.0);
		ap.setBottomAnchor(btn, 10.0);
		
		Scene scene = new Scene(ap);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("fx01");
		primaryStage.setWidth(600);
		primaryStage.setHeight(600);
		primaryStage.show();
		
	}
}
