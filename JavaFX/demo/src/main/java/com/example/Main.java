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
    public void init() throws Exception { // this inti method is overriden from the Application class , it has a
                                          // separate thread from the main thread , this inti method runs before the
                                          // launch(args) thread launches the application
                                          // so basically we can do connections in the init method , before the
                                          // application starts
        System.out.println("Before the App Starts");
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        Thread.sleep(5000);
    }

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

        vb.getChildren().addAll(b, lb);

        System.out.println("Thread Name : " + Thread.currentThread().getName());
        Scene sc = new Scene(vb, 350, 300);
        stage.setScene(sc);
        stage.setTitle("JavaFX Application");
        stage.show();

    }

    public static void main(String[] args) {

        System.out.println("Thread Name : " + Thread.currentThread().getName());
        launch(args);
        System.out.println("After the App is Closed");
    }
}