package com.example;

import javafx.application.Application;
import javafx.application.Platform;
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

    public void stop() {
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("In The Stop Method"); // this method here is overriden from the application class m it has
                                                  // the application thread and not the launcher thread which is for the
                                                  // init method , when the exit button is clicked it calls this method
                                                  // and does all the cleanup tasks and return to the main method , and
                                                  // exits the application

    }

    @Override

    public void start(Stage stage) throws Exception {

        Platform.setImplicitExit(false); //this method wont allow us to implicitly exit the application , we have to mannually exit by clikcing on the exit button

        VBox vb = new VBox();

        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.setSpacing(20);
        Button b = new Button("Hello!");
        Button b1 = new Button("Block");
        Button b2 = new Button("Exit Explicitly");

        Label lb = new Label("");

        b.setOnAction(e -> {
            lb.setText("Welcome to JavaFX Application");
        });

        b1.setOnAction(event -> {
            System.out.println("UI IS BLOCKED");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });

        b2.setOnAction(e -> {
            Platform.exit(); // Exiting Explicitly , THis Method here calls the Stop Method whcih is in the
                             // Applcation Class
        });

        vb.getChildren().addAll(b, lb, b1, b2);

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