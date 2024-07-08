import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    Text t;
    RadioButton r1, r2, r3;
    CheckBox c1, c2, c3;
    ChoiceBox<Integer> cb;
    FontWeight fw = FontWeight.NORMAL;
    FontPosture fp = FontPosture.REGULAR;

    public void start(Stage stage) throws Exception {

        t = new Text("Application");
        HBox hb = new HBox();
        hb.getChildren().add(t);
        hb.setPadding(new Insets(5, 10, 5, 10));

        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);

        HBox hb1 = new HBox();
        hb1.setPadding(new Insets(10, 20, 10, 20));
        hb1.setSpacing(15);
        hb1.getChildren().addAll(r1, r2, r3);

        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italic");
        HBox hb2 = new HBox();
        hb2.setPadding(new Insets(10, 20, 10, 20));
        hb2.setSpacing(15);
        hb2.getChildren().addAll(c1, c2, c3);

        cb = new ChoiceBox<>();
        cb.getItems().addAll(10, 20, 30, 50);
        cb.setPadding(new Insets(5, 10, 5, 10));
        cb.getSelectionModel().selectFirst(); // Select the first item by default

        VBox vb = new VBox();
        vb.getChildren().addAll(hb, hb1, hb2, cb);
        vb.setPadding(new Insets(10, 10, 10, 10));

        r1.setOnAction(e -> vb.setStyle("-fx-background-color: red;"));
        r2.setOnAction(e -> vb.setStyle("-fx-background-color: green;"));
        r3.setOnAction(e -> vb.setStyle("-fx-background-color: blue;"));

        c2.setOnAction(e -> updateFont());
        c3.setOnAction(e -> updateFont());
        cb.setOnAction(e -> updateFont());

        Scene sc = new Scene(vb, 300, 300);
        stage.setScene(sc);
        stage.show();
    }

    private void updateFont() {
        if (c2.isSelected()) {
            fw = FontWeight.BOLD;
        } else {
            fw = FontWeight.NORMAL;
        }

        if (c3.isSelected()) {
            fp = FontPosture.ITALIC;
        } else {
            fp = FontPosture.REGULAR;
        }

        int fontSize = cb.getValue() != null ? cb.getValue() : 10; // Default font size if null
        t.setFont(Font.font("Times New Roman", fw, fp, fontSize));
    }

    public static void main(String args[]) {
        launch(args);
    }
}
