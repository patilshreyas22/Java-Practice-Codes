import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class App extends Application {

    Text t;
    RadioButton r1 , r2 , r3;
    CheckBox c1 , c2 , c3;
    ChoiceBox<Integer> cb;
    
    public void start(Stage stage)throws Exception{


        t = new Text("Application");
        HBox hb = new HBox();
        hb.getChildren().add(t);



        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        


        HBox hb1 = new HBox();
        hb1.setPadding(new Insets(10 , 20 , 10 , 20));
        hb1.getChildren().addAll(r1,r2,r3);

        


        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italic");
        HBox hb2 = new HBox();
        hb2.setPadding(new Insets(10 , 20 , 10 , 20));
        hb2.getChildren().addAll(c1,c2,c3);
        

        cb = new ChoiceBox<>();
        cb.getItems().addAll(10 , 20 , 30 , 50);
        
        VBox vb = new VBox();
        vb.getChildren().addAll(hb , hb1 , hb2 , cb);


        r1.setOnAction(e->{
            vb.setStyle("-fx-background-color: red;");
        });

        r2.setOnAction(e->{
            vb.setStyle("-fx-background-color: green;");
        });

        r3.setOnAction(e->{
            vb.setStyle("-fx-background-color: blue;");
        });

        

        

        Scene sc = new Scene(vb , 300 , 300);
        stage.setScene(sc);
        stage.show();
        
    }
    

    public static void main(String args []){

        launch(args);

    }
}
