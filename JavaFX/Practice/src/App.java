import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        Button b = new Button("Click Me");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b);
        Scene sc = new Scene(fp); // you have to give the parameter for the Scene Method

        stage.setScene(sc);
        stage.show();
    }

    public static void main(String args []){

            launch(args);


    }

    


}