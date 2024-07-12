import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class App extends Application {

    Button Subscribe;
    Button Demo;

    @Override
    public void start(Stage stage) throws Exception {

        Subscribe = new Button("Subscribe");
        Demo = new Button("Watch Demo");

        Subscribe.setPrefSize(100, 30);
        Demo.setPrefSize(100, 30);

        HBox hb = new HBox();
        hb.getChildren().addAll(Subscribe, Demo);
        hb.setPadding(new Insets(5, 10, 5, 10));
        hb.setSpacing(15);

        Subscribe.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Please proceed to payment");
            alert.showAndWait();
        });

        Demo.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Demo");
            alert.setHeaderText(null);
            alert.setContentText("You have 5 seconds of demo time.");
            alert.showAndWait();

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    
                        javafx.application.Platform.runLater(() -> {
                        Alert demoAlert = new Alert(AlertType.ERROR);
                        demoAlert.setTitle("Demo Over");
                        demoAlert.setHeaderText(null);
                        demoAlert.setContentText("Demo time is over. Please subscribe to watch further.");
                        demoAlert.showAndWait();
                    });
                }
            }, 5000);
        });

        Scene sc = new Scene(hb, 400, 400);
        stage.setScene(sc);
        stage.setTitle("Subscription Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
