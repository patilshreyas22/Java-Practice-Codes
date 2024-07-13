package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override

    public void start(Stage stage) throws Exception {

        VBox vb = new VBox();

        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.setSpacing(20);
        Button b = new Button("Hello!");

        Label lb = new Label("");
        
        b.setOnAction(e -> {
            lb.setText("Welcome to JavaFX Application");
        });

        vb.getChildren().addAll(b  , lb);
        
        Scene sc = new Scene(vb, 350, 300);
        stage.setScene(sc);
        stage.setTitle("JavaFX Application");
        stage.show();

    }

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        launch(args);
    }
}