import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        Button b = new Button("Click _Me");
        
        FlowPane fp = new FlowPane(b);
        
        Scene sc = new Scene(fp , 400 , 300); // this also takes the dimensions of the Scene(Window) as parameters 
        
        b.setTextFill(Color.BLUE); // color of the button
        
        b.setMnemonicParsing(true); //shortcut for the button 
        
        Tooltip tp = new Tooltip("Click this Button to Save Data");
        
        b.setTooltip(tp);   // When you hover your cursor on the button , it will show the message above 
        
        //b.setStyle("-fx-border-color:yellow;-fx-background-color:red;"); // color for the border of the button , this code line is basically is the CSS of javafx
        
        Alert a = new Alert(AlertType.INFORMATION,"BUTTON IS CLICKED");
        
        b.setOnAction(e->a.show());

        stage.setScene(sc);
        stage.show();
    }
    public static void main(String args []){

        launch(args);

    }

    


}